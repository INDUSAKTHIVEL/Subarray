package Subarray;
import java.util.*;
public class Array_sub {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int[] arr= new int[n];
		        System.out.println("Give Array");
		        for(int i=0;i<n;i++){
		                    System.out.println("element");
		            arr[i] = sc.nextInt();
		        }
		        System.out.println("Give B and C values");
		        int B=sc.nextInt();
		        int C=sc.nextInt();
		        int[] newArr = Arrays.copyOfRange(arr,B,C);
		        for(int i=B;i<C+1;i++){
		            System.out.println(arr[i]);
		        }
		    }
	}
