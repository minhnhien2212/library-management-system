import java.util.Comparator;

public class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getYear() < b2.getYear()) return -1;
        if (b1.getYear() > b2.getYear()) return 1;
        return 0;
    }
}
