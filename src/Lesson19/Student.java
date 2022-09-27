package Lesson19;

public class Student {
    protected String firstName;
    protected String lastName;
    protected int group;
    protected double averageMark;

    public String getFirstName() {        return firstName;    }
    public void setFirstName(String firstName) {        this.firstName = firstName;    }
    public String getLastName() {        return lastName;    }
    public void setLastName(String lastName) {        this.lastName = lastName;    }
    public int getGroup() {        return group;    }
    public void setGroup(int group) {        this.group = group;    }
    public double getAverageMark() {        return averageMark;    }
    public void setAverageMark(double averageMark) {        this.averageMark = averageMark;    }

    public Student(){}

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}';
    }

    public int getScholarShip(){
        int grant;
        if (Math.abs(averageMark - 5.0) < 1E-5){
            grant=100;
        }
        else{
            grant=80;
        }
        return grant;
    }
}
