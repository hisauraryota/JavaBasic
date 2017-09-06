package practice13.common;

public class SuperHero extends Hero{

	private Item equipment;


	//オーバーライド
	public int attack() {
		return super.attack() + Item.getadditonalDamage();
	}

	//equipmentのアクセサ
	public Item getequipment() {
		return equipment;
	}

	public void setequipment(Item equipment) {
		this.equipment = equipment;
	}

}