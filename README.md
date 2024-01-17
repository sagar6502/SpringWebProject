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

