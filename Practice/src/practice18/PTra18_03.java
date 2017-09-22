/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PTra18_03 {

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


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		for(int i = playerlist.size() -1; i > 0; i--) {

			if(playerlist.get(i).getteam().equals("レアル・マドリード") || playerlist.get(i).getteam().equals("バルセロナ")) {
				playerlist.remove(i);
			}

		}


		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player name : playerlist) {
			System.out.println(name.toString());
		}

	}
}
