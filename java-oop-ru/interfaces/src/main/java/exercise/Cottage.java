package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }

    public int compareTo(Home another) {
        return Double.compare(getArea(), another.getArea());
    }
}

// END
