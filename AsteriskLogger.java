package week5Code;

public class AsteriskLogger implements Logger{

	// Create a class AsteriskLogger that implements the Logger Interface
		// Make sure your class inherits the methods from the Logger Interface Which are Log And Error
		@Override
		public void Log(String Str) {
			System.out.println(Hello(Str));
			
		}
		
		// Created a String named errorCed which will print out "Error:" followed by "Hello" printing "Error: Hello"
		// Now we must add "*" to the top of the the errorCed string using the .repeat function and the .length() function to errorCed to print out enough "*" same length as our String
		// We print out the String errorCed in the middle of "*" we Sysout first. 
		// Here we repeat our 2nd step "*" to the bottom of our String errorCed which prints  "ERROR: Hello"
		@Override
		public void Error(String Str) {
			String errorCed = Hello("ERROR:" + Str);
			System.out.println("*".repeat(errorCed.length()));
			System.out.println(errorCed);
			System.out.println("*".repeat(errorCed.length()));
			
		}

		// Create a "Hello" String along with "***" on both sides of the String as stated in the Word Document
		
		
		 String Hello(String Str) {
			return "***" + Str + "***";
			
		 }
  
}

