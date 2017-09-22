package practice18;

public class Player{

	private String position;
	private String name;
	private String country;
	private String team;

	public String getposition() {
		return position;
	}
	public void setposition(String position) {
		 this.position = position;
	 }

	public String getname() {
		return name;
	}
	public void setname(String name) {
		 this.name = name;
	 }

	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		 this.country = country;
	 }

	public String getteam() {
		return team;
	}
	public void setteam(String team) {
		 this.team = team;
	 }

	public String toString() {
		return position + "," + name + "," + country + "," +team;
	}

}