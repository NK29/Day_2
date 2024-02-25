package Org.college;

public class Student{
	
	public void StudentName() {
		System.out.println("Student Name: naveen");
	}
	public void StudentDept() {
		System.out.println("Student Dept: turner");
	}
	public void StudentId() {
		System.out.println("Student Id  : 29");
	}

	public static void main(String[] args) {
		//ClassaName ObjName = new ClassaName();
		Student student = new Student();
		student.StudentName();
		student.StudentDept();
		student.StudentId();
		
		College college = new College();
		college.collegeName();
		college.collegecode();
		college.collegeRank();
		
		Hostel hostel = new Hostel();
		hostel.HostelName();
		
		Dept dept = new Dept();
		dept.deptName();
	}

}
