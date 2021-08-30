SELECT nombre, inventario FROM productos WHERE precio >= 9200 ORDER BY nombre ASC;
SELECT AVG(precio) as promedio FROM productos;
SELECT nombre, precio FROM productos WHERE nombre LIKE "A%" OR nombre LIKE "P%" ORDER BY nombre ASC;
SELECT COUNT(nombre) as total FROM productos WHERE precio BETWEEN 3000 AND 10000;
SELECT SUM(precio*inventario) as total_inventario FROM productos;