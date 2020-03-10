package BRIDGE;

import java.util.logging.Logger;

public class Pentagon extends Shape{
	Logger logger = Logger.getLogger(APP.class.getName());
	public Pentagon(COLOUR c) {
		super(c);
	}

	@Override
	public void applyColor() {
		logger.info("Pentagon filled with color ");
		color.applyColor();

	}
}
