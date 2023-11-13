package at.htlleonding.demo.equals;

public class Point {

    private int x;
    private int y;

    //region Constructors
    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //endregion

    //region Getter and Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //endregion

    Object object;

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Point p2) {
            if (this.getX() == p2.getX()
                    && this.getY() == p2.getY()) {
                return true;
            }
        }
        return false;


    }
}
