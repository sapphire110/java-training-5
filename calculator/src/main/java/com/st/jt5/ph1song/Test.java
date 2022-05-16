package com.st.jt5.ph1song;

public class Test {

	public static void main(String[] args) {

//		byte b = 127;

//		char c = 'A', c1 = '\u003d';
//		
//		short s = 61;

//		int i = 2147483647;
//
//		System.out.println(" the value of i is : " + i);
//
//		long l = 2147483648l;
//
//		float f = 0.1f;
//		double d = 0.1d;

//		boolean bl = false; // true

//		i = l; // compile error(type mismatch)
//		
//		l = i; // ok
//		
//		i = bl; // compile error
//		
//		l = f; // compile error
//		
//		f = l; // ok

//		System.out.println(" the value of i is : " + l);
//
//		i = (int) l; // cast(精度が落ちる可能性あり)
//
//		System.out.println(" the value of i is : " + i);
//		l = (long) f;
//
//		String str = "abc";
//		System.out.println(" the value of i is : " + str);

//		int[] intAry = {0, 1, 2};
//		int[] intAry1 = new int[3];
//		int intFirst = intAry[0];   // 配列参照、0から
//		int intLast = intAry1[2];
//		int len = intAry.length;    // 要素数の取得：3
//		String[] strAry = {"0", "1", "2"};	// 参照型の配列
//		String[] strAry1 = new String[3];
//		System.arraycopy(intAry1, 0, intAry1, 0, 3);    // 配列コピー
//		int[][] intAry2 = new int[2][3];	// 2次元配列
//		int intAry3[][] = new int[2][3];

//		// 練習
//		System.out.println("========================練習========================");
//		int[] testIntArr = new int[10];
//		int k = 10;
//		for (int j = 0; j < testIntArr.length; j++) {
//			testIntArr[j] = k;
//			k--;
//		}
//		System.out.println("before sort : " + Arrays.toString(testIntArr));
//		Arrays.sort(testIntArr);
//		System.out.println("after sort : " + Arrays.toString(testIntArr));
//		System.out.println("===================================================");

		// 課題
		System.out.println("========================課題========================");
		String expression = "123+345";

		// 上記文字列を足し算の式として結果を求める
		System.out.println(expression + "=" + "上記の結果");

		// 演算変数1
		StringBuilder str1 = new StringBuilder();
		// 演算変数2
		StringBuilder str2 = new StringBuilder();
		// 演算子
		String operator = "";
		// 結果
		int result = 0;
		
		for (int m = 0; m < expression.length(); m++) {
			String expChild = String.valueOf(expression.charAt(m));
			if (!expChild.equals("+") && !expChild.equals("-") && !expChild.equals("*") && !expChild.equals("/")) {
				if (3 > m) {
					str1.append(expChild);
				} else {
					str2.append(expChild);
				}
			} else {
				operator = expChild;
			}
		}

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		int strInt1 = Integer.parseInt(str1.toString());
		int strInt2 = Integer.parseInt(str2.toString());
		switch(operator) {
		case "+":
			result =strInt1 + strInt2;
			break;
		case "-":
			result =strInt1 - strInt2;
			break;
		case "*":
			result =strInt1 * strInt2;
			break;
		case "/":
			result =strInt1 / strInt2;
			break;
		}
		
		System.out.println(str1 + " " + operator + " " + str2 + " = " + result);

		System.out.println("==================================================");

	}

}
