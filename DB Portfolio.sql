CREATE TABLE `aptitud` (
  `idAptitud` int NOT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  `Porcentaje` decimal(2,0) DEFAULT NULL,
  `Persona_idPersona` int NOT NULL,
  PRIMARY KEY (`idAptitud`,`Persona_idPersona`),
  KEY `fk_Aptitud_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_Aptitud_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `domicilio` (
  `idDomicilio` int NOT NULL,
  `Domicilio_Actual` tinyint DEFAULT NULL,
  `Domicilio` varchar(45) DEFAULT NULL,
  `Persona_idPersona` int NOT NULL,
  PRIMARY KEY (`idDomicilio`,`Persona_idPersona`),
  KEY `fk_Domicilio_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_Domicilio_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `educacion` (
  `idEducacion` int NOT NULL,
  `Titulo` varchar(45) DEFAULT NULL,
  `Centro_educacion` varchar(45) DEFAULT NULL,
  `Finalizado` tinyint DEFAULT NULL,
  `Fecha Inicio` date DEFAULT NULL,
  `Fecha Final` date DEFAULT NULL,
  `Promedio` decimal(1,0) DEFAULT NULL,
  `Persona_idPersona` int NOT NULL,
  PRIMARY KEY (`idEducacion`,`Persona_idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `experiencia laboral` (
  `idExperiencia Laboral` int NOT NULL,
  `nombreEmpresa` varchar(45) DEFAULT NULL,
  `esTrabajoActual` tinyint(1) DEFAULT NULL,
  `Fecha de Inicio` date DEFAULT NULL,
  `Fecha de Finalizacion` date DEFAULT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `Persona_idPersona` int NOT NULL,
  `Tipo de Empleo_idTipo de Empleo` int NOT NULL,
  PRIMARY KEY (`idExperiencia Laboral`,`Persona_idPersona`,`Tipo de Empleo_idTipo de Empleo`),
  KEY `fk_Experiencia Laboral_Persona_idx` (`Persona_idPersona`),
  KEY `fk_Experiencia Laboral_Tipo de Empleo1_idx` (`Tipo de Empleo_idTipo de Empleo`),
  CONSTRAINT `fk_Experiencia Laboral_Persona` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`),
  CONSTRAINT `fk_Experiencia Laboral_Tipo de Empleo1` FOREIGN KEY (`Tipo de Empleo_idTipo de Empleo`) REFERENCES `tipo de empleo` (`idTipo de Empleo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `experiencia_laboral` (
  `idExperiencia Laboral` int NOT NULL,
  `nombreEmpresa` varchar(45) DEFAULT NULL,
  `esTrabajoActual` tinyint(1) DEFAULT NULL,
  `Fecha de Inicio` date DEFAULT NULL,
  `Fecha de Finalizacion` date DEFAULT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `Persona_idPersona` int NOT NULL,
  `Tipo de Empleo_idTipo de Empleo` int NOT NULL,
  PRIMARY KEY (`idExperiencia Laboral`,`Persona_idPersona`,`Tipo de Empleo_idTipo de Empleo`),
  KEY `fk_Experiencia Laboral_Persona_idx` (`Persona_idPersona`),
  KEY `fk_Experiencia Laboral_Tipo de Empleo1_idx` (`Tipo de Empleo_idTipo de Empleo`),
  CONSTRAINT `experiencia_laboral_ibfk_1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `localidad` (
  `idLocalidad` int NOT NULL,
  `Localidad` varchar(45) DEFAULT NULL,
  `Domicilio_idDomicilio` int NOT NULL,
  `Educacion_idEducacion` int NOT NULL,
  PRIMARY KEY (`idLocalidad`,`Domicilio_idDomicilio`,`Educacion_idEducacion`),
  KEY `fk_Localidad_Domicilio1_idx` (`Domicilio_idDomicilio`),
  CONSTRAINT `fk_Localidad_Domicilio1` FOREIGN KEY (`Domicilio_idDomicilio`) REFERENCES `domicilio` (`idDomicilio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `localidad1` (
  `idLocalidad` int NOT NULL,
  `Localidad` varchar(45) DEFAULT NULL,
  `Domicilio_idDomicilio` int NOT NULL,
  `Domicilio_Persona_idPersona` int NOT NULL,
  `Provincia_idProvincia` int NOT NULL,
  PRIMARY KEY (`idLocalidad`,`Domicilio_idDomicilio`,`Domicilio_Persona_idPersona`,`Provincia_idProvincia`),
  KEY `fk_Localidad_Domicilio1_idx` (`Domicilio_idDomicilio`,`Domicilio_Persona_idPersona`),
  KEY `fk_Localidad_Provincia1_idx` (`Provincia_idProvincia`),
  CONSTRAINT `fk_Localidad_Provincia1` FOREIGN KEY (`Provincia_idProvincia`) REFERENCES `provincia` (`idProvincia`),
  CONSTRAINT `localidad1_ibfk_1` FOREIGN KEY (`Domicilio_idDomicilio`, `Domicilio_Persona_idPersona`) REFERENCES `domicilio` (`idDomicilio`, `Persona_idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `localidad2` (
  `idLocalidad` int NOT NULL,
  `Localidad` varchar(45) DEFAULT NULL,
  `Domicilio_idDomicilio` int NOT NULL,
  `Domicilio_Persona_idPersona` int NOT NULL,
  PRIMARY KEY (`idLocalidad`,`Domicilio_idDomicilio`,`Domicilio_Persona_idPersona`),
  KEY `fk_Localidad2_Domicilio1_idx` (`Domicilio_idDomicilio`,`Domicilio_Persona_idPersona`),
  CONSTRAINT `fk_Localidad2_Domicilio1` FOREIGN KEY (`Domicilio_idDomicilio`, `Domicilio_Persona_idPersona`) REFERENCES `domicilio` (`idDomicilio`, `Persona_idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `logro` (
  `idLogro` int NOT NULL,
  `Logro` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `Persona_idPersona` int NOT NULL,
  PRIMARY KEY (`idLogro`,`Persona_idPersona`),
  KEY `fk_Logro_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_Logro_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `persona` (
  `idPersona` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Domicilio` varchar(45) DEFAULT NULL,
  `Fecha Nacimiento` date DEFAULT NULL,
  `Telefono` varchar(12) DEFAULT NULL,
  `Correo` varchar(45) DEFAULT NULL,
  `Sobre Mi` varchar(200) DEFAULT NULL,
  `Url Foto` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `provincia` (
  `idProvincia` int NOT NULL,
  `Provincia` varchar(45) DEFAULT NULL,
  `Localidad_idLocalidad` int NOT NULL,
  PRIMARY KEY (`idProvincia`,`Localidad_idLocalidad`),
  KEY `fk_Provincia_Localidad1_idx` (`Localidad_idLocalidad`),
  CONSTRAINT `fk_Provincia_Localidad1` FOREIGN KEY (`Localidad_idLocalidad`) REFERENCES `localidad` (`idLocalidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `provincia2` (
  `idProvincia` int NOT NULL,
  `Provincia` varchar(45) DEFAULT NULL,
  `Localidad2_idLocalidad` int NOT NULL,
  PRIMARY KEY (`idProvincia`,`Localidad2_idLocalidad`),
  KEY `fk_Provincia2_Localidad21_idx` (`Localidad2_idLocalidad`),
  CONSTRAINT `fk_Provincia2_Localidad21` FOREIGN KEY (`Localidad2_idLocalidad`) REFERENCES `localidad2` (`idLocalidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `sobre_mi` (
  `idSobre_mi` int NOT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `Persona_idPersona` int NOT NULL,
  PRIMARY KEY (`idSobre_mi`,`Persona_idPersona`),
  KEY `fk_Sobre_mi_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_Sobre_mi_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `tipo de empleo` (
  `idTipo de Empleo` int NOT NULL,
  `nombre_Tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipo de Empleo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `tipo_de_empleo` (
  `idTipo de Empleo` int NOT NULL,
  `nombre_Tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipo de Empleo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `validacion` (
  `idValidacion` int NOT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  `Porcentaje` decimal(2,0) DEFAULT NULL,
  `Persona_idPersona` int NOT NULL,
  PRIMARY KEY (`idValidacion`,`Persona_idPersona`),
  KEY `fk_Validacion_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_Validacion_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
