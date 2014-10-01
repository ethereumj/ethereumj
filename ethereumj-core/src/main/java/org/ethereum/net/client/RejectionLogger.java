package org.ethereum.net.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * A handler to log rejected threads when execution is blocked because the
 * thread bounds and queue capacities are reached
 * 
 * @author Roman Mandeleil 
 * Created on: 22/05/2014 10:31
 */
public class RejectionLogger implements RejectedExecutionHandler {

	private static final Logger logger = LoggerFactory.getLogger("wire");

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		logger.warn(r.toString() + " is rejected");
	}
}
