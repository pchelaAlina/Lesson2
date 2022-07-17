//2. Создать три (квадрат, прямоугольник, правильный шестиугольник) класса, которые реализуют интерфейс фигура.
//3. В классах должен быть конструктор, который на вход принимает все необходимые параметры (стороны, имя и т.д.)
public class Hexagon implements Shape {
    int length;
    int radius;
    String name;

    Hexagon(int l, int r, String n) {
        this.length = l;
        this.radius = r;
        this.name = n;
    }

    @Override
    public int perimeter() {
        return (6*length);
    }

    @Override
    public int area() {
        return (3*length*radius);
    }

    @Override
    public String name() {
        return (name);
    }
}