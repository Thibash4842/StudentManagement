package StudentManagement;

public class Student {
	private int S_Id;
	private String S_Name;
	private int S_Age;
	
	
	
	public Student() {
		super();
		
	}
	public Student(int sId, String sname, int age) {
		super();
		this.S_Id = sId;
		this.S_Name = sname;
		this.S_Age = age;
	}
	public int getsId() {
		return S_Id;
	}
	public void setsId(int sId) {
		this.S_Id=sId;
	}
	public String getSname() {
		return S_Name;
	}
	public void setSname(String sname) {
		this.S_Name=sname;
	}
	public int getAge() {
		return S_Age;
	}
	public void setAge(int age) {
		this.S_Age=age;
	}
	
	@Override
	public String toString() {
		return "Student [ S_Id=" + S_Id + ", S_Name=" + S_Name + ", S_Age=" + S_Age + " ]";
	}

}
