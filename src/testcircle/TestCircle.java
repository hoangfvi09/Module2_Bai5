package testcircle;

public class TestCircle {
    private double radius;
    private String color;
    TestCircle(){
        this.radius=10;
    }
    public TestCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    public static void main(String[] args) {
        TestCircle circle=new TestCircle();
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());

    }
}
