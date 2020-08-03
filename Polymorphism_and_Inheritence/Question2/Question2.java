import java.util.*;
import java.util.Scanner;

public class Question2{
    public static String menu_item_number;
    public static String menu_item_number1;
    public static String menu_item_number2;

    public static <Int> void main(String[] args){
        ArrayList<Mains> MenuList = new ArrayList<Mains>();
        Scanner sc = new Scanner(System.in);
        boolean scan = false;

        System.out.println("Welcome to Great International Food Court");
        System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");

        String A = sc.nextLine();

        do{
            //String menu_item_number = sc.nextLine();
            //String menu_item_number1 = sc.nextLine();
            //String menu_item_number2 = sc.nextLine();

            if (A.equals("p")){
                System.out.println("Enter the menu item number");
                menu_item_number = sc.nextLine();
                System.out.println("Enter the size");
                String size = sc.nextLine();
                System.out.println("Enter the base");
                String base = sc.nextLine();
                System.out.println("Enter extra cheese");
                String extra_cheese = sc.nextLine();
                System.out.println("Enter extra garlic");
                String extra_garlic = sc.nextLine();
                System.out.println("Done");

                Pizza pizza = new Pizza(menu_item_number, size, base, extra_cheese, extra_garlic);
                MenuList.add(pizza);

                System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
                A = sc.nextLine();
            }

            if (A.equals("c")){
                System.out.println("Enter the menu item number");
                menu_item_number1 = sc.nextLine();
                System.out.println("Enter the size");
                String size = sc.nextLine();
                System.out.println("Enter the curry type");
                String curry_type = sc.nextLine();

                Curry curry = new Curry(menu_item_number, size, curry_type);
                MenuList.add(curry);

                System.out.println("Done");
                System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
                A = sc.nextLine();

            }

            if (A.equals("s")){
                System.out.println("Enter the menu item number");
                menu_item_number2 = sc.nextLine();
                System.out.println("Enter the size");
                String size = sc.nextLine();
                System.out.println("Enter the flavour");
                String flavour = sc.nextLine();
                System.out.println("Enter whether it is a bottle or can");
                String bottle_or_can = sc.nextLine();

                SoftDrink softDrink = new SoftDrink(menu_item_number2, size, flavour, bottle_or_can);
                MenuList.add(softDrink);

                System.out.println("Done");
                System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
                A = sc.nextLine();
            }

            if (A.equals("d")){
                System.out.println("Enter the menu item number");
                String i = sc.nextLine();

                if (i.equals(menu_item_number)){
                    scan = true;
                    MenuList.remove(0);
                }
                if (i.equals(menu_item_number1)){
                    scan = true;
                    MenuList.remove(1);
                }
                if (i.equals(menu_item_number2)){
                    scan = true;
                    MenuList.remove(2);
                }

                if (scan == true){
                    System.out.println("Done");
                }

                else{
                    System.out.println("Not found");
                }
                System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
                A = sc.nextLine();

            }




            if (A.equals("l")){
                for(Mains menuItem: MenuList){
                    System.out.println(menuItem.toString());
                }

                System.out.println("Done");
                System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
                A = sc.nextLine();

            }

            if (A.equals("q")){
                break;
            }
        }while(A != "q");
    }
}

