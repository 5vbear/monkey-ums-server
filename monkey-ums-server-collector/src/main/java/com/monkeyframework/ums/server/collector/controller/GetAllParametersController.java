package com.monkeyframework.ums.server.collector.controller;

import org.apache.log4j.Logger;

import com.monkeyframework.rest.AbstractRestRequest;
import com.monkeyframework.rest.annotation.ServiceMethod;
import com.monkeyframework.rest.annotation.ServiceMethodBean;
import com.monkeyframework.rest.response.SuccessResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author Stone
 * @version 1.0
 */
@ServiceMethodBean
public class GetAllParametersController extends BaseController {

	private static Logger logger = Logger.getLogger(UsingLogController.class);

	@ServiceMethod(method = "/ums/getAllparameters")
	public Object usingLog(AbstractRestRequest request) {
		SuccessResponse response = new SuccessResponse();
		//String ip = request.getRestRequestContext().getIp();
		String content = request.getRestRequestContext().getContent();

		//messageProducer3.sendText("topic_usinglog", ip, content);
		
		logger.error(content);
		return response;
	}

}