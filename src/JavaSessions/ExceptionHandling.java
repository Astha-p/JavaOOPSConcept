package JavaSessions;

import java.io.IOException;

public class ExceptionHandling {

	void m() throws IOException{
		
		throw new IOException ("Device Error");
		
	}
	void n() throws IOException{
		
	}
	
	void p() throws IOException{
		try {
			n();
		}
		catch (Exception e){
			System.out.println("Exception handled");
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		 ExceptionHandling obj = new  ExceptionHandling();
		  
		 try {
		 obj.p();
		 }
		 
		 catch (Exception e){
			 }
		 
		 System.out.println("Normal flow..");
	}

}
