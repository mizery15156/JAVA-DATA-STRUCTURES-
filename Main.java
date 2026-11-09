import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<String> books = new Stack<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int choice;
            System.out.println();
            System.out.println("====BOOK STACK MANAGEMENT====");
            System.out.println();
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. DISPLAY");
            System.out.println("5. EXIT");
            System.out.println();

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String bookn = sc.nextLine();
                    books.push(bookn);
                    System.out.print(bookn + " added to Stack!");
                    System.out.println();
                    break;
                case 2:
                    if (!books.empty()) {
                        System.out.print(books.pop() + " removed from stacks!");
                    } else {
                        System.out.print("Stack is empty!");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (!books.empty()) {
                        System.out.print("Top Book: " + books.peek());
                    } else {
                        System.out.print("Stack is empty! Nothing to display");
                    }
                    System.out.println();
                    break;

                case 4:
                    if (!books.empty()) {
                        System.out.print("Books in stack: " + books);
                    } else {
                        System.out.print("Stack is empty");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Program Terminated.");
                    sc.close();
                    return;
                default:
                    System.out.print("Invalid Choice");
            }
        }
    }
}