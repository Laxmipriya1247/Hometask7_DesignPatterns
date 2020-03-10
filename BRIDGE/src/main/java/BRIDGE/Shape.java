package BRIDGE;
public abstract class Shape {
	//Composition - implementor
	protected COLOUR color;
	
	//constructor with implementor as input argument
	public Shape(COLOUR c){
		this.color=c;
	}
	
	abstract public void applyColor();
}

