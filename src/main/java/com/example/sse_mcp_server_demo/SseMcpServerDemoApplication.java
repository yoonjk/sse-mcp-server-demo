package com.example.sse_mcp_server_demo;

import com.example.sse_mcp_server_demo.tool.DateTimeTools;
import com.example.sse_mcp_server_demo.tool.MathTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SseMcpServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SseMcpServerDemoApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	/**
	 * DateTimeTool
	 * @return
	 */
	@Bean
	public ToolCallbackProvider dateTimeTools() {
		return MethodToolCallbackProvider.builder().toolObjects(new DateTimeTools()).build();
	}

	/**
	 * MathTool
	 * @return
	 */
	@Bean
	public ToolCallbackProvider mathTools() {
		return MethodToolCallbackProvider.builder().toolObjects(new MathTools()).build();
	}
}
