CREATE DATABASE IF NOT EXISTS statistic;
CREATE TABLE IF NOT EXISTS statistic.request_info (
 request_id DECIMAL(10,0) NOT NULL PRIMARY KEY,
 request_code VARCHAR(5) NOT NULL,
 user_id VARCHAR(5),
 create_date VARCHAR(10)
);
INSERT IGNORE INTO statistic.request_info (request_id,request_code,user_id,create_date) VALUES
(1,'L','AAA','2408180520'),(2,'O','DDD','2404040404'),
(3,'L','BBB','2206220920'),(4,'L','CCC','1906220920');
