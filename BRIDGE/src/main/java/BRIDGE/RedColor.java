package BRIDGE;
import java.util.logging.Logger;

public class RedColor implements COLOUR{
	Logger logger = Logger.getLogger(APP.class.getName());
	public void applyColor(){
		logger.info("red.");
	}

}
