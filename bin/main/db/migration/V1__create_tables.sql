CREATE TABLE user (
    id INT NOT NULL PRIMARY KEY,
    role VARCHAR(50) NOT NULL,
    location VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    maintenance_id INT NOT NULL
);

CREATE TABLE maintenance_requests (
 id INT NOT NULL PRIMARY KEY,
 location VARCHAR NOT NULL,
 status VARCHAR NOT NULL,
 date_witnessed TIMESTAMP NOT NULL,
 description VARCHAR(500) NOT NULL,
 photo BLOB
)