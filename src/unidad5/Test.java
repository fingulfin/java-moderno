package unidad5;

import records.Book;
import records.Dish;

import java.time.LocalDateTime;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        var r=new User("juan",true, LocalDateTime.now());

        Container<String> contenido=new Container<>("Hola mundo","");
        var r2=new User("",false, LocalDateTime.now());

        //Libros
        List<Book> libros=List.of(new Book("Las mil y una nches", "Desconocido", 1800 , "Fantasia"),
                new  Book("Hidden true","Steven Greer" ,1998 , "Documental"),
                new  Book("The Way Of The explorer","Edgar Mitchell", 2008 , "Documental"),
                new  Book("Abduction","John Mack", 1995 , "Documental"));

        List<Dish> menu = List.of(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );


    }
}
