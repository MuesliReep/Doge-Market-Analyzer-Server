package com.BitJaeger;

import java.util.ArrayList;

public class ExchangeCryptsyInterface implements ExchangeDataCollector {

	@Override
	public ArrayList<Trade> grabLatestData() {
		ArrayList<Trade> marketData = new ArrayList<Trade>();
		
		return marketData;
	}

	
	private long convertTimetoTimestamp(String time){
		long timestamp = 0;
		
		return timestamp;
	}
}
