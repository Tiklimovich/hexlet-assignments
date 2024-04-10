package exercise;

// BEGIN
public class Segment {
    private Point BeginPoint;
    private Point EndPoint;
    private Point MidPoint;

public Segment (Point point1, Point point2) {
    this.BeginPoint = point1;
    this.EndPoint = point2;
}

    public Point getBeginPoint() {
        return BeginPoint;
    }

    public Point getEndPoint() {
        return MidPoint;
    }
    public Point getMidPoint() {
        int newX = getBeginPoint().getX() + getEndPoint().getY() / 2;
        int newY = getBeginPoint().getY() + getEndPoint().getY() / 2;
        return new Point(newX, newY);
    }
}

// END
