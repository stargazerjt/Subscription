package com.stargate.subscript.models;

import java.util.Date;

public class SubscriptionRequest {
	
	private Double invAmt;
	private String subscriptionType;
	private String dayOfWeekMonthly;
	private Date startDate;
	private Date endDate;
	
	public Double getInvAmt() {
		return invAmt;
	}
	public void setInvAmt(Double invAmt) {
		this.invAmt = invAmt;
	}
	public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public String getDayOfWeekMonthly() {
		return dayOfWeekMonthly;
	}
	public void setDayOfWeekMonthly(String dayOfWeekMonthly) {
		this.dayOfWeekMonthly = dayOfWeekMonthly;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
