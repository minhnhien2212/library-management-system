import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BorrowManagement extends Menu implements Manageable {

    List<Borrow> borrowBooks;

    public BorrowManagement() {

        borrowBooks = new ArrayList<Borrow>();

        // tao san mot vai cuon sach

        Borrow b1 = new Borrow("b001",null, null, null, true);
        Borrow b2 = new Borrow("b002", null, null, null, true);
        Borrow b3 = new Borrow("b003", null, null, null, true);
        Borrow b4 = new Borrow("b004", null, null, null, true);
        Borrow b5 = new Borrow("b005", null, null, null, true);

        borrowBooks.add(b1);
        borrowBooks.add(b2);
        borrowBooks.add(b3);
        borrowBooks.add(b4);
        borrowBooks.add(b5);
    }

    @Override
    public void add() {
        Borrow borrowedBook = input();
        borrowBooks.add(borrowedBook);
    }

    private Borrow input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book ID:");
        String bookID = sc.next();
        System.out.println("Enter student ID:");
        String studentID = sc.nextLine();
        System.out.println("Enter borrow date:");
        String borrowDate = sc.next();
        System.out.println("Enter return date:");
        String returnDate = sc.next();

        Borrow newBorrow = new Borrow(bookID, studentID, new Date(borrowDate), new Date(returnDate), false);

        return newBorrow;
    }

    @Override
    public void search() {

    }

    @Override
    public void update() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void displayAll() {

    }
}
