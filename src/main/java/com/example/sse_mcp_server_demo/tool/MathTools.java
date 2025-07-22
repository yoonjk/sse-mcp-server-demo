package com.example.sse_mcp_server_demo.tool;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;

@Slf4j
public class MathTools {
    @Tool(description = "Add two numbers")
    public int sumNumbers(int number1, int number2) {
        log.info("mcp Add two numbers:two numbers:{} * {}", number1, number2);
        return number1 + number2;
    }

    @Tool(description = "Multiplies two numbers")
    public int multipleNumbers(int number1, int number2) {
        log.info("mcp multiplies two numbers:{} * {}", number1, number2);
        return number1 * number2;
    }
}
