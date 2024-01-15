# SpringWebProject
@SessionAttributes is used to store model attributes in the HTTP Servlet session between requests. It is a type-level annotation that declares the session attributes used by a specific controller. This typically lists the names of model attributes or types of model attributes that should be transparently stored in the session for subsequent requests to access.


JSTL(JSP Standard Tag Library) is a collection of custom tags that provide common functionalities like flow control, database operations, etc. JSTL tags can be embedded in Java Server Pages just like other HTML tags. It is convenient for front-end developers to work with HTML-like tags for including logic in webpages rather than writing Java code in scripts

In Java, JSP stands for Java Server Pages. It is a server-side technology which is used for creating web applications. It is used to create dynamic web content. JSP consists of both HTML tags and JSP tags. In this, JSP tags are used to insert JAVA code into HTML pages. It is an advanced version of Servlet Technology i.e. a web-based technology that helps us to create dynamic and platform-independent web pages. In this, Java code can be inserted in HTML/ XML pages or both. JSP is first converted into a servlet by the JSP container before processing the client’s request. JSP has various features like JSP Expressions, JSP tags, JSP Expression Language, etc.

Bootstrap is a free and open-source CSS framework directed at responsive, mobile-first front-end web development. It contains HTML, CSS and JavaScript-based design templates for typography, forms, buttons, navigation, and other interface components.

CSS is the language we use to style an HTML document.

CSS describes how HTML elements should be displayed.

After, changes made in pom.xml, always restart the server,Hence, Jar file get reloaded

https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/view.html

Spring Security is a powerful and customizable authentication and access control framework for Java applications, particularly those built using the Spring Framework. It provides comprehensive security services for Java EE-based enterprise software applications.

Key features of Spring Security include:

Authentication and Authorization: Spring Security provides robust mechanisms for authentication (verifying the identity of a user) and authorization (determining what actions a user is allowed to perform).

Declarative Security: You can express security constraints in a declarative way using annotations or XML configuration, making it easier to define and manage security rules.

Integration with Spring Framework: Spring Security integrates seamlessly with the broader Spring ecosystem. It can be easily integrated into Spring-based applications, such as those built with Spring MVC, Spring Boot, and other Spring projects.

Customization: Spring Security is highly customizable, allowing developers to tailor security configurations to specific application requirements. You can plug in custom authentication providers, access decision strategies, and more.

Support for Multiple Authentication Providers: Spring Security supports a wide range of authentication providers, including username/password, LDAP, OAuth, OpenID, and more.

Session Management: It provides session management features, allowing you to control how sessions are created, invalidated, or tracked.

Remember-Me Authentication: Spring Security supports "Remember-Me" authentication, allowing users to be remembered between sessions without having to log in every time.

Security Filters: The framework uses a series of filters to intercept requests and perform security-related operations, allowing you to customize the security processing chain.

CSRF Protection: Spring Security includes built-in protection against Cross-Site Request Forgery (CSRF) attacks.

Integration with External Authentication Providers: You can integrate Spring Security with external authentication providers, such as LDAP, OAuth, and others.

To use Spring Security in your project, you typically add the relevant dependencies to your build configuration (e.g., Maven or Gradle) and configure security settings in your application. It's a versatile framework that can be adapted to various security requirements, making it popular in enterprise Java development.


Cross-site request forgery, also known as one-click attack or session riding and abbreviated as CSRF or XSRF, is a type of malicious exploit of a website or web application where unauthorized commands are submitted from a user that the web application trusts.

In spring security, All URLs are protected
A login form is shown for unauthorized requests
CSRF disable
Frames - Spring does not allow frames