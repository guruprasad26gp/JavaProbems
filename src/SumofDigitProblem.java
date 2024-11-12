/* Sum of Digits
You're given an integer N. Write a program to calculate the sum of all the digits of N.

Input Format
The first line contains an integer T, the total number of testcases. Then follow T lines, each line contains an integer N.

Output Format
For each test case, calculate the sum of digits of N, and display it in a new line.
*/

import java.util.Scanner;

public class SumofDigitProblem {
	
	static void sumOfDigit(int t, int arr[]) {
		
		int temp[] = new int[t];
		for(int i=0;i<t;i++) {
			temp[i]=arr[i];
		}
		int ans[] = new int[t];
		for(int i=0;i<t;i++) {
			ans[i] = 0;
			while(arr[i]>0) {
				int rem = arr[i] % 10;
				arr[i] = arr[i]/10;
				ans[i] = ans[i] + rem ;
			}
		}
		
		for(int i=0;i<t;i++) {
			System.out.println(temp[i] + " - " + ans[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int arr[] =new int[T];
		for(int i=0;i<T;i++) {
			arr[i] = sc.nextInt();
		}
		
		sumOfDigit(T,arr);
		
	}
}
