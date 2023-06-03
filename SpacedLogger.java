package week5Code;

public class SpacedLogger implements Logger {

	// Create a class that SpacedLogger that implements the Logger Interface
	// Make sure your class inherits the methods from the Logger Interface just like the AsteriskLogger Class
	
	@Override
	public void Log(String Str) {
		System.out.println(Hello(Str));
		
	}

	
	//the Error method should Print out the "ERROR: H e l l o "  
	@Override
	public void Error(String Str) {
		System.out.println("ERROR: " + Hello(Str));
		
	}

	
	// we create another method for Hello 
	// you have to create a loop for the new string that add space which is newStr = " ". 
	//we have in the body newStr += Str.charAt(i) (index) + " " (which adds space in between the characters
	//By creating this loop space with Str is passed on to the other methods when we Sysout.
	 public String Hello(String Str) {
		String newStr = " ";
		 for (int i = 0; i < Str.length(); i ++) {
			newStr += Str.charAt(i) + " ";
		 }
		return newStr;
	 }
	}
	
	

	

