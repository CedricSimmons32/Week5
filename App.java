package week5Code;

public class App {
 
	//Create a class that has a main method which is App 
	public static void main(String[] args) {
	
	//instantiate an instance that each of your AsteriskLogger class implement the Logger Interface
		
		Logger mine = new AsteriskLogger();
		
	//Test both Instances passing Strings of your choice 
		mine.Log("Today is a Beautiful day");
		mine.Error("I'm grateful to get up and start the day");
		
	//	Instantiate an instance that your SpacedLogger classes implement the Logger Interface
		Logger today = new SpacedLogger();
		
		today.Log("Today is Friday");
		today.Error("Looking forward to conquering this course with my classmates");
		
		

	}

}