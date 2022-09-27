package Lesson19;

public class Aspirant extends Student{
    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, int group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public int getScaholarship() {
        int grant;
        if (Math.abs(averageMark - 5.0) < 1E-5){
            grant=200;
        }
        else{
            grant=180;
        }
        return grant;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}';
    }
}
