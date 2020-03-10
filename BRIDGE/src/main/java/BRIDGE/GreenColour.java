package BRIDGE;
import java.util.logging.Logger;

public class GreenColour implements COLOUR{
	Logger logger = Logger.getLogger(APP.class.getName());
	public void applyColor(){
		logger.info("green.");
	}
}



