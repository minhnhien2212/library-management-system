import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date dob;
    private String phone;
    private String email;

    public Student(){}

    public Student(String name, Date dob, String phone, String email) {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy") ;
        return this.name + " - " + simpleDateFormat.format(this.dob) + " - " + this.phone + " - " + this.email + "\n";
    }
}
