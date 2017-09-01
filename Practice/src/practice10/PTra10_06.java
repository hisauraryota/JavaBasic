package practice10;

import java.util.Arrays;

/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * ★ 各carインスタンスのrunメソッドを実行して、200km先の目的地に到達した順位を出力してください
		 */

		Car car1 = new Car();
		car1.color = "blue";
		car1.gasoline = 130;

		Car car2 = new Car();
		car2.color = "Yellow";
		car2.gasoline = 100;

		Car car3 = new Car();
		car3.color = "pink";
		car3.gasoline = 200;

		final int distance = 200;

		//int count = 0;
		//int goukei = 0;

		Car[] cars = new Car[3];
		int[] count = new int[3];
		int[] goukei = new int[3];

		for (int i = 0; i < 3; i++) {
			cars[i] = new Car();
			cars[0] = car1;
			cars[1] = car2;
			cars[2] = car3;


			while (true) {
				count[i]++;
				int kyori = cars[i].run();

				if (kyori == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				}

				goukei[i] += kyori;

				if (goukei[i] >= distance) {
					//System.out.println("目的地まで"+ count[i] +"時間かかりました。残りのガソリンは"+cars[i].gasoline+"リットルです");
					break;
				}

			}
		}

		Arrays.sort(count);
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}

	}
}
