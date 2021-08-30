CREATE SCHEMA `producto` DEFAULT CHARACTER SET utf8 ;

USE `producto`;

DROP TABLE IF EXISTS `Productos`;
CREATE TABLE Productos (
	  codigo INTEGER PRIMARY KEY AUTO_INCREMENT,
	  nombre TEXT,
	  precio REAL,
	  inventario INTEGER
);
	  
INSERT INTO Productos(nombre, precio, inventario) values ('Manzanas', 5000, 25);
INSERT INTO Productos(nombre, precio, inventario) values ('Limones', 2300, 15);
INSERT INTO Productos(nombre, precio, inventario) values ('Peras', 2700, 33);
INSERT INTO Productos(nombre, precio, inventario) values ('Arandanos', 9300, 5);
INSERT INTO Productos(nombre, precio, inventario) values ('Tomates', 2100, 42);
INSERT INTO Productos(nombre, precio, inventario) values ('Fresas', 4100, 3);
INSERT INTO Productos(nombre, precio, inventario) values ('Helado', 4500, 41);
INSERT INTO Productos(nombre, precio, inventario) values ('Galletas', 500, 8);
INSERT INTO Productos(nombre, precio, inventario) values ('Chocolates', 3500, 80);
INSERT INTO Productos(nombre, precio, inventario) values ('Jamon', 15000, 10);
INSERT INTO Productos(nombre, precio, inventario) values ('Lulos', 3500, 50);
INSERT INTO Productos(nombre, precio, inventario) values ('Qwi', 5600, 50);
INSERT INTO Productos(nombre, precio, inventario) values ('Maracuya', 5000, 30);
INSERT INTO Productos(nombre, precio, inventario) values ('Papaya', 3500, 150);
INSERT INTO Productos(nombre, precio, inventario) values ('Mango', 2000, 50);
INSERT INTO Productos(nombre, precio, inventario) values ('Mora', 4100, 3);
INSERT INTO Productos(nombre, precio, inventario) values ('Naranja', 4500, 41);
INSERT INTO Productos(nombre, precio, inventario) values ('Níspero', 4500, 25);
INSERT INTO Productos(nombre, precio, inventario) values ('Piña', 3500, 80);
INSERT INTO Productos(nombre, precio, inventario) values ('Pomelo', 5000, 50);