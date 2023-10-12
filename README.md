# SpringBootProject
It is a basic Springboot project that implements Rest API.

This project contains simple API method to fetch the data.

we have created a project that contains different types of courses. An ArrayList contains different types of courses with their names, IDs, and descriptions.
With the help of different methods Like addcourse , getcourse ,updatecourse, and delete course we can perform different operations.
GET, POST, PUT, DELETE APIs are used.

To fetch all the courses from the list :
we have used GET request by sending the "/courses " URL.

To fetch a particular course from the list :
we have used GET request by sending the "/course(courseId)" URL. That a return a particular course which contains the given  course IDs.

To Add the course :
we have used POST request by sending "(/courses)". we added the course in JSON format in the B0dy in the raw part.


To Update the course which is already present:
we have used POST request by sending ("/courses"). we edit the course which we have to update in the Body in the raw part and the edit will be only in JSON format.

To delete the course which is already present :
we have used the DELETE request by sending the course IDs which have to be deleted with the help of this URL ("/courses/{courseId}").
