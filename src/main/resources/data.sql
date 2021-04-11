DROP TABLE IF EXISTS Travel;

CREATE TABLE Travel (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  traveller_name VARCHAR(250) NOT NULL,
  country VARCHAR(250)
);

INSERT INTO Travel (traveller_name, country) VALUES
  ('Aliko', 'Dangote'),
  ('Bill', 'Gates'),
  ('Folrunsho', 'Alakija');