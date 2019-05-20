--DROP SEQUENCE PRODUCT_ID_SEQUENCE
--ALTER TABLE Products ENABLE TABLE LOCK;
--drop table products;

create table Products
(
Id number(5) primary key,
Type varchar2(50) not null,
Name varchar2(50) not null,
Price numeric(10,2) not null
);


SET DEFINE OFF;
Insert into PRODUCTS (ID,TYPE,NAME,PRICE) values ('1','Monitor','AGM','199');
Insert into PRODUCTS (ID,TYPE,NAME,PRICE) values ('2','Monitor','LG','1500');
Insert into PRODUCTS (ID,TYPE,NAME,PRICE) values ('3','MOUSE','LOGITECH','20');
Insert into PRODUCTS (ID,TYPE,NAME,PRICE) values ('4','PC','LENOVO','5000');
Insert into PRODUCTS (ID,TYPE,NAME,PRICE) values ('5','KEYBOARD','LOGITECH','50');
Insert into PRODUCTS (ID,TYPE,NAME,PRICE) values ('19','TT','ssaa','212');



--ALTER TABLE Products DISABLE TABLE LOCK;
CREATE SEQUENCE PRODUCT_ID_SEQUENCE INCREMENT BY 1 START WITH 6 MINVALUE 1;

SELECT ID, TYPE, NAME, PRICE
FROM PRODUCTS;

INSERT 
INTO  Products 
VALUES (PRODUCT_ID_SEQUENCE.nextval, 'PC', 'XNOTE', 212);

UPDATE PRODUCTS
SET 
TYPE = 'Monitor',
NAME = 'LG',
PRICE = 100
WHERE ID = 2;


DELETE 
FROM PRODUCTS 
WHERE ID = 2
