//Mostafa Ibraheem Basheer //Sec:2 BN:31

import java.util.*;
public class merge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m,i,j,k;
		System.out.println("please enter the length of the first array");
		n = in.nextInt();
		System.out.println("please enter the length of the second array");
		m= in.nextInt();
		int [] arr1 = new int [n];
		int [] arr2 = new int [m];
		int [] merge = new int [n+m];
		System.out.println("please enter the elements  of the first array");
		for (i=0;i<=n-1;i++) {
	    	arr1 [i] = in.nextInt();}
		System.out.println("please enter the elements  of the second array");
		for (i=0;i<=m-1;i++) {
			arr2 [i] = in.nextInt();}
			i=0; j=0; k=0;
			while (i<=n-1&&j<=m-1) {
				if (arr1[i]<=arr2[j]) {merge[k]=+arr1[i]; i++;}
				else {merge[k]=+arr2[j]; j++;}
				k++;} 
				while (k < m+n) {                     //This loop is to insert the last indices in case the other loop ended
		            if (i < n) { merge[k] = arr1[i]; i++;} 
		            else {if (j < m) {merge[k] = arr2[j];j++;}
		            }
		            k++;
		        }
				System.out.print('[');
			for (k=0;k<=n+m-1;k++) { 
				 System.out.print(merge[k]+",");
	}
			System.out.print(']');
}
}
