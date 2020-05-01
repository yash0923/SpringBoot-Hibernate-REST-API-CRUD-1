# SpringBoot-Hibernate-REST-API-CRUD-1
SpringBoot Hibernate REST API CRUD 1


Create a database:- persons

Run on java application

Open a postman

this app will start running on http://localhost:8080/api/v1.0

1.) To save the record (Use post method) (choose post method in postman)

    http://localhost:8080/api/v1.0/persons/

    Write this on postman(select body, in body header, choose raw and change into JSON(application/json))

    {
	    "firstName" : "dodod",
	    "lastName" : "hhhhhhhh"
    }


2.) To retrieve all the data from the database (use get method)( choose get method in postman)

     
     http://localhost:8080/api/v1.0/persons
     
 
 3.) To retrieving the single data from database (use get method)(choose get method in postman)
 
       
       http://localhost:8080/api/v1.0/persons/{id}    eg (1 or 2 or 3 etc......)
    

4.)  To update the data or record (use put method)( choose put method in postman)

       Write this on postman(select body, in body header, choose raw and change into JSON(application/json))


        http://localhost:8080/api/v1.0/persons/{id}     eg  (1 or 2 or 3 etc....)
        
        {
        	"firstName" : "Jihanaaaaa ",
	        "lastName" : "Javdavaaaaa"
         }
        
        
  5.) to delete the data from database (use delete method)( choose delete method in postman)
  
      
      http://localhost:8080/api/v1.0/persons/{id}     eg  (1 or 2 or 3 etc....)
      

    

