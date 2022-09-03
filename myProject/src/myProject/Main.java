package myProject;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.id=1;
		student.nationalIdentity="12345678998";
		student.firstName="Onur";
		student.lastName="Yesiltas";
		student.age=24;
		student.studentNumber="15702555";
		student.devision="Bilgisayar Prog.";
		
		Teacher teacher = new Teacher();
		teacher.id=2;
		teacher.nationalIdentity="12345678912";
		teacher.firstName="Engin";
		teacher.lastName="Demirog";
		teacher.age=30;
		teacher.teacherNumber="12345";
		teacher.lesson="Java";
		
		Worker worker = new Worker();
		worker.id=3;
		worker.nationalIdentity="98765432112";
		worker.firstName="Ahmet";
		worker.lastName="Dur";
		worker.age=50;
		worker.personnelNumber="101";
		worker.job="Cleaning staff";
		
		UserMenager userMenager = new UserMenager();
		User [] users = {student,teacher,worker};
		userMenager.addMultiple(users);

	}

}
