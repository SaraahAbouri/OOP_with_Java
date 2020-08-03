import java.util.*;

public class Meteorology {

    public static void main(final String[] args) {
        Collator colltemp = new Collator("");
        Collator collhumid = new Collator("");
        Collator collpre = new Collator("");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        for (;;){
            System.out.println("Make a selection and press return:");
            System.out.println("1. Record a temperature reading.\n" + "2. Record a pressure reading. \n" + "3. Record a humidity reading.\n" + "4. Print maximum values.\n" + "5. Print minimum values.\n" + "6. Print average values.\n" + "7. Quit.");
            int a = sc.nextInt();

            if (a == 1 ) {
                System.out.println("Enter value:");
                Scanner scan = new Scanner(System.in);
                int b = scan.nextInt();
                colltemp.recordReading(b);


            }
            if (a == 2) {
                System.out.println("Enter value:");
                Scanner scan = new Scanner(System.in);
                int c = scan.nextInt();
                collpre.recordReading(c);


            }
            if (a == 3) {
                System.out.println("Enter value:");
                Scanner scan = new Scanner(System.in);
                int d = scan.nextInt();
                collhumid.recordReading(d);

            }

            if (a == 4){
                if (colltemp.maximum() == 0){
                    System.out.print("Maximum temperature:-\n");
                }
                else{
                    System.out.println("Maximum temperature:" + colltemp.maximum());
                }
                if (collpre.maximum() == 0){
                    System.out.print("Maximum pressure:-\n");
                }
                else{
                    System.out.println("Maximum pressure:" + collpre.maximum());
                }
                if (collhumid.maximum() == 0){
                    System.out.print("Maximum humidity:-\n");
                }
                else{
                    System.out.println("Maximum humidity:" + collhumid.maximum());
                }

            }

            if (a == 5){
                if (colltemp.minimum() == 0){
                    System.out.print("Minimum temperature:-\n");
                }
                else{
                    System.out.println("Minimum temperature:" + colltemp.minimum());
                }
                if (collpre.minimum() == 0){
                    System.out.print("Minimum pressure:-\n");
                }
                else{
                    System.out.println("Minimum pressure:" + collpre.minimum());
                }
                if (collhumid.minimum() == 0){
                    System.out.print("Minimum humidity:-\n");
                }
                else{
                    System.out.println("Minimum humidity:" + collhumid.minimum());
                }
            }

            if (a == 6){
                if (colltemp.average() == 0.0){
                    System.out.print("Average temperature:-\n");
                }
                else{
                    System.out.println("Average temperature:" + colltemp.average());
                }
                if (collpre.average() == 0.0){
                    System.out.print("Average pressure:-\n");
                }
                else{
                    System.out.println("Average pressure:" + collpre.average());
                }
                if (collhumid.average() == 0.0){
                    System.out.print("Average humidity:-\n");
                }
                else{
                    System.out.println("Average humidity:" + collhumid.average());
                }

            }
            if (a == 7){
                break;
            }

        }
    }

}