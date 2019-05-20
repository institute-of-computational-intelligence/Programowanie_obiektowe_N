create table PRODUCTS
(
"ID" numeric(10) primary key,
"type" varchar2(100) not null,
"name" varchar2(100) not null,
"price" numeric(10,2) not null
);


REM INSERTING into STUDENT_IISI.PRODUCTS
SET DEFINE OFF;
Insert into STUDENT_IISI.PRODUCTS (ID,"type","name","price") values ('1','Monitor','AGM','199');
Insert into STUDENT_IISI.PRODUCTS (ID,"type","name","price") values ('2','PC','DELL','2000');
Insert into STUDENT_IISI.PRODUCTS (ID,"type","name","price") values ('3','MOUSE','LOGITECH','20');
Insert into STUDENT_IISI.PRODUCTS (ID,"type","name","price") values ('4','PC','LENOVO','5000');
Insert into STUDENT_IISI.PRODUCTS (ID,"type","name","price") values ('5','KEYBOARD','LOGITECH','50');
