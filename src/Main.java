/*4. Создать Main класс, в котором в методе public static void main(String[] args) {}
создать все три класса и вывести на печать результаты выполнения методов.*/
import java.util.Arrays;
public class Main {
    public static void main (String[]args){
        Square square = new Square(4,"Квадрат");
        Rectangle rectangle = new Rectangle(3,5,"Прямоугольник");
        Hexagon hexagon = new Hexagon(3,2, "Правильный шестиугольник");

        System.out.println("Периметр: " + square.perimeter());
        System.out.println("Площадь: " + square.area());
        System.out.println("Фигура: " + square.name());

        System.out.println("\nПериметр: " + rectangle.perimeter());
        System.out.println("Площадь: " + rectangle.area());
        System.out.println("Фигура: " + rectangle.name());

        System.out.println("\nПериметр: " + hexagon.perimeter());
        System.out.println("Площадь: " + hexagon.area());
        System.out.println("Фигура: " + hexagon.name());
    }
}
