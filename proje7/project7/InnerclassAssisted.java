package project7;
import java.util.*;

public class InnerclassAssisted {
	//anonymous inner class
	abstract class AnonymousInnerClass {
		   public abstract void display();
		}


	public static void main(String[] args) {
		anonymousInnerClass i = new anonymousInnerClass() {

	         public void display() {
	            System.out.println("anonymous inner class");
	         }
	      };
	      i.display();

		// TODO Auto-generated method stub

	}

}
