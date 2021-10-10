
public class Cricle {

    private int radius;

    public Cricle(int radius) {
        this.radius = radius;
    }

    public  double calculateArea()
    {
        return (radius*radius)*Math.PI;
    }
    public double  calculatePerimeter()
    {
        return  (radius*2)*Math.PI;
    }
}
