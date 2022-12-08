public class Circle {

   public static final double PI=3.14;
     static double radius;

    public static double area(){
        return PI*(radius*radius);
    }

    public static double circumreference (){
        return PI*2*radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
