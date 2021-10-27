FROM postgres:alpine3.14

COPY student-bootstrap.sql /docker-entrypoint-initdb.d/

EXPOSE 5432