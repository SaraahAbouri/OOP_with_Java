class SoftDrink extends Mains {
    private String menu_item_number;
    private String size;
    private String flavour;
    private String bottle_or_can;

    public SoftDrink(String menu_item_number, String size, String flavour, String bottleOrCan) {
        super(menu_item_number, size);
        this.flavour = flavour;
        this.bottle_or_can = bottleOrCan;
    }

    public String toString() {
        return "Soft Drink: " + super.toString() + ", " + flavour + ", " + bottle_or_can;
    }

    public String getMenu_item_number() {
        return super.getMenu_item_number();
    }

}
