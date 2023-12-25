# OOAD Backend




## Starting application
First navigate to the root folder of the application.
```
cd ooad_backend
```

Clean and build java package:
```bash
./mvnw clean package
```
Build docker file
```bash
docker build . --no-cache
```

### Running with Dev environment 
```bash
docker run --rm -e "spring.profiles.active=dev" -p "5001:5001" -p "5002:5002" {Builded_image}
```

### Running with Staging environment 
```bash
docker run --rm -e "spring.profiles.active=staging" -p "5001:5001" -p "5002:5002" {Builded_image}
```

### Running with Local environment
Run the application
```bash
java -jar -Dspring.profiles.active=local target/pandax-ws-{Artifact_version}.jar
```

If the local does not have PostgresDB, we can create a `docker-compose.yaml` file.
```
touch docker-compose.yaml
```
Copy the following code into to `docker-compose.yaml` file.
```yaml
version: '3'
services:
  db:
    image: postgres:16.0
    container_name: db
    ports:
      - "5432:5432"
    environment:
      - POSTGRES_PASSWORD=postgres
      - POSTGRES_USER=postgres
      - POSTGRES_DB=bokkit

```
Then run the `docker-compose.yaml` with the following command.
```
docker-compose up -d
```
Then run again your application.

