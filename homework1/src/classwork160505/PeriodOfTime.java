package classwork160505;

public class PeriodOfTime {
	
	public static void main(String[] args) {
		
Human student = new Human("Миша", "Студент");	
//student.name = "Миша";
//student.occupation = "Студент";
student.study("Сессия");
student.isWantSleep = false;
student.study("Сессия");
student.holidays();
student.holidays();

	}

}

