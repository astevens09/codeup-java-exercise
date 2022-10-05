package shapes;

public class Square extends Rectangle{

    public int side;
    public Square(int s){
        super(s,s);
        side = s;
    }


    public int getArea() {
        return 4*side;
    }

    public int getPerimeter(){
        return (int)Math.pow(side,2);
    }
}