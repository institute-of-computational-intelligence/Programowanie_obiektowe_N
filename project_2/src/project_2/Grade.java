import java.text.SimpleDateFormat;
import java.util.Date;


public class Grade {
    private String subjectName;
    private Date date;
    private double value;



    public Grade() {
        this.subjectName = "brak";
        this.date = new Date();
        this.value = 0.0;
    }

    public Grade(String subjectName, double value,  Date date ) {
        this.subjectName = subjectName;
        this.date = date;
        this.value = value;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public String toString() {
        return "Grade{" +
                "subjectName='" + subjectName + '\'' +
                ", date=" + sdf.format(date) +
                ", value=" + value +
                '}';
    }

    public void details()
    {
        System.out.println(this);
    }

}