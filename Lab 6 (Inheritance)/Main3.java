abstract class Figure {
    int dim1, dim2;

    Figure(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Square extends Figure {
    Square(int side) {
        super(side, side);
    }

    double area() {
        return dim1 * dim1;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Figure f;
        f = new Rectangle(10, 20);
        System.out.println("Rectangle Area: " + f.area());

        f = new Triangle(10, 15);
        System.out.println("Triangle Area: " + f.area());

        f = new Square(10);
        System.out.println("Square Area: " + f.area());
    }
}