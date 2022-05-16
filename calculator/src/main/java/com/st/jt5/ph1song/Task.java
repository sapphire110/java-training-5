package com.st.jt5.ph1song;

public class Task {
	public static void main(String[] args) {
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
		// 演算子出現フラグ
		boolean operatorFlg = false;
		// 結果
		int result = 0;

		for (int m = 0; m < expression.length(); m++) {
			String expChild = String.valueOf(expression.charAt(m));
			if (!expChild.equals("+") && !expChild.equals("-") && !expChild.equals("*") && !expChild.equals("/")) {
				if (operatorFlg) {
					str1.append(expChild);
				} else {
					str2.append(expChild);
				}
			} else {
				operator = expChild;
				operatorFlg = true;
			}
		}

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		int strInt1 = Integer.parseInt(str1.toString());
		int strInt2 = Integer.parseInt(str2.toString());
		switch (operator) {
		case "+":
			result = strInt1 + strInt2;
			break;
		case "-":
			result = strInt1 - strInt2;
			break;
		case "*":
			result = strInt1 * strInt2;
			break;
		case "/":
			result = strInt1 / strInt2;
			break;
		}

		System.out.println(str1 + " " + operator + " " + str2 + " = " + result);

		System.out.println("==================================================");

	}
}
