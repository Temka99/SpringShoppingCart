CREATE table category(
   id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(50) NOT NULL,
   description VARCHAR(255) NOT NULL,
   image_url VARCHAR(50) NOT NULL,
   is_active TINYINT NOT NULL,
   PRIMARY KEY ( tutorial_id )
);

insert into category (name,description,image_url,is_active) values ('Mobile','This is the simple description of Mpbile','CAT_1.png',true);
insert into category (name,description,image_url,is_active) values ('Television','This is the simple description of TV','CAT_2.png',true);
insert into category (name,description,image_url,is_active) values ('Laptop','This is the simple description of Laptop','CAT_3.png',true);


CREATE table user_detail(
   id INT NOT NULL AUTO_INCREMENT,
   first_name VARCHAR(50) NOT NULL,
   last_name VARCHAR(50) NOT NULL,
   role VARCHAR(50) NOT NULL,
   enabled TINYINT NOT NULL,
   password VARCHAR(50) NOT NULL,
  email VARCHAR(100) ,
  contact_number VARCHAR(50),
   PRIMARY KEY ( id )
);

insert into user_detail (first_name,last_name,role,enabled,password,email,contact_number) values ('Artem','Zhmaka','ADMIN',true,'admin','zhmaka99@gmail.com','888888888');
insert into user_detail (first_name,last_name,role,enabled,password,email,contact_number) values ('Ravindra','Jadeja','SUPPLIER',true,'12345','rj@gmail.com','999999999');
insert into user_detail (first_name,last_name,role,enabled,password,email,contact_number) values ('Oleksandra','Kalkina','SUPPLIER',true,'12345','kalkina@gmail.com','777777777');


CREATE table product(
   id INT NOT NULL AUTO_INCREMENT,
   code VARCHAR(50) NOT NULL,
   name VARCHAR(50) NOT NULL,
   brand VARCHAR(50) NOT NULL,
   description VARCHAR(255) NOT NULL,
   unit_price DECIMAL(10,2),
   quantity INT NOT NULL,
   is_active TINYINT NOT NULL,
   category_id INT,
   supplier_id INT,
   purchases INT DEFAULT 0,
   views INT DEFAULT 0,
   PRIMARY KEY ( id ),
   FOREIGN KEY (category_id) REFERENCES category(id),
   FOREIGN KEY (supplier_id) REFERENCES user_detail(id),
   
);


INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDABC123DEFX', 'iPhone 5s', 'apple', 'This is one of the best phone available in the market right now!', 18000, 5, true, 3, 2 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDDEF123DEFX', 'Samsung s7', 'samsung', 'A smart phone by samsung!', 32000, 2, true, 3, 3 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDPQR123WGTX', 'Google Pixel', 'google', 'This is one of the best android smart phone available in the market right now!', 57000, 5, true, 3, 2 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDMNO123PQRX', ' Macbook Pro', 'apple', 'This is one of the best laptops available in the market right now!', 54000, 3, true, 1, 2 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDABCXYZDEFX', 'Dell Latitude E6510', 'dell', 'This is one of the best laptop series from dell that can be used!', 48000, 5, true, 1, 3 );
