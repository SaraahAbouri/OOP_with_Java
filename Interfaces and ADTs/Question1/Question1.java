import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 public class Question1 {
    public static Scanner s = new Scanner(System.in);
    public static int num;
    public static String input;

    public static void main(String[] args) {
        List<Softdrink> soda = new ArrayList<Softdrink>();
        int num;
        do {
            System.out.println("Enter option: (1) add soft drink (2) quit:");
            num = s.nextInt();
            switch (num) {
                case 1 :
                    System.out.println("Enter name, colour and volume in ml seperated by space");
                    Scanner scanner=new Scanner(System.in);
                    String P =scanner.nextLine();
                    String[] lists = P.split(" ", 10);
                    soda.add(new Softdrink(lists[0], lists[1], lists[2]));
                    break;


            }
        } while (num != 2);



        for (int i = 0; i < soda.size(); i++) {
            System.out.println(soda.get(i));
        }

    }

}

