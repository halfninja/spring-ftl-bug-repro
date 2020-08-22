package com.example.demo;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import freemarker.template.Configuration;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	Configuration freemarkerConfiguration;

	@Test
	void renderTemplate() throws Exception {
		Map<String, String> model = new HashMap<>();
		var out = new StringWriter();
		freemarkerConfiguration.getTemplate("home.ftlh").process(model, out);
		assertEquals("Hello", out.toString().trim());
	}

}
