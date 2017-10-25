package Com.Artek;

import java.util.Set;

public class Student {
   private Integer studentid;
   private String studentName;
   private Integer marks;
   
   private Set courses;

public Integer getStudentid() {
	return studentid;
}

public void setStudentid(Integer studentid) {
	this.studentid = studentid;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public Integer getMarks() {
	return marks;
}

public void setMarks(Integer marks) {
	this.marks = marks;
}

public Set getCourses() {
	return courses;
}

public void setCourses(Set courses) {
	this.courses = courses;
}
}
