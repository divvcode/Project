package exceptionHandling;

public class MyExceptionextendsException {
	   String str1;
	   void MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{


	public static void main(String[] args) {
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException();
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	

		// TODO Auto-generated method stub

	}


