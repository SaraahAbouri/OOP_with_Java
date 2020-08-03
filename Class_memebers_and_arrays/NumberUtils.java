package classMembersandArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class NumberUtils {
	
	public NumberUtils() {
		
	}
	
	public static int[] toArray(int number) {
		
		int x = 0;
		int len = Integer.toString(number).length();
		int[] arr = new int[len];
		while(number != 0) {
			arr[len - x - 1] = number%10;
			number = number/10;
			x++;
		
		}
		
   	return arr;
	}
	
    public static int countMatches(int numberA, int numberB) {
		
    	int h = 0;
		int len3 = Integer.toString(numberA).length();
		int[] arr3 = new int[len3];
		while(numberA != 0) {
			arr3[len3 - h - 1] = numberA%10;
			numberA = numberA/10;
			h++;
		}
		
		
		int m = 0;
		int len4 = Integer.toString(numberB).length();
		int[] arr4 = new int[len4];
		while(numberB != 0) {
			arr4[len4 - m - 1] = numberB%10;
			numberB = numberB/10;
			m++;
		}
    	
    	int Amount2 = 0;
    	int size;
    	if (arr3.length > arr4.length) size = arr4.length;
    	else size = arr3.length;
    	for (int i = 0; i < size; i++) {
    		if (arr3[i] == arr4[i]) {
    			Amount2 = Amount2 + 1;
    			
}
    	}
    	return Amount2;
    
	}
	
    
	public static int countIntersect(int numberA, int numberB) {
		int m = 0;
		int len1 = Integer.toString(numberA).length();
		int[] arr1 = new int[len1];
		while(numberA != 0) {
			arr1[len1 - m - 1] = numberA%10;
			numberA = numberA/10;
			m++;
		}
		
		
		int n = 0;
		int len2 = Integer.toString(numberB).length();
		int[] arr2 = new int[len2];
		while(numberB != 0) {
			arr2[len2 - n - 1] = numberB%10;
			numberB = numberB/10;
			n++;
		}
		int Amount = 0;
		for (int i = 0; i < arr1.length;i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					Amount = Amount + 1;
					
				}
			}
		}
		return Amount;
		}
	
	
	
	public static void main(String [] args) {
		NumberUtils numberutils = new NumberUtils();
		int[] G = numberutils.toArray(5678);
		System.out.println(Arrays.toString(G));
		System.out.println(numberutils.countMatches(39628, 97324));
		System.out.println(numberutils.countIntersect(39628, 97324));
	}

}
