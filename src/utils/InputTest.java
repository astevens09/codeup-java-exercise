import utils.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        input.yesNo();
        input.getDouble();
        input.getDouble(3,10);
        input.getInt();
        input.getInt(7,15);

    }
}