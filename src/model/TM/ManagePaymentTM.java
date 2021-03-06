package model.TM;

public class ManagePaymentTM{
    private String date;
    private String courseID;
    private String studentNIC;
    private int amount;
    private String name;

    public ManagePaymentTM(String date, String courseID, String studentNIC, int amount, String name) {
        this.date = date;
        this.courseID = courseID;
        this.studentNIC = studentNIC;
        this.amount = amount;
        this.name = name;
    }

    public ManagePaymentTM() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getStudentNIC() {
        return studentNIC;
    }

    public void setStudentNIC(String studentNIC) {
        this.studentNIC = studentNIC;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ManagePaymentTM{" +
                "date='" + date + '\'' +
                ", courseID='" + courseID + '\'' +
                ", studentNIC='" + studentNIC + '\'' +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                '}';
    }
}
