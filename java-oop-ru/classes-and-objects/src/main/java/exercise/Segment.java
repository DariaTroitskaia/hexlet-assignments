package exercise;

// BEGIN
public class Segment {
    Point point1;
    Point point2;
    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Point getBeginPoint() {
        if(point1.getX() < point2.getX()) {
            return point1;
        } else if (point1.getX() > point2.getX()) {
            return point2;
        } else {
            return point1;
        }
    }

    public Point getEndPoint() {
        if(point1.getX() > point2.getX()) {
            return point1;
        } else if (point1.getX() < point2.getX()) {
            return point2;
        } else {
            return point2;
        }
    }

    public Point getMidPoint() {
        int midPointX = point1.getX() / 2 + point2.getX() / 2;
        int midPointY = point1.getY() / 2 + point2.getY() / 2;
        return new Point(midPointX, midPointY);
    }
}
// END
