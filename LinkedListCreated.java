import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/**
 * This program is designed to be a simple linked list created when it detects input from the user one at a time,
 * stores them in a LinkedList, sorts the list in ascending order just like GK specified,
 * and prints the result.
 * 
 * This was intended to utilize the simple pre-built collections such as linked list instead of implementing one the hard way,
 * which would involve creating a Node class too. To further elaborate...
 * This program reuses the Java Collections Framework rather than reinventing
 * the Linked List (next week it'll be a Stack) from scratch. The LinkedList class abstracts away node 
 * management, and Collections.sort() handles sorting to see the numbers in ascending order. 
 * 
 *
 * The program stops input when a non-integer is entered( anything but integers ie. "/", "=", "k", "-").
 * Designed to follow SOLID principles and be easily adaptable for future requirements such as switching to a Stack. 
 * 
 * @author Ephraim Duncan
 * @version 1.0.0
 * @since Week 4 of CSC6301
 * date: 06-10-2025
 */
public class LinkedListCreated {

    /**
     * The start of this simple linked list program.
     * Initializes a LinkedList, collects input, and displays the sorted list.
     *
     * @param args Type in the command-line for input  (not used in this program).
     */
    public static void main(String[] args) {
        // Reusing the LinkedList class from the Java Collections Framework
        List<Integer> numberList = new LinkedList<>();
        addIntegers(numberList); // Read input and populate the list
        showList(numberList);  // Sort and display the list
    }

    /**
     * Reads integers from the user using Scanner when prompted.
     * Input continues until the user enters a non-integer like a letter or symbol.
     *
     * @param numberList The list to which input integers will be added.
     */
    private static void addIntegers(List<Integer> numberList) {
        // Using built-in scanner parsing to avoid writing a parser which would take more lines of code.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers one at a time. Enter a non-integer to finish:");
        while (scanner.hasNextInt()) {
            numberList.add(scanner.nextInt());
        }
        scanner.close();
    }

    /**
     * Sorts the list of integers and prints it.
     *
     * @param numberList The list of integers to be sorted and displayed.
     */
    private static void showList(List<Integer> numberList) {
        // Using Collections.sort() to reuse the built-in sorting algorithm instead of implementing one.
        Collections.sort(numberList);
        System.out.println("The sorted list is: " + numberList);
    }
}
