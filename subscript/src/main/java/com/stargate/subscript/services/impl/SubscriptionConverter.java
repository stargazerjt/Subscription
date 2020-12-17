package com.stargate.subscript.services.impl;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import com.stargate.subscript.models.SubscriptionRequest;
import com.stargate.subscript.models.SubscriptionResponse;
import com.stargate.subscript.models.SubscriptInvModel;
import com.stargate.subscript.services.ModelConverter;

@Component
public class SubscriptionConverter implements ModelConverter<SubscriptionRequest,SubscriptInvModel,SubscriptionResponse> {

	@Override
	public SubscriptInvModel requestToModel(SubscriptionRequest request) {
		SubscriptInvModel model = new SubscriptInvModel();
		model.setInvAmt(request.getInvAmt());
		model.setSubscriptionType(request.getSubscriptionType());
		model.setDayOfWeekMonthly(convertInt(request.getDayOfWeekMonthly()));
		model.setStartDate(request.getStartDate());
		model.setEndDate(request.getEndDate());
		
		return model;
	}
	@Override
    public SubscriptionResponse modelToResponse(SubscriptInvModel model) {
		SubscriptionResponse response=new SubscriptionResponse();
		
		response.setInvAmt(model.getInvAmt());
		response.setSubscriptionType(model.getSubscriptionType());
		response.setInvDates(model.getInvDates());
		
		return response;
	}
	
	private int convertInt(String dayOfWeekMonthly) {
		Integer tempInt;
		try {
			tempInt=Integer.parseInt(dayOfWeekMonthly);
								
		}catch(NumberFormatException e) {
			if((dayOfWeekMonthly.equals("MONDAY") ||
					dayOfWeekMonthly.equals("TUESDAY") ||
					dayOfWeekMonthly.equals("WEDNESDAY") ||
					dayOfWeekMonthly.equals("THURSDAY") ||
					dayOfWeekMonthly.equals("FRIDAY") ||
					dayOfWeekMonthly.equals("SATURDAY") ||
					dayOfWeekMonthly.equals("SUNDAY"))!=true) {
				String msg="Validation Fail: Subscription Weekly on Day of Week have invalid value.";
				throw new BadRequestException(Response.status(Status.BAD_REQUEST)
		                .entity(msg).build());				
			}else {
				switch (dayOfWeekMonthly)
				{
					case "MONDAY":
						tempInt=1;
						break;
					case "TUESDAY":
						tempInt=2;
						break;
					case "WEDNESDAY":
						tempInt=3;
						break;
					case "THURSDAY":
						tempInt=4;
						break;
					case "FRIDAY":
						tempInt=5;
						break;
					case "SATURDAY":
						tempInt=6;
						break;
					case "SUNDAY":
						tempInt=7;
						break;
					default:
						tempInt=0;
				}
			}
		}
		return tempInt;
	}
}
