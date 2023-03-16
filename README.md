# loan-springboot
Hi,
I have made this application using JAVA,Spring boot and mongodbDB
Basically this application is created for showcasing CRUD operation and in this application I've also
implemented soft delete which basically doesn't delete the actual data from Database but when we delete
any data using the rest endpoint or website then it will show the user as deleted.

Here I'm mentioning the rest endpoints details for reference:-

For Creating a loan:-
Post method followed by http://localhost:8080/create

For updating a loan:-
Put method followed by http://localhost:8080/update

For deleting a loan:-
Delete method followed by http://localhost:8080/delete/Id

For getting all the loans:-
Get method followed by http://localhost:8080/loans

For getting specific loan by id:-
Get method followed by http://localhost:8080/loans/id
