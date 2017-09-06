package practice14.common;

public class DBCourse implements Course{

	String courseName = "DB基礎";
	String[] courseUnit = {"DB基礎","SQL基礎","正規化","SQL応用"};


	public String getCourseName() {

		return PREFIX + courseName ;

	}


	public String[] getCourseUnit() {

		return courseUnit;

	}
}