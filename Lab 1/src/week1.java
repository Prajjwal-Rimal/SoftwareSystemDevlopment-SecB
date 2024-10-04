abstract class Shape { // abstract class shape
    private int sides;

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    abstract public int getArea(); // abstract method area

    Shape(int sides) { // parametarized constructor of class sides
        this.sides = sides;
    }
}

class Rectangle extends Shape{
    private int length;
    private int breadth;

    public int getBreath() {
        return breadth;
    }

    public void setBreath(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    Rectangle() { // constructor of rectangle class -- calling constructor in constructor
        super(4); // calling the parametarized constructor
    }
    
    public int getArea() {// method overriding
        return this.length * this.breadth;
    }
}

class Circle extends Shape{
    private int radius;

    int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    Circle() { // constructor of circle class -- calling constructor in constructor
        super(0);
    }

    public int getArea() {// method overriding -- cant return the return type as method overridding
        return (int) (3.14*(radius*radius));
    }
}

class Ellipse extends Rectangle{
    public int getArea() {// method overriding
        return (int) (3.14*(getLength()*getBreath()));
    }
}

public class week1{
    public static void main(String[]args){

        Rectangle areaR = new Rectangle();
        areaR.setLength(4);
        areaR.setBreath(6);
        int area = areaR.getArea();
        System.out.println(" The are of the rectangle is " + area);

        Circle areaC = new Circle();
        areaC.setRadius(3);
        int areaCircle = areaC.getArea();
        System.out.println(" The area of the circle is "+areaCircle);

        Ellipse areaE = new Ellipse();
        areaE.setLength(5);
        areaE.setBreath(6);
        int areaOfEllipse= areaE.getArea();
        System.out.println(" The area of ellipse is "+areaOfEllipse);
    }
}