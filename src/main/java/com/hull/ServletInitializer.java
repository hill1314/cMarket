package com.hull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer{
	protected final Log logger = LogFactory.getLog(getClass());

	@Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { 
		logger.info("init server ... ");
        return application.sources(MyApplication.class);  
    }  

}
