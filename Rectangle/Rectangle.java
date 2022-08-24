package Week2.Day6.Rectangle;

public class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void calculateArea() {
        int area  = this.getLength() * this.getBreadth();
        System.out.println("The area of rectangle is :: "+area);
    }

}
