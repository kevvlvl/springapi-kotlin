# springapi-rql

A simple Spring Reactive REST API showcasing RQL (REST query language)

## Setup

Run the Postgres database

```
docker build -t student-postgres -f postgres.Dockerfile.
docker image ls
docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=studentdb --name student-postgres student-postgres
docker container ls
```

Test the API

```
curl localhost:8080/student/1   <-- (try 1, 2, or 3)
curl localhost:8080/student/all <-- Returns all sorted by lastname ascending

```