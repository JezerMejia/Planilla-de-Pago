-- Se crea la base de datos
CREATE DATABASE PlanillaPagos
GO

-- Se usa PlanillaPagos
USE PlanillaPagos
GO

-- Se crean las tablas
CREATE TABLE Empleados
(
    id int NOT NULL primary key,
    nombre nvarchar(60) NOT NULL,
    apellido nvarchar(60) NULL,
    privilegios int NOT NULL,
    cargo nvarchar(30) NULL,
    contraseña nvarchar(60) NULL
)

CREATE TABLE Adelantos
(
    num int IDENTITY(1, 1) NOT NULL primary key,
    aceptado int NOT NULL,
    adelanto float NOT NULL,
    fecha date NOT NULL,
    justificación nvarchar(255) NOT NULL,
    idEmpleado int NOT NULL foreign key references Empleados(id) ON UPDATE CASCADE ON DELETE CASCADE
)

CREATE TABLE Pagos
(
    num int IDENTITY(1, 1) NOT NULL primary key,
    monto float NOT NULL,
    fecha date NOT NULL,
    idEmpleado int NOT NULL foreign key references Empleados(id) ON UPDATE CASCADE ON DELETE CASCADE
)

CREATE TABLE Asistencias
(
    num int IDENTITY(1, 1) NOT NULL primary key,
    asistencia int NOT NULL,
    fecha datetime NOT NULL,
    idEmpleado int NOT NULL foreign key references Empleados(id) ON UPDATE CASCADE ON DELETE CASCADE
)

GO

INSERT INTO Empleados(id, nombre, apellido, privilegios, cargo, contraseña)
VALUES(789, "Luis", "Jiménez", 1, "Gerente", "123")
GO

INSERT INTO Empleados(id, nombre, apellido, privilegios, cargo, contraseña)
VALUES(234, "Jhanna", "Rizo", 1, "Gerente", "123")
GO
