package com.stargate.subscript.models;

import java.util.Date;
import java.util.List;

public class SubscriptInvModel {

	private Double invAmt;
	private String subscriptionType;
	private int dayOfWeekMonthly;
	private Date startDate;
	private Date endDate;
	private List<String> invDates;
	
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
	public int getDayOfWeekMonthly() {
		return dayOfWeekMonthly;
	}
	public void setDayOfWeekMonthly(int dayOfWeekMonthly) {
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
	public List<String> getInvDates() {
		return invDates;
	}
	public void setInvDates(List<String> invDates) {
		this.invDates = invDates;
	}
	
	
}
