package com.company.leetcodeQuestions.gSet;

import java.util.HashMap;
import java.util.Map;

public class Logger {
	Map<String,Integer> logger;

	/** Initialize your data structure here. */
	public Logger() {
		logger= new HashMap<>();

	}

	/** Returns true if the message should be printed in the given timestamp, otherwise returns false.
	 If this method returns false, the message will not be printed.
	 The timestamp is in seconds granularity. */
	public boolean shouldPrintMessage(int timestamp, String message) {

		if(!logger.containsKey(message)) {
			logger.put(message, timestamp);
			return true;
		}

		int oldTimestamp = logger.get(message);
		if(timestamp-oldTimestamp >=10) {
			logger.put(message, timestamp);
			return true;
		}
		else
			return false;


	}

	public static void main(String[] args) {
		Logger obj = new Logger();
 		boolean param_1 = obj.shouldPrintMessage(1,"foo");
	}


}
