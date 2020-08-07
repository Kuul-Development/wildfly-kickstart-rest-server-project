# Wildfly kickstart rest server project

[![Build Status](https://travis-ci.com/Kuul-Development/wildfly-kickstart-rest-server-project.svg?branch=master)](https://travis-ci.com/Kuul-Development/wildfly-kickstart-rest-server-project)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Kuul-Development_wildfly-kickstart-rest-server-project&metric=alert_status)](https://sonarcloud.io/dashboard?id=Kuul-Development_wildfly-kickstart-rest-server-project)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 
See deployment for notes on how to deploy the project on a live system. 

### Prerequisites

You need:
* Wildfly application server
* Apache Maven
* Java 14 (Azul 11.0.8)
* Docker (optionally)


### Installing

In the project directory, run

```
mvn clean package
```
to create the deployable war-file.


## Deployment

* Option 1: Deploy the war to WildFly. No further configuration should be necessary.
* Option 2: Use the Dockerfile to build and run a container image: 
    ```
    docker build . -t wildfly-kickstart
    docker run -p 8080:8080 wildfly-kickstart
    ```

## Accessing endpoints
Once the server is running, try to access the following endpoints:
* Hello-world endpoint: `http://localhost:8080/wildfly-kickstart-1.0-SNAPSHOT/rest/hello/world`
* More realistic endpoints: `http://localhost:8080/wildfly-kickstart-1.0-SNAPSHOT/rest/sell/allsalesmen`
  This should give an empty response. If the other endpoints defined in SalesmanViewFacade are used, it is possible to get
  a non-empty response from this endpoint.

## Contributing
Feel free to raise issues for this template if you have suggestions/problems.

## License

This project is licensed under the Apache License - see the [LICENSE](LICENSE) file for details.
