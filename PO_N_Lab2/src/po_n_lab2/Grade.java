package po_n_lab2;

import java.util.Date;

public class Grade {
    private String subjectName;
    private Date date;
    private double value;

    public Grade() {}

    public Grade(String subjectName, double value, Date date) {
        this.subjectName = subjectName;
        this.date = date;
        this.value = value;
    }


    public String getSubjectName() {
        return this.subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
            " subjectName='" + getSubjectName() + "'" +
            ", date='" + getDate() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }

    public void details() {
        System.out.println(this);
    }
}