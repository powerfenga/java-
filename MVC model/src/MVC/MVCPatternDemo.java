package MVC;

public class MVCPatternDemo {
	public static void main(String[] args) {
		Student model=retriveStudentFromDatebase();
		StudentView view=new StudentView();
		StudentController controller=new StudentController(model, view);
		controller.updateView();
		controller.setStudentName("John");
		controller.updateView();
	}

	private static Student retriveStudentFromDatebase() {
		Student student =new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
