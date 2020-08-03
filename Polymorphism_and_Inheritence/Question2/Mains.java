public class Mains {
    public String menu_item_number ;
    public String size;


    public Mains(String menu_item_number, String size) {
        this.menu_item_number = menu_item_number;
        this.size = size;
    }


    public String toString(){
        return menu_item_number + ", " + size;
    }

    public String getMenu_item_number(){
        return menu_item_number;
    }
}

