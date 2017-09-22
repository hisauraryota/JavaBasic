/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> playerlist = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(line, ",");

				Player player = new Player();

				player.setposition(st.nextToken());
				player.setname(st.nextToken());
				player.setcountry(st.nextToken());
				player.setteam(st.nextToken());

				playerlist.add(player);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(playerlist);

		int countGK = 0;
		int countDF = 0;
		int countMF = 0;
		int countFW = 0;

		for (Player player : playerlist) {

			if (player.getposition().equals("GK") && countGK < 1) {
				System.out.println(player.toString());
				countGK++;

			}

			if (player.getposition().equals("DF") && countDF < 4) {
				System.out.println(player.toString());
				countDF++;

			}

			if (player.getposition().equals("MF") && countMF < 4) {
				System.out.println(player.toString());
				countMF++;

			}

			if (player.getposition().equals("FW") && countFW < 2) {
				System.out.println(player.toString());
				countFW++;

			}

		}

	}
}
