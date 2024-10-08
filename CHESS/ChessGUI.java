import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessGUI {

    private ChessGame game;
    private JFrame frame;
    private JButton[][] squares;
    private JPanel boardPanel;
    private JLabel statusLabel;
    private int startX = -1, startY = -1;

    public ChessGUI() {
        game = new ChessGame();
        initializeGUI();
    }

    private void initializeGUI() {
        frame = new JFrame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        
        boardPanel = new JPanel(new GridLayout(8, 8));
        squares = new JButton[8][8];
        
        statusLabel = new JLabel("White's move");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Initialize the board with buttons for each square
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JButton();
                squares[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                squares[i][j].setFocusPainted(false);
                squares[i][j].setBackground((i + j) % 2 == 0 ? Color.WHITE : Color.GRAY);
                
                int x = i;
                int y = j;

                // Add action listener to handle piece selection and movement
                squares[i][j].addActionListener(e -> handleSquareClick(x, y));
                
                boardPanel.add(squares[i][j]);
            }
        }

        frame.add(boardPanel, BorderLayout.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);
        updateBoard();
        frame.setVisible(true);
    }

    // Handle square click: selects piece and makes move
    private void handleSquareClick(int x, int y) {
        if (startX == -1 && startY == -1) {
            // Select piece
            if (game.board[x][y] != null && 
                game.board[x][y].isWhite() == game.isWhiteTurn) {
                startX = x;
                startY = y;
                squares[x][y].setBackground(Color.YELLOW);  // Highlight selected piece
            }
        } else {
            // Try to move piece
            if (game.movePiece(startX, startY, x, y)) {
                statusLabel.setText((game.isWhiteTurn ? "White's move" : "Black's move"));
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid move!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            resetHighlights();
            startX = -1;
            startY = -1;
            updateBoard();
        }
    }

    // Reset highlights after a move or selection
    private void resetHighlights() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j].setBackground((i + j) % 2 == 0 ? Color.WHITE : Color.GRAY);
            }
        }
    }

    // Update the board after a move
    private void updateBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece piece = game.board[i][j];
                if (piece == null) {
                    squares[i][j].setText("");
                } else {
                    squares[i][j].setText(piece.getSymbol());
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChessGUI::new);
    }
}
