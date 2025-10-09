package com.zenzebz.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BackendApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true, "Context should load without errors");
	}

	@Test
	void environmentTest() {
		String javaVersion = System.getProperty("java.version");
		assertNotNull(javaVersion, "Java version should be available");
		assertTrue(javaVersion.startsWith("21"), "Should be running Java 21");
	}
}
