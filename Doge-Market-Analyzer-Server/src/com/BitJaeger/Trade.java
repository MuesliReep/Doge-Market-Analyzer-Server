package com.BitJaeger;

public class Trade {

	private long timeStamp;
	private float value;
	private float amount;
	public Trade(long timeStamp, float value, float amount) {
		super();
		this.timeStamp = timeStamp;
		this.value = value;
		this.amount = amount;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public float getValue() {
		return value;
	}
	public float getAmount() {
		return amount;
	}
	
	
}
