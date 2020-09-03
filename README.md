# NewSpringSampleProject
A sample Spring MVC Application

## Tools and Technologies Used

* Tomcat 9.0.37
* Spring 5.2.3
* JDK 13
* Eclipse 2020-06 (4.16.0)

## Steps of Development

1. Create a Dynamic Web Project
2. Convert project to Maven Project (Apache Maven is a build automation and dependency management tool)
3. Add dependencies to pom.xml
4. Create new Spring configuration bean NewSpringSample-servlet.xml
    > '<context:component-scanbase-package="com.crunchify.controller" />', allow Spring to load all the components of 'com.crunchify.controller' package.
