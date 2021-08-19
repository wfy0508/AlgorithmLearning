package NewCode.ExceptionHandling;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/4 10:48
*/

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Logger;

public class Logging {
    public static Log log = LogFactory.getLog(Logging.class);

    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("Start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored!");
        logger.severe("process will be terminated!");

        String test = "hello";
        log.info("this is info, " + test);
        log.error("this is error, " + test);
        log.debug("this is debug, " + test);
    }
}
