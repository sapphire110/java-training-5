package com.st.jt5.ma;

import java.util.Scanner;

public class adder {
//    public static int[] addX(int n, int arr[], int x)
//    {
//        int i;
//  
//        // create a new array of size n+1
//        int newarr[] = new int[n + 1];
//  
//        // insert the elements from
//        // the old array into the new array
//        // insert all elements till n
//        // then insert x at n+1
//        for (i = 0; i < n; i++)
//            newarr[i] = arr[i];
//  
//        newarr[n] = x;
//  
//        return newarr;
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please type a number:");
		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		int i = 0;
		int n = 10;
		String expression = "";
		String[] strArr = new String[n];
		int[] intArr = new int[n];

		while (scan.hasNextInt()) {
			System.out.println("(type any char to stop)\n");
			System.out.print("please type a number:");
			int typedNum = scan.nextInt();
			intArr[count] = typedNum;
			count = count + 1;
			sum = sum + typedNum;
			if (count == n) {
				break;
			}
		}
		String str = "adb";
		
		
		while (i < count) {
			System.out.println(i + 1 + ":" + intArr[i]);
			//strArr[i] = Integer.toString(intArr[i]);
			StringBuilder newStr = new StringBuilder();
			newStr.append(expression).append(intArr[i]);
			if (count - i > 1) {
				newStr.append("+");
			} else {
				newStr.append("=");
			}
			expression = newStr.toString();

			i++;
		}
		System.out.println(expression + sum);
		scan.close();
	}
}
