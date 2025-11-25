package U1P1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

/**
 * IB DP Computer Science - Mini Lesson
 * Introduction to Exception Handling (Try-Catch)
 * * Goal: Understand how to prevent programs from crashing when errors occur.
 */
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        System.out.println("--- EXCEPTION HANDLING DEMO ---\n");

        // STEP 1: Uncomment this to see a program crash
        // demo_1_TheCrash();

        // STEP 2: Uncomment this to see how we fix it
        //demo_2_TheFix();

        // STEP 3: A preview of why we need this for Files
        demo_3_FilePreview();

        System.out.println("\n--- END OF DEMO ---");
    }

    /**
     * DEMO 1: The Crash
     * This method performs a dangerous math operation without safety gear.
     */
    public static void demo_1_TheCrash() {
        System.out.println("Running: The Crash...");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to divide 100 by: ");
        int divisor = scan.nextInt();

        // RISKY LINE: If user types 0, this explodes.
        int result = 100 / divisor;

        System.out.println("Result is: " + result);
        System.out.println("Success! (You will not see this if it crashes)");
    }

    /**
     * DEMO 2: The Fix (Try-Catch)
     * This method wraps the risky code in a safety block.
     */
    public static void demo_2_TheFix() {
        System.out.println("Running: The Fix...");
        Scanner scan = new Scanner(System.in);

        try {
            // --- DANGER ZONE START ---
            System.out.print("Enter a number to divide 100 by: ");
            int divisor = scan.nextInt();

            int result = 100 / divisor;

            System.out.println("Result is: " + result);
            // --- DANGER ZONE END ---

        } catch (ArithmeticException e) {
            // This block runs ONLY if math fails (divide by zero)
            System.out.println("ERROR: You cannot divide by zero!");

        } catch (InputMismatchException e) {
            // This block runs ONLY if user types text instead of a number
            System.out.println("ERROR: Please enter a whole number, not text.");

        } catch (Exception e) {
            // This catches ANY other error not listed above
            System.out.println("Something else went wrong: " + e.getMessage());
        }

        System.out.println("Program continues safely after the error...");
    }

    /**
     * DEMO 3: File Preview
     * Java forces us to use try-catch for files.
     */
    public static void demo_3_FilePreview() {
        System.out.println("Running: File Preview...");

        File missingFile = new File("ghost_file.txt");

        try {
            // This line is "Checked". Java compiler knows it's risky.
            // If you delete the try-catch, Java will refuse to compile this line.
            Scanner fileReader = new Scanner(missingFile);

        } catch (FileNotFoundException e) {
            System.out.println("FILE ERROR: Could not find that file.");
            System.out.println("Java says: " + e.getMessage());
        }
    }
}