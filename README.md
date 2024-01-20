# SpringWebProject

A RESTful API is an architectural style for an application program interface (API) that uses HTTP requests to access and use data. That data can be used to GET, PUT, POST and DELETE data types, which refers to the reading, updating, creating and deleting of operations concerning resources.

Create Spring project with Dev-tools, JPA-h2, and Web for dependencies. 
Spring boot version 3.2.1

Instead of requestMapping, getMapping, postMapping also can be used.

How requests are handled?
	DispatcherServlet - Front Controller Pattern [In log: Mapping servlets]
	Auto-Configuration(dispatacherServletAutoConfiguration)

How does HelloWorldBean Object get converted to JSON?
	@ResponseBody + JacksonHttpMessageConverters
	Auto Configuration (JacksonHttpMessageConvertersConfiguration)


How are all jars available(Spring, Spring MVC, Jackson, Tomcat)
Starter projects - Spring Boot Starter Web (Spring-webmvc, spring-web, spring-boot-starter tomcat, spring-boot-starter-json)

Request Methods for REST API
GET - Retrieve Details of a resource
POST - Create a new resource
PUT - Update an existing resource
PATCH - Update part of a resource
DELETE - Delete a resource

To trigger post request, we need REST_API client to trigger it. Hence, we make use of "Talend API Tester - Free Edition" chrome extension.

To open :
http://localhost:8080/swagger-ui.html - Swagger UI
http://localhost:8080/v3/api-docs - OpenAPI docs

Internationalization implemented using messages.properties.
For Getting the values a/c to messages properties defined, use accpet-language header and pass the _* properties defined.



