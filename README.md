#<h1>Spring Boot Set Up</h1>

#<h3>1) Create new project</h3>

Go to https://start.spring.io/ 

fill the form

Project : maven or gradle any what you want.

Language : java

Spring Boot : 2.1.8

Group : com.setup (your project name) 

Artifact : setup(your short project name) 

Dependencies : Spring Web , Spring Data JPA,  MySql Driver

Now Click on Generate the project Button

Then it will download the project

unzip it and import on IDE

#<h3>2) Import/Open on Intellij IDE</h3>

Click on import or open project
select the pom.xml or build.gradle file from your project path
click on open as project
Then it will take few minutes to downloads the dependencies

#<h3>3) Database Config</h3>

Got to src/main/resources/application.properties and open it.

Write following :

	spring.datasource.url=jdbc:mysql://localhost:3306/setup
	spring.datasource.username=dhiraj
	spring.datasource.password=

	spring.jpa.hibernate.ddl-auto=update
	spring.jpa.show-sql=false
	spring.datasource.platform=SELECT 1
	
Create Database setup on Mysql.

#<h3>4) Web Config</h3>

Got to src/main/resources/application.properties and open it.
Write following :

	server.port=8081
	spring.mvc.view.prefix=/pages/
	spring.mvc.view.suffix=.jsp
	spring.resources.static-locations=classpath:/resources/
	logging.level.org.springframework=TRACE
	logging.level.com=TRACE

Inside main package/directory create new directory i.e.   webapp

Inside webapp   directory create new  directory i.e. pages

Inside webapp   directory create new  directory i.e.  resources

Inside resources directory create new directories for js, css, img etc. and add required files like bootstrap.min.css etc.

Now inside pages  directory create new jsp file as index.jsp with Hello world World text

#<h3>5) Add Required Dependencies</h3>

Open pom.xml incase of maven
add <packaging>jar</packaging>
add following  dependencies

	<dependency>
          	<groupId>org.springframework.boot</groupId>
          	<artifactId>spring-boot-starter-tomcat</artifactId>
          	<scope>compile</scope>
	</dependency>
       
	<dependency>
          	<groupId>org.apache.tomcat.embed</groupId>
          	<artifactId>tomcat-embed-jasper</artifactId>
          	<scope>compile</scope>
	</dependency>
      
	<dependency>
           	<groupId>commons-logging</groupId>
           	<artifactId>commons-logging</artifactId>
           	<version>1.2</version>
	</dependency>
      
	<dependency>
         	<groupId>javax.servlet</groupId>
         	<artifactId>jstl</artifactId>
         	<version>1.2</version>
	</dependency>
	
       
Refresh the maven 

#<h3>6) Index Controller</h3>
Go to src/main/java/com/setup/setup/ and create new package controller.
Inside that controller package create new class IndexController.java.
Inside that class write following codes:

	package com.setup.setup.controller;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class IndexController {
    	
		@GetMapping("/")
    		public String index(){
        		return "index";
    		}
	}
	
Go to the main class ie src/main/java/com/setup/setup/SetupApplication.java , in that class add @ComponentScan({"com.setup.setup.service" , "com.setup.setup.controller"}) on top of the class. We need to put the package location in which we use @service , @Component , @Controller etc annotations.   

#<h3>7) Run</h3>
Click to run button
