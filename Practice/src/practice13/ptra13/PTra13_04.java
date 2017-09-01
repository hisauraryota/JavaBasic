/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください

		Hero Hero = new Hero();
		Hero.setName("勇者");

		Slime Slime = new Slime();
		Slime.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		while(true) {

			Hero.damage(Slime.attack());

			Slime.damage(Hero.attack());

			if(Slime.damage(Hero.attack()) == true) {
				System.out.println("勇者はスライムとの戦闘に勝利した");
				break;

			}else if(Hero.damage(Slime.attack()) == true) {
				System.out.println("スライムは勇者との戦闘に勝利した");
				break;
				}
		}
		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
