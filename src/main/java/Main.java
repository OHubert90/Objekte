import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car01 = new Car();
        Car car02 = new Car();
        Person person01 = new Person("Martin", 18, true);
        Book herrDerRinge = new Book("Herr der Ringe", "unbekannt",666);
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 123456789);
        List<Book> books = new ArrayList<>();
        books.add(herrDerRinge);
        books.add(harryPotter);
        Library library = new Library(books);



        car01.startStopCar();
        System.out.println(car01.engine);
        if(car01.engine == true){
            System.out.println("Motor ist an.");
        }
        else
        System.out.println("Motor ist aus.");

        car01.startStopCar();
        System.out.println(car01.engine);
        if(car01.engine == true){
            System.out.println("Motor ist an.");
        }
        else
            System.out.println("Motor ist aus.");

        car02.increaseSpeed();
        System.out.println(car02.speed);
        car02.increaseSpeed();
        System.out.println(car02.speed);
        car02.decreaseSpeed();
        System.out.println(car02.speed);

        System.out.println("Hallo ich bin" + person01.getName() +
                "ich bin" + person01.getAge()
                + (person01.isGender() ? " ein Mann" : " eine Frau" ));

        System.out.println(herrDerRinge);
        System.out.println(books);
        System.out.println(library);

    }
}
