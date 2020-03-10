package BRIDGE;
import java.util.logging.Logger;

public class Triangle extends Shape{
	Logger logger = Logger.getLogger(APP.class.getName());
	public Triangle(COLOUR c) {
		super(c);
	}

	@Override
	public void applyColor() {
		logger.info("Triangle filled with color ");
		color.applyColor();
	} 

}
