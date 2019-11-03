drop database if exists inmobiliaria;
create database inmobiliaria;
use inmobiliaria;

-- Tabla Propiedades
create table if not exists propiedades (
    codigoPropiedad char(8) not null,
    ubicacion enum ('Santa Clara','Los Angeles','San Martí­n'),
    tipoInmueble enum ('Habitación', 'Casa','Local Comercial', 'Departamento'),
    precioAlquiler double not null,
    descripcion varchar(150),
    primary key (codigoPropiedad)
);

-- Tabla Clientes
create table if not exists clientes (
    codigoCliente int auto_increment not null,
    codigoPropiedad char (8) not null unique key,
    nombre varchar(20) not null,
    apellido varchar (20) not null,
    tipoDocumento enum ('dni', 'pasaporte'),
    numeroDocumento char(12),
    cuit char(13),
    telefono char(10),
    email varchar(40),
    garantia double,
    observacion varchar(150),
    primary key (codigoCliente),
    constraint FK_clientes_propiedades 
    foreign key (codigoPropiedad) references propiedades(codigoPropiedad)
);

-- Tabla Facturas
create table if not exists facturas (
    codigoFactura int auto_increment not null,
    codigoCliente int not null,
    fecha date,
    cuota int,
    mora double,
    monto double,
    primary key (codigoFactura),
    constraint FK_facturas_clientes
    foreign key (codigoCliente) references clientes(codigoCliente)
);

-- Tabla Contratos
create table if not exists contratos (
	codigoContrato int auto_increment not null,
    codigoCliente int not null,
    fechaInicio date not null,
    fechaFinal date not null,
    tiempoCuotas enum ('Quincenal','Mensual','Bimestral','Trimestral','Semestral','Anual'),
    numeroCuotas int,
    primary key (codigoContrato),
    constraint FK_contratos_clientes
    foreign key (codigoCliente) references clientes(codigoCliente) 
    on delete cascade
    on update cascade
);

-- Tabla historiaInmobiliaria
create table if not exists historiaInmobiliaria (
    codigoPropiedad char(8) not null,
    codigoCliente int,
    fechaRenovacion date,
    fechaEgreso date,
    primary key(codigoPropiedad, codigoCliente),
    constraint FK_historiaInmobiliaria_propiedades
    foreign key (codigoPropiedad) references propiedades(codigoPropiedad),
    constraint FK_historiaInmobiliaria_clientes
    foreign key (codigoCliente) references clientes(codigoCliente)
);