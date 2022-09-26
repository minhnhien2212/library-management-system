import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManagement extends Menu implements Manageable {
    List<Book> books = new ArrayList<>();
    public BookManagement() {
//        books = new ArrayList<Book>();
//
//        // tao san mot vai cuon sach
//
//        Book b1 = new Book("b001", "Java", "Kim Dong", 2015);
//        Book b2 = new Book("b002", "C#", "NXB Tre", 2015);
//        Book b3 = new Book("b003", "Javascript", "Kim Dong", 2016);
//        Book b4 = new Book("b004", "PHP", "AlphaBooks", 2017);
//        Book b5 = new Book("b005", "C++", "Kim Dong", 2014);
//
//        books.add(b1);
//        books.add(b2);
//        books.add(b3);
//        books.add(b4);
//        books.add(b5);
    }

    @Override
    public void add() {
//        books = new ArrayList<>();
        // add tu ban phim
        Book newBook = input();
        books.add(newBook);
    }

    private Book input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book ID:");
        String bookID = sc.nextLine();
        System.out.print("Enter book title:");
        String title = sc.nextLine();
        System.out.print("Enter publisher:");
        String publisher = sc.nextLine();
        System.out.println("Enter publish year:");
        int year = Integer.parseInt(sc.next());

        Book newBook = new Book(bookID, title, publisher, year);

        return newBook;
    }

    @Override
    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id to search: ");
        String searchID = sc.next();

        Book searchBook = searchByID(searchID);

        if (searchBook != null)
            System.out.println(searchBook);
        else
            System.out.println("Book not found");
    }

    private Book searchByID(String searchID) {
        for (Book b : books) {
            if (b.getBookID().equals(searchID))
                return b;
        }
        return null;
    }

    @Override
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id to search: ");
        String searchID = sc.next();

        Book searchBook = searchByID(searchID);

        if (searchBook != null) {
            System.out.println("Update title: ");
            String titleUpdated = sc.nextLine();
            searchBook.setTitle(titleUpdated);
            System.out.println(searchBook.toString());
        } else {
            System.out.println("No book was found.");
        }
    }

    @Override
    public void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id to search: ");
        String searchID = sc.next();

        Book searchBook = searchByID(searchID);

        if (searchBook != null) {
            books.remove(searchBook);
            System.out.println("The remaining books are");
        }
        else {
            System.out.println("No book was found.");
        }
    }

    @Override
    public void displayAll() {
        sortByTitle();
        sortByYear();
        for (Book b: books) {
            System.out.println(b);
        }
    }

    public void sortByYear() {
        YearComparator yearComparator = new YearComparator();
        Collections.sort(books, yearComparator);

    }

    public void sortByTitle() {
        BookComparator bookComparator = new BookComparator();
        Collections.sort(books, bookComparator);
    }

    @Override
    public void saveFile() {
        try {
            FileWriter fileWriter = new FileWriter("kholuutru.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (Book b : books) {
                    bufferedWriter.write(b.toString());
                    bufferedWriter.newLine();
                }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException exception) {
            System.err.println("Khong ghi duoc du lieu");
            exception.printStackTrace();
        }
    }

    public void readFromFile() {
        try {
            FileReader fileReader = new FileReader("kholuutru.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String s;
            while ((s = reader.readLine()) != null) {
                String[] ss = s.split("-", 4);
                Book b = new Book(ss[0], ss[1], ss[2], Integer.parseInt(ss[3]));
                books.add(b);
            }
//            reader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
