package com.example.sse_mcp_server_demo;

import com.example.sse_mcp_server_demo.tool.DateTimeTools;
import com.example.sse_mcp_server_demo.tool.MathTools;
import com.example.sse_mcp_server_demo.tool.ProductService;
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

	@Bean
	public ToolCallbackProvider dateTimeTools() {
		return MethodToolCallbackProvider.builder().toolObjects(new DateTimeTools()).build();
	}

	@Bean
	public ToolCallbackProvider mathTools() {
		return MethodToolCallbackProvider.builder().toolObjects(new MathTools()).build();
	}

	@Bean
	public ToolCallbackProvider productTools() {
		return MethodToolCallbackProvider.builder().toolObjects(new ProductService()).build();
	}
}
