CREATE TABLE `fabrica`.`fabrica` ( `numero_fabrica` INT(20) NOT NULL AUTO_INCREMENT , 
                                  `cantidad_empleados` INT(20) NOT NULL , 
                                  `pais` TEXT NOT NULL , 
                                  `gerente` TEXT NOT NULL ,
                                  PRIMARY KEY (`numero_fabrica`)) ENGINE = InnoDB; 
