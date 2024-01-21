package entities;

public class Student {

	public String name;
	public double av1;
	public double av2;
	public double av3;
	
	public double finalGrade() {
		return av1 + av2 + av3;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60 ) {
			return 60 - finalGrade();
		}else {
			return 0;
		}
	}
}
