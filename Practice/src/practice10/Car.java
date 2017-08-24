package practice10;

public class Car{

	int serialNo;
	String color;
	int gasoline;

	public int run() {
		int range = new java.util.Random().nextInt(15)+1;
		this.gasoline--;

		int result;
		if(this.gasoline > 0) {
			result = range;
		}else {
			result = -1;
		}
		return result;
	}
}