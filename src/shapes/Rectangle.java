package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    public int getArea(){
        return length*width;
    }

    public int getPerimeter(){
        return (length*2)+(width*2);
    }
}