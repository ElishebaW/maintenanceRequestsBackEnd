CREATE TABLE IF NOT EXISTS app_users(
user_id INT NOT NULL PRIMARY KEY,
role VARCHAR NOT NULL,
location VARCHAR NOT NULL,
photo BYTEA
)
