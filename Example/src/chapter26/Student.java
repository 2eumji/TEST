package chapter26;

public class Student {
	//필드
	private String name;
	private String depart;
	private String number;
	private double scoreAvg;
	//생성자
	Student(String name,String depart,String number,double scoreAvg){
		this.name=name;
		this.depart=depart;
		this.number=number;
		this.scoreAvg=scoreAvg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getScoreAvg() {
		return scoreAvg;
	}
	public void setScoreAvg(double scoreAvg) {
		this.scoreAvg = scoreAvg;
	}
	
	public void find_student(String name) {
		if(name.equals(this.name)) {
			System.out.println(this.name+", "+this.depart+", "+this.number+", "+this.scoreAvg);
		}
	}
	
}
