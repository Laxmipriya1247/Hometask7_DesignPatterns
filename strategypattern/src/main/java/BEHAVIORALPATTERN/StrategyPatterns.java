package BEHAVIORALPATTERN;

public class StrategyPatterns {
	public static void main(String[] args) {
	      Context context = new Context(new OperationAdd());		
	      System.out.println("30 + 5 = " + context.executeStrategy(30, 5));

	      context = new Context(new OperationSubtract());		
	      System.out.println("30 - 5 = " + context.executeStrategy(30, 5));

	      context = new Context(new OperationMultiply());		
	      System.out.println("30 * 5 = " + context.executeStrategy(30, 5));
	   }

}
