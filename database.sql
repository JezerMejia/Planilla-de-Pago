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
    contraseña nvarchar(60) NULL,
)

CREATE TABLE Adelantos
(
    num int IDENTITY(1, 1) NOT NULL primary key,
    aceptado int NOT NULL,
    adelanto float NOT NULL,
    fecha date NOT NULL,
    justificación nvarchar(255) NOT NULL,
    idEmpleado int NOT NULL foreign key references Empleados(id),
)

CREATE TABLE Pagos
(
    num int IDENTITY(1, 1) NOT NULL primary key,
    monto float NOT NULL,
    fecha date NOT NULL,
    idEmpleado int NOT NULL foreign key references Empleados(id),
)

CREATE TABLE Asistencias
(
    num int IDENTITY(1, 1) NOT NULL primary key,
    asistencia int NOT NULL,
    fecha datetime NOT NULL,
    idEmpleado int NOT NULL foreign key references Empleados(id)
)

GO
