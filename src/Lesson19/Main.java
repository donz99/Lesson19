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
    //class Main {
  public static void main(String[] args) {

    //7. Животные
// Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
// Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит". 
// Dog, Cat, Horse переопределяют методы makeNoise, eat. 
// Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
// Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location пришедшего на прием животного.
// В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
    
    System.out.println("Hello world!");
  }
}

class Animal {
  String name;
  String food;
  String location;

  public Animal(){}

  

  public Animal()

  public int makeNoise(){
    System.out.println(this.name +" спит. ZzZz");
    
  }

  public int eat (){
    
  }

  public void sleep (){
    
  }
  
}

class Dog extends Animal{
  
}

class Cat extends Animal {
  
}

class Horse extends Animal {
  
}


    
}
