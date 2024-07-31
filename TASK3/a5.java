/*5. Write a Java program to demonstrate garbage collection by creating a class a5 with a
finalize method that prints a message when the object is garbage collected. Create and nullify an
instance of a5 to trigger garbage collection.*/
public class a5 {
    // Constructor
    public a5() {
        System.out.println("a5 object created");
    }

    // Override finalize method to display a message when the object is garbage collected
    @Override
    protected void finalize() {
        System.out.println("a5 object is being garbage collected");
    }

    public static void main(String[] args) {
        // Create an instance of a5
        a5 obj = new a5();

        // Nullify the reference to the a5 object
        obj = null;

        // Suggest to the JVM to run the garbage collector
        System.gc();

        // Pause the program for a short while to allow time for garbage collection to occur
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Do nothing
        }

        System.out.println("End of main method");
    }
}
