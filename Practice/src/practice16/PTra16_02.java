/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください

		Boolean B = new Boolean(b);
		Byte By = new Byte(by);
		Short S = new Short(s);
		Character C = new Character(c);
		Integer I = new Integer(i);
		Long L = new Long(l);
		Float F = new Float(f);
		Double D = new Double(d);

		System.out.println(B);
		System.out.println(By);
		System.out.println(S);
		System.out.println(C);
		System.out.println(I);
		System.out.println(L);
		System.out.println(F);
		System.out.println(D);


	}
}
