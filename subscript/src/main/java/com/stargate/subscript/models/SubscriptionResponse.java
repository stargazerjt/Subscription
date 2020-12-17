package com.stargate.subscript.models;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SubscriptionResponse {

	private Double invAmt;
	private String subscriptionType;
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
	public List<String> getInvDates() {
		return invDates;
	}
	public void setInvDates(List<String> invDates) {
		this.invDates = invDates;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((invAmt == null) ? 0 : invAmt.hashCode());
		result = prime * result + ((invDates == null) ? 0 : invDates.hashCode());
		result = prime * result + ((subscriptionType == null) ? 0 : subscriptionType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubscriptionResponse other = (SubscriptionResponse) obj;
		if (invAmt == null) {
			if (other.invAmt != null)
				return false;
		} else if (!invAmt.equals(other.invAmt))
			return false;
		if (invDates == null) {
			if (other.invDates != null)
				return false;
		} else if (!invDates.equals(other.invDates))
			return false;
		if (subscriptionType == null) {
			if (other.subscriptionType != null)
				return false;
		} else if (!subscriptionType.equals(other.subscriptionType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SubscriptionResponse [invAmt=" + invAmt + ", subscriptionType=" + subscriptionType + ", invDates="
				+ invDates + "]";
	}

}
