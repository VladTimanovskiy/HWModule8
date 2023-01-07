package module8;

public class Main {
    public static void main(String[] args) {
    printShapeName( new Circle());
    printShapeName(new Quad());
    printShapeName(new Qube());
    printShapeName(new Rectangle());
    printShapeName(new Triangle());
    }
    private static void printShapeName(Shape shape){
        System.out.println(shape.getName());
    }
}
