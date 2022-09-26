import java.util.Date;

public class Borrow {
    private String bookID;
    private String studentID = null;
    private Date dateBorrow = null;
    private Date dateReturn = null;
    private boolean status = true;

    public Borrow(String bookID, String studentID, Date dateBorrow, Date dateReturn, boolean status) {
        this.bookID = bookID;
        this.studentID = studentID;
        this.dateBorrow = dateBorrow;
        this.dateReturn = dateReturn;
        this.status = status;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.bookID + " - "
                + this.studentID + " - "
                + this.dateBorrow + " - "
                + this.dateReturn + " - "
                + this.status;
    }
}
