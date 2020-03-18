//Mostafa Ibraheem Basheer //Sec:2 BN:31
import java.util.*;
public class twosum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int target,l;
		System.out.println("Please enter the length of the array");
		l = in.nextInt();
		int [] arr = new int [l];
		System.out.println("Please enter the Target");
		target=in.nextInt();
		System.out.println("Please enter your numbers");
		for (int i=0;i<=l-1;i++) {
			arr[i]=in.nextInt();
		}
		for (int i=0; i<=l-1;i++) {
			for(int j=i+1; j<=l-1;j++) {
				if (target==arr[i]+arr[j]) { 
					System.out.println("the numbers are at the indices:"+i+','+j);
					System.exit(0);
				}
			}
		}
		

	}

}
