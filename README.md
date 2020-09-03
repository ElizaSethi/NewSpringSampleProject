# NewSpringSampleProject
A sample Spring MVC Application

## Tools and Technologies Used

* Tomcat 9.0.37
* Spring 5.2.3
* JDK 13
* Eclipse 2020-06 (4.16.0)

## Spring MVC Architecture



## Steps of Development

1. Create a Dynamic Web Project
2. Convert project to Maven Project (Apache Maven is a build automation and dependency management tool)
3. Add dependencies to pom.xml
4. Create new Spring configuration bean NewSpringSample-servlet.xml
    > **'<context:component-scanbase-package="com.sample.controller" />'**, allow Spring to load all the components of 'com.sample.controller' package and child packages.
5. Map Spring MVC using web.xml
    > Mapping **DispatcherServlet** with url pattern '/welcome.jsp' and '/index.jsp'. After DispatcherServlet initialization, it will look for **NewSpringSample-servlet.xml** under WEB-INF.
6. Create controller class
    > When Spring scans our package, it will recognize this bean as being a **Controller** bean for processing requests. The **@RequestMapping** annotation tells Spring that this Controller should process all requests beginning with /welcome in the URL path. That includes /welcome/* and /welcome.html. 
    
    
    > The **myWelcomeMethod()** returns **ModelAndView** object. The ModelAndView object tries to resolve to a view named **“welcome”** and the data model is being passed back to the browser so we can access the data within the JSP. The logical view name will resolve to */WEB-INF/jsp/welcome.jsp* . 
    
    
    > The ModelAndView object also contains a message with key **“message”** and Detailed value. This is the data that we are passing to our view. Normally this will be a value object in form of java bean that will contain the data to be displayed on our view. Here we are simply passing a string.
