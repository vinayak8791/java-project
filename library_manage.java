import java.util.ArrayList;
import java.util.Scanner;

class Management {
    ArrayList<String> books;

    Management() {
        books = new ArrayList<>();
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your book name: ");
        String bookName = sc.nextLine();

        books.add(bookName);
        System.out.println("Book added successfully!");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("Books in the library:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    public void removeBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book to remove: ");
        String bookToRemove = sc.nextLine();

        if (books.remove(bookToRemove)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void issueBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book to issue: ");
        String bookToIssue = sc.nextLine();

        if (books.contains(bookToIssue)) {
            books.remove(bookToIssue);
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Sorry, this book is not available.");
        }
    }
    public void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book to return: ");
        String returnedBook = sc.nextLine();

        if (books.contains(returnedBook)) {
            System.out.println("This book is already in the library.");
        } else {
            books.add(returnedBook);
            System.out.println("Book returned successfully.");
        }
    }
}

public class library_manage {
    public static void main(String[] args) {
        Management m = new Management();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Library Menu -----");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Remove Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    m.addBook();
                    break;
                case 2:
                    m.showBooks();
                    break;
                case 3:
                    m.removeBook();
                    break;
                case 4:
                    m.issueBook();
                    break;
                case 5:
                    m.returnBook();
                    break;
                case 6:
                    System.out.println("Exiting Library System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);
    }
}
