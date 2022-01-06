package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {

	// fields
	private String subjectName;
	private int subjectId;
	private int gradeType;
	
	// 수강 신청한 학생 리스트
	private ArrayList<Student> studentList = new ArrayList<Student>();
	public void register(Student student) {
		studentList.add(student);
	}
	
	// constructor
	public Subject(String subjectName, int subjectId) {
		super();
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;	// 기본적으로 AB 학점 타입
	}
	
	// getter, setter
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
}
