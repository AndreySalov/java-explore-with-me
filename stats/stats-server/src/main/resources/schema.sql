DROP TABLE IF EXISTS hits CASCADE;

CREATE TABLE IF NOT EXISTS hits
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    uri       VARCHAR(140) NOT NULL,
    app       VARCHAR(140) NOT NULL,
    ip        VARCHAR(50)  NOT NULL,
    timestamp TIMESTAMP    NOT NULL
);