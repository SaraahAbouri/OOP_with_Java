import java.util.Scanner;

public class Pizza extends Mains {
    private String base;
    private String extra_cheese;
    private String extra_garlic;


    public Pizza(String menu_item_number, String size, String base, String extra_cheese, String extra_garlic) {
        super(menu_item_number, size);
        this.base = base;
        this.extra_cheese = extra_cheese;
        this.extra_garlic = extra_garlic;
    }

    @Override
    public String toString() {
        return "Pizza: " + super.toString() + ", " + base + "," + extra_cheese + "," + extra_garlic;
    }

    public String getMenu_item_number() {
        return super.getMenu_item_number();
    }
}

