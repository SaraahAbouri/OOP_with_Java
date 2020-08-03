package Basic_Syntax_Name.zip;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class PalinPerfect {

    public static void main(String[] args){

        Scanner user_input = new Scanner(System.in);
        String start_point;

        System.out.print("Enter start point N:\n");

        start_point = user_input.next();
        int begin = Integer.parseInt(start_point);

        String end_point;
        System.out.print("Enter ending point M:\n");

        end_point = user_input.next();
        int finish = Integer.parseInt(end_point);
        System.out.print( "The palindromic perfect squares are as follows:\n");

        for(int i=begin; i <=finish; i++){

            int a,n1,n2=0;
            n1=i;

            for(a = 0; a <= i; a++) {

                if (a==Math.sqrt(n1)) {
                    n2=n1;
                }
            }
            int number = n2;
            int reversedNumber = 0;
            int temp=0;
            while(number > 0){
                temp = number % 10;
                number = number / 10;
                reversedNumber = reversedNumber * 10 + temp;
            }
            if(n1 == reversedNumber)
                System.out.println(n1);

        }
    }
}
