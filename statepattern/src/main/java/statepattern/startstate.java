package statepattern;

public class startstate implements state {
	   public void doAction(context contxt) {
		      System.out.println("Product is in start state");
		      contxt.setState(this);	
		   }

		   public String toString(){
		      return "Start State";
		   }

}
