package statepattern;

public class patterndemo {
	   public static void main(String[] args) {
		      context contxt = new context();

		      startstate startState = new startstate();
		      startState.doAction(contxt);

		      System.out.println(contxt.getState().toString());

		      stopstate stopState = new stopstate();
		      stopState.doAction(contxt);

		      System.out.println(contxt.getState().toString());
		   }


}
