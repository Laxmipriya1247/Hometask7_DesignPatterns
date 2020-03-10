package statepattern;

public class stopstate implements state {
	   public void doAction(context contxt) {
		      System.out.println("Product is in stop state");
		      contxt.setState(this);	
		   }

		   public String toString(){
		      return "Stop State";
		   }

}
