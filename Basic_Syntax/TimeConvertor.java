package Basic_Syntax_Name.zip;

import java.util.Scanner;

public class TimeConvertor {
    public static void main(String[]args){
        System.out.println("Enter a time ([h]h:mm [am|pm]):");
        Scanner sc = new Scanner(System.in);
        String InputTime = sc.next();
         String substring = "m";

         if (InputTime.contains(substring)){

             String tArr[] = InputTime.split(":");
             String Time = tArr[1].substring(3,5);

             int hh,mm;
             hh = Integer.parseInt(tArr[0]);
             mm = Integer.parseInt(tArr[1].substring(0,2));

             String check_pm = "pm",check_am = "am";

             if(Time.equals(check_am) && hh == 12)
             {
                 hh = 0;
             }
             else if(Time.equals(check_pm)&& hh < 12)
             {
                 hh += 12;
             }
             System.out.printf("%02d:%02d\n", hh , mm);
         }
         else {
             String tArr[] = InputTime.split(":");
             int hh, mm;

             hh = Integer.parseInt(tArr[0]);
             mm = Integer.parseInt(tArr[1]);

             if (hh == 12) {
                 hh = hh - 12;
                 System.out.printf("%02d:%02d",hh,mm);

             }
             else if ( hh == 00 ){
                 hh = hh + 12;
                 System.out.printf("%02d:%02d",hh, mm);
                 System.out.print(" am");
             }
             else if (hh == 5 ){
                 hh = hh;
                 System.out.printf("%02d:%02d",hh,mm);

             }
             else if (hh <= 11) {
                 hh = hh + 12;
                 System.out.printf("%d:%02d", hh, mm);

             }
             else if (hh > 12){
                 hh -= 12;
                 System.out.printf("%d:%02d", hh, mm);
                 System.out.print(" pm");
             }
        }
    }
}
