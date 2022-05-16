package com.st.jt5.junsai;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		
//		byte b = 127;
//		
//		char c = 'A', c1 = '\u003d';
//		
//		short s = 61;
		
//		int i = 2147483647;
		
//		System.out.println(" the value of i is :" + i);
		
//		long l = 2147483648l;
		
//		float f = 0.1f;
//		double d = 0.1d;
//		
//		boolean bl = false;
		
		
//		i = l;     // compile error(type mismatch)
//		l = i;     // ok
//		i = bl;    // compile error
//		l = f;     // compile error
		
//		f = l;     // ok
		
//		System.out.println(" the value of l is :" + l);
//		i = (int)l;    // cast(精度が落ちる可能性あり)
//		System.out.println(" the value of i is :" + i);
		
//		l = (long)f;
		
//		String str = "abc";
//		System.out.println(" the value of str is :" + str);
//		
		/** 
		int[] nums1 = {4, 5, 3, 6, 7, 1, 8, 9, 2, 0};
		int w;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 1; j < nums1.length; j++) {
				if (nums1[i] > nums1[j]) {
					w = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = w;
				}
			}
		}
		for (int i : nums1) {
			System.out.print(nums1[i]);
		}
		**/
		
		
		String expression = "123+345";
		// 上記文字列を足し算の式として結果を求める
		
		String[] str = expression.split("");
		int idx = 0;
		int data1 = 0, data2 = 0;
		for (String s : str) {
			if (idx < 3) {
				data1 = data1 * 10 + Integer.valueOf(s);
			} else if (idx > 3) {
				data2 = data2 * 10 + Integer.valueOf(s);
			}
			idx++;
		}
		
		int result = data1 + data2;
		System.out.println(expression + "=" + result);
	}

}
