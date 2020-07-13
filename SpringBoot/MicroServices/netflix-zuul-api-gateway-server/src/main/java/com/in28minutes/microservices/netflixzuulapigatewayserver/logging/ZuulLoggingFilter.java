package com.in28minutes.microservices.netflixzuulapigatewayserver.logging;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
		HttpServletRequest request = 
				RequestContext.getCurrentContext().getRequest();
		logger.info("request -> {} requset uri -> {}", request, request.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {
		return "pre";  // pre / post / error -> only error
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
