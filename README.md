# conichi

this project is about making a micro services architecture for getting current time and currency conversion and getting 
code country from a valid vat number.
this project contains 7 parts :
1/ current time project

2/ currency conversion project

3/ vat number project

4/clientui project where we can test all the 3 project in html display

5/ config server is the project that will contain the configuration if exist example if we want to put configuration of the 
application.properties in external file if we are going to use a lot of instance for the same project

6/ eureka server project is the registry project that show the instance of the existing project we can have more then one 
for the same project

7/ zuul project the api gateway 

we can test every project directy or we can pass by the clientui or we can use zuul

clientui: port 8081
configServer: port 9101
convert currency: port 9003
current time : port 9001
eureka server : port 9102
vat country : port 9004
zuul server : port 9005



example to test the currency conversion service:
on port 9003
 from USD to EUR and quantity 5
 directly from the currency project => http://localhost:9003/api/currency/convert/from/USD/to/EUR/quantity/5
 
 from the client ui project => http://localhost:8081/api/currency/convert/from/USD/to/EUR/quantity/5
 
 from the zuul api gateway => http://localhost:9005/microservice-convertCurrency/api/currency/convert/from/USD/to/EUR/quantity/5
