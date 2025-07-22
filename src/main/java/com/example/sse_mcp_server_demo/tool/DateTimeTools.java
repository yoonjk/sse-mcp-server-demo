package com.example.sse_mcp_server_demo.tool;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.context.i18n.LocaleContextHolder;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class DateTimeTools {
    @Tool(name="getCurrentDateTime",
        description="Get the current date and time in the user's timezone"
    )
    public String getCurrentDateTime() {
        ZonedDateTime localTime = LocalDateTime.now().atZone(LocaleContextHolder.getTimeZone().toZoneId());
        log.info("Current time:{}", localTime);
        return localTime.toString();
    }

    @Tool(name="setAlaram", description="Set a user alarm for the tiven time, provided in ISO-8601 format")
    public void setAlaram(String time) {
        LocalDateTime alaramTime = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME);
        log.info("Alarm set for:{}", alaramTime);
    }
}
