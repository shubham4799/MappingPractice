# Mapping Practice
This project is a Mapping Practice built using Spring Boot with Java.



## Framework Used
* Spring Boot



## Language Used
* Java



## Data Model

The All ...ModelClass  is defined inside the model packages which has the following attributes:
   
   inside Student Model:-
   
private String ID
private String name
private String age
private String phoneNumber
private String branch<
private String department

@OneToOne
private Address address
  
Laptop Model:-
 
private String ID
private String name
private String brand
private Integer price

@OneToOne
private Student student
  
 Course Model:- 
 
private String ID
private String title
private String description
private String duration

@ManyToMany
List<Student> studentList
   
 Book Model:- 
   
private String ID
private String title
private String author
private String description
private String price

@ManyToOne
private Student student
  
  Address Model:- 
   
private Long addressId;private String landmark
private String zipcode
private String district
private String state
private String country



## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.



## Functions used :-

### API Endpoints :-

 addAddress

* PostMapping:

This endpoint makes a call to method in Service class which is connected to database. In database we add a new given through API.


* GetMapping: 

This endpoint returns all data through API.


* PutMapping: 

This endpoint makes a call to method in Service class which is connected to database. In database we update.


* DeleteMapping: 

This endpoint makes a call to method in Service class which is connected to database. In database we delete through API.



## JpaRepository extended by Repository interface.


We have used JpaRepository to implement CRUD Operations.



## Project Summary

I have created Mapping Practice project.  In this project I have used @OneToOne , @ManyToOne , @ManyToMany mapping , user can add the Address , Student , Course , Book , Laptop.  Can delete , update , get ,  can find. etc...

