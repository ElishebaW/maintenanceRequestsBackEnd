CREATE TABLE IF NOT EXISTS maintenance_requests(
 id INT NOT NULL PRIMARY KEY,
 location VARCHAR NOT NULL,
 status VARCHAR NOT NULL,
 date_witnessed TIMESTAMP NOT NULL,
 description VARCHAR(500) NOT NULL,
 photo BYTEA
)

