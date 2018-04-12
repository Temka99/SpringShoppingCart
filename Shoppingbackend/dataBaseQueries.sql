CREATE table category(
   id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(50) NOT NULL,
   description VARCHAR(255) NOT NULL,
   image_url VARCHAR(50) NOT NULL,
   is_active TINYINT NOT NULL,
   PRIMARY KEY ( tutorial_id )
);