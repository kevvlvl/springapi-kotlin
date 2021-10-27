CREATE TABLE student(
    id  SERIAL PRIMARY KEY,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    major VARCHAR(255)
);

INSERT INTO student(firstname, lastname, major)
    VALUES('Austin', 'Powerz', 'Major in Shag Yeah');

INSERT INTO student(firstname, lastname, major)
    VALUES('James', 'Bont', 'Licensed to Kill');

INSERT INTO student(firstname, lastname, major)
    VALUES('Hank', 'Scorpion', 'World Domination');