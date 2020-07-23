CREATE TABLE IF NOT EXISTS maintenance_requests(
 user_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
 location VARCHAR NOT NULL,
 status VARCHAR NOT NULL,
 date_witnessed TIMESTAMP NOT NULL,
 description VARCHAR(500) NOT NULL,
 photo BLOB
)

CREATE TABLE IF NOT EXISTS user(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    role VARCHAR(50) NOT NULL,
    location VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    maintenance_id INT NOT NULL
)
