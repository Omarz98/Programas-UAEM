CREATE DATABASE MANTENIMIENTO;

USE MANTENIMIENTO;

CREATE TABLE COMPUTADORA(
	Num_Inventario VARCHAR(8),
	Num_Serie VARCHAR(5),
	Marca VARCHAR (8),
	Modelo VARCHAR(10),
	Tipo VARCHAR(10),
	Procesaor VARCHAR (7),
	Ram INT,
	Primary key (Num_Inventario));

CREATE TABLE ServidorPublico(
	Num_ServidorP VARCHAR(12),
	Nombre VARCHAR(30),
	Ap_Paterno VARCHAR(40),
	Ap_Materno VARCHAR(40),
	Cargo VARCHAR(20),
	email VARCHAR(50),
	Primary key (Num_ServidorP));

CREATE TABLE Tecnico(
	Num_Empleado VARCHAR(8),
	Nombre VARCHAR(30),
	Ap_Paterno VARCHAR(40),
	Ap_Materno VARCHAR(40),
	email VARCHAR(50),
	Primary key (Num_Empleado));

CREATE TABLE SoprteTecnico(
	Folio INT AUTO_INCREMENT,
	Num_equipo_invent VARCHAR(8),
	Num_Servidor_Public VARCHAR(12),
	Num_Tecnico VARCHAR(8),
	Fecha Date,
	Hora Time,
	Nota_Dignostico VARCHAR (100),
	Problema VARCHAR(30),
	Primary key(Folio),
	FOREIGN KEY (Num_equipo_invent) REFERENCES COMPUTADORA(Num_Inventario),
	FOREIGN key (Num_Servidor_Public) REFERENCES ServidorPublico (Num_ServidorP),
	FOREIGN key (Num_Tecnico) REFERENCES Tecnico (Num_Empleado));
