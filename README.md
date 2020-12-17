# Subscription Project

i'm using spring boot for this project and the SubscriptApplication.java is the starting point

this project have separate to 4 main sector:
- webservice api(SubscriptionApi.java)
- controller, which store all the logic, validation and process(SubscriptionController.java)
- model, which using for store the information in every stage (SubscriptionRequest.java,SubscriptInvModel.java,SubscriptionResponse.java)
- converter, mainly is doing converting data, from request to model, then from model to response (SubscriptionConverter.java)

for the testData folder is my test plan

http://localhost:8080/api/subscription
