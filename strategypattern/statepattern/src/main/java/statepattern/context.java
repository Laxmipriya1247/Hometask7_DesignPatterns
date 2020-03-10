package statepattern;

public class context {
	   private state st;

	   public context(){
	      st = null;
	   }

	   public void setState(state st){
	      this.st = st;		
	   }

	   public state getState(){
	      return st;
	   }


}
