import java.util.Scanner;
public class Curry extends Mains {

    private String menu_item_number;
    private String size;
    private String curry_type;


    public Curry(String menu_item_number, String size, String curry_type) {
        super(menu_item_number, size);
        this.curry_type = curry_type;
    }

    @Override
    public String toString() {
        return "Curry:" + super.toString() + "," + curry_type;
    }

    public String getMenu_item_number() {
        return super.getMenu_item_number();
    }
}

