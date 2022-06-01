package ge.ufc.homework4;

class Rectangle {
    private static final double MAX_LENGTH;
    private static final double MAX_WIDTH;

    private double width;
    private double length;


    static {
        MAX_LENGTH = 26;
        MAX_WIDTH = 18;
    }
    public Rectangle(double length){
        this.length = length;
        if(length >= MAX_LENGTH){
            this.length = MAX_LENGTH;
        }
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        if(length >= MAX_LENGTH){
            this.length = MAX_LENGTH;
        }
        if(width >= MAX_WIDTH){
            this.width = MAX_WIDTH;
        }
    }

    public Rectangle() {
        width = 16;
        if(this.width >= width){
            this.width = MAX_WIDTH;
        }
    }

    public void setWidth(double width) {
        if(width >= MAX_WIDTH){
            this.width = MAX_WIDTH;
        }
    }

    public void setLength(double length) {
        if(length >= MAX_LENGTH){
            this.length = MAX_LENGTH;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public static Rectangle maxArea(Rectangle[] arr){
        Rectangle maxArea = arr[0];
        for (Rectangle rec:
             arr) {
            if (rec.getArea() > maxArea.getArea() ){
                maxArea = rec;
            }
        }
        return maxArea;
    }

}
