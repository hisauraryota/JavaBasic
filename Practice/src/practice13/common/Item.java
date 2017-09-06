package practice13.common;

public class Item{

	private String name;

	private static int additionalDamage;

	public String getname() {
		return name;
	}

	public void  setname(String name) {
		this.name = name;
	}

	public static  int getadditonalDamage() {
		return additionalDamage;
	}

	public void setadditionalDamage(int additionalDamage) {
		Item.additionalDamage = additionalDamage;
	}

	public Item(String name, int additionalDamage) {
		this.name = name;
		Item.additionalDamage = additionalDamage;
	}

}