/*
Problem Statement
Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.

Input
First line contains the number of triples, N.
The next N lines which follow each have three space separated integers.
Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.

Constraints
1 ≤ N ≤ 6
1 ≤ every integer ≤ 10000
The three integers in a single triplet are all distinct. That is, no two of them are equal.
*/

import java.lang.reflect.Array;
import java.util.Scanner;

public class SecondMaxofThreeNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
//		int ans[] = new int[T];
		int num1, num2,num3,ans;
		for(int i=0;i<T;i++) {
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
			
			if(((num1 > num2)||(num1 > num3)) && ((num1 < num3) || (num1 < num2))) {
				ans = num1;
			}else if(((num2 > num1)||(num2 > num3)) && ((num2 < num3) || (num2 < num1))) {
				ans = num2;
			}
			else {
				ans = num3;
			}
			System.out.println(ans);
		}
	}

}
