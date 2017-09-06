/*
 * PTra14_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

import practice14.common.JavaCourse;

public class PTra14_01 {

	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

	public static void main(String[] args) {

		JavaCourse JavaCourse = new JavaCourse();
		System.out.println(JavaCourse.getCourseName());

		String[] list = JavaCourse.getCourseUnit();

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);

		}

	}
}
