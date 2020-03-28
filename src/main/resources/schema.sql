DROP TABLE IF EXISTS ANIMALES;

CREATE TABLE ANIMALES(
id_animal INT AUTO_INCREMENT PRIMARY KEY,
tipo_animal varchar(60) NOT NULL ,
raza_animal varchar(60) NOT NULL,
color_animal varchar(60) NOT NULL,
pelaje_animal varchar(60) NOT NULL,
fecha_nacimiento varchar(60) NOT NULL,
vacuna_animal tinyint NOT NULL DEFAULT '0',
adoptado tinyint NOT NULL DEFAULT '0',
adoptante varchar(255) DEFAULT NULL ,
img longblob,
str text);