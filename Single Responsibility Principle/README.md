	<!-- Single Responsibility Principle -->
	# Single Responsibility Principle


	> **A CLASS SHOULD HAVE ONE, AND ONLY ONE REASON TO CHANGE.**


	This means when we design our classes, we need to ensure that our class is responsible only for 1 task or functionality and when there is a change in that task/functionality, only then, that class should change.



	<!-- Benefits of Single Responsibility Principle -->

	## Benefits of Single Responsibility Principle
	* When an application has multiple classes, each of them following this principle, then the applicable becomes more maintainable, easier to understand.	
	* The code quality of the application is better, thereby having fewer defects.
	* Onboarding new members are easy, and they can start contributing much faster.
	* Testing and writing test cases is much simpler


	<!-- Code Explanation-->

	## Code Explanation

	We have a Customer class that has customer attributes like name, address. Order class has all order information like item name, quantity.

	The BillCalculation class calculates the total bill sets the bill amount in the order object. The DeliveryApp has 1 task of delivering the order to the customer. In the real world, these classes would be more complex and might require their functionality to be further broken down into multiple classes. 

	For example, the bill calculation logic might require some kind of lookup functionality to be implemented where we look for the price of each item included in the order against some kind of database, add them up, add taxes, delivery charges, etc and finally reach the total price. Depending on how complex the code starts to become, we might want to move the taxes, database queries etc, to other separate classes. Similarly, the delivery class might want to interface with another task management system that actually assigns the task of delivery to different delivery agents based on location, shift timings, whether that delivery person has actually shown up to work, etc. These individual steps could move to separate classes when they need specialized handling. 

	If the functionality of bill calculation, as well as order delivery, was added in the same class, then that class gets modified whenever the bill calculation logic or the delivery agent logic needs to change; which goes against the Single Responsibility Principle.  As per the example, we have a separate class for handling each of these functions. Any single business requirement change should ideally have an impact on only one class, thus catering to the Single Responsibility Principle.

