## Install

This technical test runs on Docker container. That means that you'll have to install the docker engine

[https://docs.docker.com/installation/](https://docs.docker.com/installation/)

## Application

### Prepare

1. Clone the luisovando/codster repository:
```
SSH Connection 

git@github.com:luisovando/codster.git && \
cd codster
```

```
Https Connection 

https://github.com/luisovando/codster.git && \
cd codster
```
### Start application

Pull containers, install dependencies, create database and start

1. Ensure you are in project folder
2. First run will take some time (around 5-10 minutes) to download dependencies:
   ```
   docker-compose up
   ```
3. Out setup include a JVM debugger, when the microservice is loading, it will stop for you to 
connect the debugger of your IDE on port **5007**.   

4. At this point website should be available on http://localhost:8080/demo.  
To shutdown application use `docker-compose down` and to start again `docker-compose up -d` or 
`docker-compose up` to see containers logs.

  
 ## Database Migrations
   
 I'm use Flyway as database VCS, go to [FlywayDB](https://flywaydb.org) for more info

 ### Run migrations

 Only build a new system version 😃, Spring perform database migration on init.
