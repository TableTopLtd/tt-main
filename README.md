# TableTop Main microservice
[![Build Status](https://travis-ci.org/TableTopLtd/tt-main.svg?branch=master)](https://travis-ci.org/TableTopLtd/tt-main)
## When developing
  
  Run
  ```bash
  mvn clean package
  ```
  from repo root directory.
  
  To run application local jar, run:
  ```bash
  java -jar api/target/*.jar
  ```

To test the service you should go to
```
http://localhost:8090/v1/demo/info
```
To see the info list.

## Build docker image
```bash
docker build . -t tt-main:X
```

[Optional] Define your own X

## Run application in Docker
```bash
docker run -p 8090:8090 tt-places:X
```