public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * getRadius() * height) + (super.getArea() * 2);
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {      // in Cylinder class
        return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
                + " height=" + height;
    }
}
