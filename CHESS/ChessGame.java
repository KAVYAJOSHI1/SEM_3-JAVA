import java.util.Scanner;

public class ChessGame {

    // Define the board as an 8x8 2D array of Pieces
    private Piece[][] board = new Piece[8][8];
    private boolean isWhiteTurn = true;  // White always goes first

    public ChessGame() {
        initializeBoard();
    }

    // Method to initialize the chessboard
    private void initializeBoard() {
        // Initialize Pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(true);  // White pawns
            board[6][i] = new Pawn(false); // Black pawns
        }

        // Initialize Rooks
        board[0][0] = new Rook(true);
        board[0][7] = new Rook(true);
        board[7][0] = new Rook(false);
        board[7][7] = new Rook(false);

        // Initialize Knights
        board[0][1] = new Knight(true);
        board[0][6] = new Knight(true);
        board[7][1] = new Knight(false);
        board[7][6] = new Knight(false);

        // Initialize Bishops
        board[0][2] = new Bishop(true);
        board[0][5] = new Bishop(true);
        board[7][2] = new Bishop(false);
        board[7][5] = new Bishop(false);

        // Initialize Queens
        board[0][3] = new Queen(true);
        board[7][3] = new Queen(false);

        // Initialize Kings
        board[0][4] = new King(true);
        board[7][4] = new King(false);
    }

    // Function to print the current state of the board
    public void printBoard() {
        System.out.println("  a  b  c  d  e  f  g  h");
        for (int i = 0; i < 8; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print("-- ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            System.out.println(8 - i);
        }
        System.out.println("  a  b  c  d  e  f  g  h");
    }

    // Method to move a piece
    public boolean movePiece(int startX, int startY, int endX, int endY) {
        Piece piece = board[startX][startY];
        if (piece == null) {
            System.out.println("No piece at starting position!");
            return false;
        }

        // Check if it's the player's turn to move that color
        if (piece.isWhite() != isWhiteTurn) {
            System.out.println("Not your turn!");
            return false;
        }

        // Check if the move is valid for the piece
        if (!piece.isValidMove(startX, startY, endX, endY, board)) {
            System.out.println("Invalid move!");
            return false;
        }

        // Check if the target square is occupied by the same color
        Piece targetPiece = board[endX][endY];
        if (targetPiece != null && targetPiece.isWhite() == piece.isWhite()) {
            System.out.println("Invalid move! You cannot move onto your own piece.");
            return false;
        }

        // Move the piece
        board[endX][endY] = piece;
        board[startX][startY] = null;

        // Change turn
        isWhiteTurn = !isWhiteTurn;
        return true;
    }

    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            game.printBoard();
            System.out.println((game.isWhiteTurn ? "White's" : "Black's") + " move");
            System.out.print("Enter move (e.g., e2 e4): ");
            String move = scanner.nextLine().trim();  // Trim any extra spaces
            
            // Ensure the move is of correct length and format
            if (move.length() != 5 || move.charAt(2) != ' ') {
                System.out.println("Invalid move format! Please use 'e2 e4'.");
                continue;
            }

            try {
                // Parse the move into coordinates
                int startX = 8 - (move.charAt(1) - '0');  // Convert 'e2' to array indices
                int startY = move.charAt(0) - 'a';
                int endX = 8 - (move.charAt(4) - '0');
                int endY = move.charAt(3) - 'a';

                // Ensure valid indices
                if (startX < 0 || startX > 7 || startY < 0 || startY > 7 ||
                    endX < 0 || endX > 7 || endY < 0 || endY > 7) {
                    System.out.println("Invalid move! Out of bounds.");
                    continue;
                }

                // Perform the move
                game.movePiece(startX, startY, endX, endY);
            } catch (Exception e) {
                System.out.println("Error parsing move: " + e.getMessage());
            }
        }
    }
}

// Base class for all pieces
abstract class Piece {
    private boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    // Abstract method to be overridden by specific pieces
    public abstract boolean isValidMove(int startX, int startY, int endX, int endY, Piece[][] board);
    public abstract String getSymbol();
}

// Pawn class implementation
class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Piece[][] board) {
        // Define direction based on color
        int direction = isWhite() ? 1 : -1;  // White moves down (1), Black moves up (-1)

        // Single forward move
        if (startX + direction == endX && startY == endY && board[endX][endY] == null) {
            return true;
        }
        
        // Double forward move (only from the starting position)
        if (startX == (isWhite() ? 1 : 6) && startX + (2 * direction) == endX && startY == endY && board[endX][endY] == null) {
            return board[startX + direction][startY] == null; // Ensure the space in front is empty
        }

        // Capture move
        if (startX + direction == endX && Math.abs(startY - endY) == 1 && 
            board[endX][endY] != null && board[endX][endY].isWhite() != this.isWhite()) {
            return true;
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "WP" : "BP";
    }
}

// Rook class implementation
class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Piece[][] board) {
        // Rook moves either horizontally or vertically
        if (startX == endX || startY == endY) {
            // Check for obstacles along the path
            return !isObstructed(startX, startY, endX, endY, board);
        }
        return false;
    }

    private boolean isObstructed(int startX, int startY, int endX, int endY, Piece[][] board) {
        if (startX == endX) {
            for (int j = Math.min(startY, endY) + 1; j < Math.max(startY, endY); j++) {
                if (board[startX][j] != null) return true;
            }
        } else {
            for (int i = Math.min(startX, endX) + 1; i < Math.max(startX, endX); i++) {
                if (board[i][startY] != null) return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "WR" : "BR";
    }
}

// Knight class implementation
class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Piece[][] board) {
        // Knights move in an "L" shape
        return (Math.abs(startX - endX) == 2 && Math.abs(startY - endY) == 1) ||
               (Math.abs(startX - endX) == 1 && Math.abs(startY - endY) == 2);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "WN" : "BN";
    }
}

// Bishop class implementation
class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Piece[][] board) {
        // Bishop moves diagonally
        if (Math.abs(startX - endX) == Math.abs(startY - endY)) {
            // Check for obstacles along the diagonal
            return !isObstructed(startX, startY, endX, endY, board);
        }
        return false;
    }

    private boolean isObstructed(int startX, int startY, int endX, int endY, Piece[][] board) {
        int xDirection = (endX - startX) > 0 ? 1 : -1;
        int yDirection = (endY - startY) > 0 ? 1 : -1;

        int x = startX + xDirection;
        int y = startY + yDirection;

        while (x != endX && y != endY) {
            if (board[x][y] != null) return true;
            x += xDirection;
            y += yDirection;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "WB" : "BB";
    }
}

// Queen class implementation
class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Piece[][] board) {
        // Queen moves like both a Rook and a Bishop
        Rook tempRook = new Rook(isWhite());
        Bishop tempBishop = new Bishop(isWhite());

        return tempRook.isValidMove(startX, startY, endX, endY, board) ||
               tempBishop.isValidMove(startX, startY, endX, endY, board);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "WQ" : "BQ";
    }
}

// King class implementation
class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Piece[][] board) {
        // King moves one square in any direction
        return Math.abs(startX - endX) <= 1 && Math.abs(startY - endY) <= 1;
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "WK" : "BK";
    }
}
