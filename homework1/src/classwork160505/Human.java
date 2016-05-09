package classwork160505;

public class Human {

	String name;
	String occupation;
	boolean isWantSleep = true;
	public Object holidays;

	public Human(String name, String occupation) {
		this.name = name;
		this.occupation = occupation;
	}

public void study (String day) {
	if (isWantSleep) {
	 System.out.println(occupation + "'" + name + "'" +  " готовится к  "+ day );
 isWantSleep = false;
	}else{
		System.out.println(occupation + "'" + name + "'" +  " завалил  "+ day );
	}
}
public void holidays() {
if (isWantSleep){
	System.out.println(occupation + "'" + name + "'" +  " спит после " );
} else {
	System.out.println(occupation + "'" + name + "'" +  " отмечает  ");
isWantSleep = true;
   }
}
}