package edu.dkist.testconsul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Simple spring app demo-ing Consul. This assumes the following keys are created
 * in Consul.
 * 
 * config/Test-Consul-Service/msg = "blah blah"
 * config/Test-Consul-Service/spring.cloud.config.override-none = true
 * config/Test-Consul-Service/spring.cloud.config.override-system-properties = false
 * 
 * If the key is set from Consul, the @RefreshScope annotation allows the app to update
 * the value when it changes in Consul.
 * 
 * @author dspiess
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
@RefreshScope
public class TestConsulApplication {

    /**
     * This value can be set from the command line as --msg="blah" or
     * from a key in Consul. The default is Consul, and if there is a command line
     * variable set it will use that.
     */
    @Value(value = "${msg}")
    private String helloMessage;
    
    @RequestMapping("/")
    public String home() {
      return helloMessage;
    }
    
    /**
     * Main app
     * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(TestConsulApplication.class, args);
	}
}
