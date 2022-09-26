import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManagement bookManagement = new BookManagement();
        Manageable studentManagement = new StudentManagement();
        Manageable borrowManagement = new BorrowManagement();

        System.out.println("1- Book Management");
        System.out.println("2- Student Management");
        System.out.println("3- Borrow Management");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                bookManagement.menu("Book management");
                break;
            case 2:
                studentManagement.menu("Student management");
                break;
            case 3:
                borrowManagement.menu("Borrow Management");
                break;
        }
    }
}
