package com.hull.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskService {
	protected final Log logger = LogFactory.getLog(getClass());

private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	/**
	 *  测试 打印系统时间
	 */
	@Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
	public void reportCurrentTime() {
		logger.info("The time is now " + dateFormat.format(new Date()));
	}

}
