public class PersonLaunch{

	public static void main(String[] args){
		PersonLaunch launch = new PersonLaunch();
		launch.launch();
	}
	
	public void launch(){
		Person myPerson = new Person();
		System.out.println(myPerson.getInitials("John  Smith"));
	}

}