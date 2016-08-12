# Test Application with OAuth 2 Authentication

The application contains Authorization Service and Resorces Services (UserService, ProjectService and PhotoService)

## How to Run
* Clone the Repo to the local file system 
* Install [Docker Engine](https://docs.docker.com/engine/installation/). (Tested on 1.11.2)
* Install [Docker Compose](https://docs.docker.com/compose/install/).
* Configure User DB. Set the following env vaiables:
  * UWHIZ_DB_HOST=<docker engine ip>. 
  * UWHIZ_DB_USER=<User DB username>
  * UWHIZ_DB_PASS=<User DB user password>
  * UWHIZ_DB_ROOT_PASS=<User DB root passowrd>
* Start User DB MySQl Docker container. Run from project working directory:
```bash
$ docker-compose up
```  
* Build the Test App project. Run from projecect working dir:
```bash
$ gradlew build
```
* Run User Servive. Run from project working dir (then make sure DB migrations were applied):
```bash
$ gradlew UserService:bootRun
```
* Run Authorization Service. Run from project working dir:
```bash
$ gradlew AuthService:bootRun
```
