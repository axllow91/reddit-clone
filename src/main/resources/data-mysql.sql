INSERT INTO link(id,creation_date,last_modified_date, created_by, last_modified_by, title, url)
VALUES
(1, NOW(), NOW(), null, null, 'Getting started with Spring Boot 2', 'www.google.com');

INSERT INTO comment(id,created_by,creation_date, last_modified_by, last_modified_date, body, link_id) VALUES
(1, null, NOW(), null, NOW(), 'What an awesome project', 1);