//2. Создать три (квадрат, прямоугольник, правильный шестиугольник) класса, которые реализуют интерфейс фигура.
//3. В классах должен быть конструктор, который на вход принимает все необходимые параметры (стороны, имя и т.д.)
class Square implements Shape {
    int length;
    String name;

    Square(int l, String n) {
        this.length = l;
        this.name = n;
    }

    @Override
    public int perimeter() {
        return (length*4);
    }

    @Override
    public int area() {
        return (length*length);
    }

    @Override
    public String name() {
        return (name);
    }
}
