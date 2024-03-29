use inmobiliaria;
-- Ingreso de Registros

-- PROPIEDADES

-- Habitaciones
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Hab-01', 'Los_Angeles', 'Habitacion', 4200, '4x4 m2 con baño y balcón' 
);
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Hab-02', 'Los_Angeles', 'Habitacion', 3750, '4x4 m2 con baño y balcón' 
);
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Hab-03', 'Santa_Clara', 'Habitacion', 3000, '3x3 m2 con baño y living' 
);
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Hab-04', 'Santa_Clara', 'Habitacion', 3000, '3x3 m2 con baño y living' 
);
-- Casas
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Ca-01', 'Santa_Clara', 'Casa', 15000, '120 m2 piso cerámico, 2 baños, cocina, comedor, living, lavandería y 2 dormitorios' 
);
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Ca-02', 'San_Martin', 'Casa', 15000, '120 m2 piso cerámico, 2 baños, cocina, comedor, living, lavandería y 2 dormitorios' 
);
-- Departamentos
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Dep-01', 'Santa_Clara', 'Departamento', 9750, '65 m2 piso cerámico con baño, 2 dormitorios, cocina comedor, living y lavandería'
);
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Dep-02', 'Santa_Clara', 'Departamento', 9750, '65 m2 piso cerámico con baño, 2 dormitorios, cocina comedor, living y lavandería'
);
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Dep-03', 'Santa_Clara', 'Departamento', 9750, '65 m2 piso cerámico con baño, 2 dormitorios, cocina comedor, living y lavandería'

);
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Dep-04', 'San_Martin', 'Departamento', 9000, '120 m2 piso cerámico, 2 baños, cocina, comedor, living, lavandería y 2 dormitorios'
);
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Dep-05', 'San_Martin', 'Departamento', 9000, '120 m2 piso cerámico, 2 baños, cocina, comedor, living, lavandería y 2 dormitorios'
);
-- Locales Comerciales
insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (
	'Loc-01', 'Los_Angeles', 'Local_Comercial', 5250, '3x3 m2'
);


-- CLIENTES
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Loc-01', 'Raquel', 'Espinoza Ortega','DNI', '20571400', '03-20571400-2', '45041325','raquel.ortega@gmail.com', null, null
);
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Ca-01', 'Jesús', 'Gonzales Rojas','DNI','23595854', '54-23595854-1','41230394','jesus1231@gmail.com', 6000, null
);
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Ca-02', 'Guillermo', 'López Huertas','DNI', '20571400', '87-20571400-7', '1569085561','guille.lopez@gmail.com', 5000, null
);
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Dep-01', 'Mayra', 'Laureano Carhuaz', 'DNI', '30529694', '65-60529694-9','1503439954','laureano14Carhuaz@gmail.com', 2000, null
);
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Dep-02', 'Alexandra', 'Sanchez Ireana', 'Pasaporte','10311679', null, '1537387781','aleIre99@gmail.com', null, null
);
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Dep-03', 'Eddar', 'Lara Arteaga', 'Pasaporte', '135916030',null, '1507861093',null, null, null
);
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Hab-01', 'Indira', 'Moreno Luque','Pasaporte','135916038', null, '1520204933','indira.luque5654@gmail.com', null, null
);
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Hab-04', 'Raúl', 'Lopez Ibarra','Pasaporte', '205714005', null, '1578239102', null, null, null
);
insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit_cuil, telefono, email, garantia, observacion) values (
    'Dep-04', 'Ronal', 'Briceño','DNI', '33574860', '01-33574860-3', '1527840932','ronal.bri@hotmail.com', 5000, null
);
-- No permitir duplicados
-- insert into clientes (codigoPropiedad, nombre, apellido, tipoDocumento, numeroDocumento, cuit, telefono, email, garantia, observacion) values (
--    'Ca-01', 'David', 'AcuÃ±a Gomez','dni', '47649010', '73-47649010-8','1189239932', null, null, null
-- );


-- CONTRATOS 
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	1,'2019-10-01','2020-02-02','Mensual', 4
);
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	2,'2019-07-10','2020-07-10','Bimestral', 6
);
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	3,'2019-10-01','2020-10-02','Trimestral', 4 
);
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	4,'2019-09-01','2020-04-02','Mensual', 8
);
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	5,'2019-05-01','2020-04-02','Mensual', 12
);
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	6,'2019-05-30','2020-05-30','Bimestral', 6
);
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	7,'2019-10-01','2019-11-01','Quincenal', 2
);
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	8,'2019-10-02','2019-11-02','Quincenal', 2
);
insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (
	9,'2019-07-05','2020-07-06','Trimestral', 4
);


-- FACTURAS
insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (
	2, '2019-09-10', 1,  null , 5250
);
insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (
	4, '2019-10-01', 1, null, 9750
);
insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (
	5, '2019-06-01', 1, null , 5250
);
insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (
	5, '2019-07-01', 2,  null , 5250
);
insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (
	5, '2019-08-01', 3, null , 5250
);
insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (
	5, '2019-10-01', 4, 0.15, 5250 * (1 + mora)
);
insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (
	5, '2019-10-01', 5, 0.15, 5250 * (1 + mora)
);
insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (
	6, '2019-07-30', 1, null, 19500
);


-- HISTORIA INMOBILIARIA
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
    'Hab-01', 7, null, null
);
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
    'Hab-04',8, null, null
);
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
    'Ca-01', 2, null, null
);
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
    'Ca-02', 3, null, null
);
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
	'Dep-01', 4, null, null
);
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
	'Dep-02', 5, null, null
);
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
	'Dep-03', 6, null, null
);
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
	'Dep-04', 9, null, null
);
insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (
	'Loc-01', 1, null, null
);