package factory;
import java.util.logging.Logger;


public class App {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(App.class.getName());
		Computer pc = Computerfactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = Computerfactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		logger.info("Factory PC Config::"+pc);
		logger.info("Factory Server Config::"+server);
	}

}
