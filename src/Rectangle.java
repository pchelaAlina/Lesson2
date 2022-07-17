//2. Создать три (квадрат, прямоугольник, правильный шестиугольник) класса, которые реализуют интерфейс фигура.
//3. В классах должен быть конструктор, который на вход принимает все необходимые параметры (стороны, имя и т.д.)
class Rectangle implements Shape {
    int length;
    int width;
    String name;
    Rectangle(int l, int w, String n){
        this.length = l;
        this.width = w;
        this.name=n;
    }
    @Override
    public int perimeter() {
        return ((length+width)*2);
    }

    @Override
    public int area() {
        return (length*width);
    }

    @Override
    public String name() {
        return (name);
    }
}
