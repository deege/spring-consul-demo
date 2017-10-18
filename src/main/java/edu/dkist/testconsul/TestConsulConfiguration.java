package edu.dkist.testconsul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for application. Not really used for this demo.
 * 
 * @author dspiess
 */
@Configuration
public class TestConsulConfiguration {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    public TestConsulConfiguration() {
        logger.info("TestConsulConfiguration instantiated.");
    }
}
