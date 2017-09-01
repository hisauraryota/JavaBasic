package practice13.common;

public class Item{

	private String name;

	private int additionalDamage;

	public String getname() {
		return name;
	}

	public void  setname(String name) {
		this.name = name;
	}

	public int getadditonalDamage() {
		return additionalDamage;
	}

	public void setadditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	public Item(String name, int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}

}