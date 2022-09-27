package Lesson19;

public class Main {
    public static void main(String[] args) {
        final int size = 2;
        Student[] mas = new Student[size];
        Student s1 = new Student("Иван", "Дорн", 3, 4.5);
        Aspirant a1 = new Aspirant("Иван", "Дорн", 3, 5.0);
        mas[0] = s1;
        mas[1] = a1;
        Student q1 = new Aspirant("Igor", "Bichukov", 22, 4.0);
        System.out.println(q1.getScholarShip());
        for (Student s:mas) {
            System.out.println(s);
            System.out.println("grant=" + s.getScholarShip());
        }

    }
}
