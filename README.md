# prepChefsubs

Pages:

Login
----------
Java/Spring:

Retrieve userInfo from databse
Can we do auth tokens with Java or is that just React?

React/TypeScript:

If login successful, redirect to home screen. Otherwise send error. Include ability to sign up.


Home
----------

Java/Spring:

Retrieve subscription packages from database

React/TypeScript:

Display all sub information and links to individual product info pages


Package Information
----------

Java/Spring:

Retrieve information about package from database

React/TypeScript:

Display product info and allow purchase


Place Order
----------

Java/Spring:

Take order information from clientside and send it to Stripe to process
Tell Stripe API to set up subscription plan with userInfo
Save order info to database with timestamp

React/TypeScript:

Display all order info


Order Information
----------

Java/Spring:

After Place Order saves orderInfo to the database, retrieve orderInfo
If there aren’t any past orders return null

React/TypeScript:


Display order info
----------

User Profile

Java/Spring:

Access userInfo from app database
Send request to Stripe API with userInfo to confirm status of subscription
When user clicks “Renew subscription” or “Cancel Subscription”, send request to Stripe API and return whether the action was successful or not

React/TypeScript:

Section for userInfo and subscription status

Admin
----------

Java/Spring:

When admin adds, removes, or changes product, update productInfo in database
Allow admin to store all product attributes including photos and videos in database
When admin looks at all customers, request customers from database as well as making a request to Stripe API to update current subscription status
Have bool for active/inactive subscriptions for clientside to call in order to filter



React/TypeScript:

Expandable tabs with different management tools such as product editing, user editing, etc. 
