package edu.dkist.testconsul;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Unit tests. Not used for demo.
 * 
 * @author dspiess
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=TestConsulConfiguration.class, loader=AnnotationConfigContextLoader.class)
@ActiveProfiles("test")
public class TestConsulApplicationTests {

	@Test
	public void contextLoads() {
	}

}
