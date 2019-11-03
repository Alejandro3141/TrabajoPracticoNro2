use inmobiliaria;
-- 1) Cantidad de clientes actuales
select count(*) from clientes;

-- 2)Cantidad de propiedades sin clientes
select count(*) from propiedades p left join clientes c 
	on p.codigoPropiedad=c.codigoPropiedad 
    where c.codigoPropiedad is null;
    
-- 3) Propiedad con mayor ingreso
select codigoPropiedad, sum(monto) monto from facturas f join clientes c
	on f.codigoCliente=c.codigoCliente
	group by codigoPropiedad
    having sum(monto)=(select sum(monto) 
    from facturas f join clientes c
	on f.codigoCliente=c.codigoCliente
    group by codigoPropiedad
    order by sum(monto) desc limit 1);
    
-- 4) Propiedad con menor ingreso
select codigoPropiedad, sum(monto) monto from facturas f join clientes c
	on f.codigoCliente=c.codigoCliente
	group by codigoPropiedad
    having sum(monto)=(select sum(monto) 
    from facturas f join clientes c
	on f.codigoCliente=c.codigoCliente
    group by codigoPropiedad
    order by sum(monto) asc limit 1);

-- 5) Ingreso total de las propiedades
select sum(monto) montoTotal from facturas;

-- 6) Ingresos por mes
select monthname(fecha), sum(monto) monto from facturas group by month(fecha);

-- 7) Vencimiento del contrato de un cliente
select codigoPropiedad, nombre, apellido, fechaFinal
	from contratos c join clientes cl
	on c.codigoCliente=cl.codigoCliente
    where nombre like '%raul%' and apellido like'%lopez ibarra%';

-- 8) Clientes en mora
select distinct codigoPropiedad, nombre, apellido 
	from clientes c join facturas f
	on c.codigoCliente=f.codigoCliente where mora is not null;

-- 9) Buscar un cliente
select * from clientes 
	where nombre like '%alexandra%' and apellido like '%sanchez%';

-- 10) cantidad de Clientes egresados
select count(*) cantidad
	from clientes c join historiainmobiliaria h
	on c.codigoCliente= h.codigoCliente
    where fechaEgreso is not null;