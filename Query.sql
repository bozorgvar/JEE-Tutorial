-- this file contains table creation for starting the tutorial
CREATE TABLE ANIMAL (animal_id INT NOT NULL AUTO_INCREMENT, `type` VARCHAR(33), total_no INT, category_id INT, PRIMARY KEY (animal_id));
CREATE TABLE STAFF (STAFF_ID INT NOT NULL AUTO_INCREMENT, AGE INT, GENDER VARCHAR(191), `NAME` VARCHAR(191), SALLARY INT, PRIMARY KEY (STAFF_ID));
CREATE TABLE ANIMAL_FOOD_ITEM (animal_id INT NOT NULL, food_item_id INT NOT NULL, PRIMARY KEY (animal_id, food_item_id));
CREATE TABLE CAGE (cage_id INT NOT NULL, cage_no VARCHAR(33), location VARCHAR(33), animal_id INT, PRIMARY KEY (cage_id));
CREATE TABLE CATEGORY (category_id INT NOT NULL AUTO_INCREMENT, category_type VARCHAR(33), PRIMARY KEY (category_id));
CREATE TABLE EMERGENCY (emergency_id INT NOT NULL AUTO_INCREMENT, `type` VARCHAR(33), `case` VARCHAR(108), emergencycol VARCHAR(108), PRIMARY KEY (emergency_id));
CREATE TABLE EXTERNAL_VET (vet_id INT NOT NULL, external_vetcol VARCHAR(33), visiting_fees INT, PRIMARY KEY (vet_id));
CREATE TABLE FOOD_ITEM (food_item_id INT NOT NULL AUTO_INCREMENT, `name` VARCHAR(33), quantity VARCHAR(33), supplier_id INT, PRIMARY KEY (food_item_id));
CREATE TABLE IN_HOUSE_VET (vet_id INT NOT NULL, salary INT, PRIMARY KEY (vet_id));
CREATE TABLE SUPPLIER (supplier_id INT NOT NULL AUTO_INCREMENT, supplier_name VARCHAR(33), supplier_no INT, address VARCHAR(33), PRIMARY KEY (supplier_id));
CREATE TABLE VET (vet_id INT NOT NULL AUTO_INCREMENT, `name` VARCHAR(33), PRIMARY KEY (vet_id));
------
ALTER TABLE `ZOODB`.`CAGE` 
  ADD CONSTRAINT `cage_animal_FK`
  FOREIGN KEY (`animal_id` )
  REFERENCES `ZOODB`.`ANIMAL` (`animal_id` )
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
, ADD INDEX `cage_animal_FK` (`animal_id` ASC) ;

ALTER TABLE `ZOODB`.`ANIMAL` 
  ADD CONSTRAINT `animal_category_FK`
  FOREIGN KEY (`category_id` )
  REFERENCES `ZOODB`.`CATEGORY` (`category_id` )
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
, ADD INDEX `animal_category_FK` (`category_id` ASC) ;




INSERT INTO ZOODB.ANIMAL (`type`, total_no, category_id) VALUES ('Elephant', 2, 1);
INSERT INTO ZOODB.ANIMAL (`type`, total_no, category_id) VALUES ('zibra', 3, 1);
INSERT INTO ZOODB.ANIMAL (`type`, total_no, category_id) VALUES ('lion', 2, 1);
INSERT INTO ZOODB.ANIMAL (`type`, total_no, category_id) VALUES ('snake', 5, 3);
INSERT INTO ZOODB.ANIMAL (`type`, total_no, category_id) VALUES ('owl', 6, 2);
INSERT INTO ZOODB.ANIMAL (`type`, total_no, category_id) VALUES ('turtle', 24, 3);
INSERT INTO ZOODB.ANIMAL (`type`, total_no, category_id) VALUES ('chicken', 8, 2);

INSERT INTO ZOODB.STAFF (AGE, GENDER, `NAME`, SALLARY) VALUES (200, 'M', 'raj', 100);
INSERT INTO ZOODB.STAFF (AGE, GENDER, `NAME`, SALLARY) VALUES (200, 'M', 'raj', 100);
INSERT INTO ZOODB.STAFF (AGE, GENDER, `NAME`, SALLARY) VALUES (200, 'M', 'raj', 100);

INSERT INTO ZOODB.ANIMAL_FOOD_ITEM (animal_id, food_item_id) VALUES (2, 2);
INSERT INTO ZOODB.ANIMAL_FOOD_ITEM (animal_id, food_item_id) VALUES (2, 3);

INSERT INTO ZOODB.CATEGORY (category_type) VALUES ('mamal');
INSERT INTO ZOODB.CATEGORY (category_type) VALUES ('bird');
INSERT INTO ZOODB.CATEGORY (category_type) VALUES ('reptile');

INSERT INTO ZOODB.FOOD_ITEM (`name`, quantity, supplier_id) VALUES ('meat', '300', NULL);
INSERT INTO ZOODB.FOOD_ITEM (`name`, quantity, supplier_id) VALUES ('sprouted beans', '100', NULL);
INSERT INTO ZOODB.FOOD_ITEM (`name`, quantity, supplier_id) VALUES ('oats', '50', NULL);