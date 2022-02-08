INSERT INTO public.pais(
	id_pais, nombre_pais)
	VALUES (57, 'Colombia'),
	(56, 'Panama'), 
	(53, 'Mexico'),
	(55, 'Brasil'),
	(58, 'Costa Rica');

INSERT INTO public.moneda(
	id_moneda, simbolo_moneda, nombre_moneda,  valor_dolar)
	VALUES (1, 'BTC', 'Bitcoin', 40797.61),
	(2,'ETH', 'Ethereum', 36824.36),
	(3,'ADA', 'Cardano', 28803.59),
	(4,'USDT', 'Tether', 582.58),
	(5,'BNB', 'Binance Coin', 32586.41),
	(6,'XRP', 'Ripple', 40180.37),
	(7,'DOGE', 'Dogecoin', 786.80),
	(8,'USDC', 'USDCoin', 1167.44);

INSERT INTO public.usuario(
	id_usuario, nombre_usuario, apellido_usuario, id_pais)
	VALUES (1,'Luis', 'Gomez', 57),
	(2,'Mariana', 'Gonzalez', 56),
	(3,'Alejandro', 'Hernandez', 53),
	(4,'Santiago', 'Sanchez', 55),
	(5,'Samuel', 'Lopez', 58),
	(6,'Sandra Milena', 'Martinez', 57),
	(7,'Antonia', 'Garcia', 56),
	(8,'Camila', 'Rodrguez', 53),
	(9,'Jessica', 'Perez', 55),
	(10,'Juan Carlos', 'Ramirez', 58);

INSERT INTO public.gestor(
	id_gestor, nombre_gestor)
	VALUES (1,'Bancolombia'),
	(2,'Banco Itau'),
	(3,'BBVA'),
	(4,'Scotiabank'),
	(5,'Banco Santander');

INSERT INTO public.moneda_pais(
	id_moneda_pais, id_moneda, id_pais)
	VALUES (1,1, 57),
	(2, 2, 56),
	(3,3, 53),
	(4,4, 55),
	(5,5, 58),
	(6,6, 57),
	(7,7, 56),
	(8,8, 53),
	(9,4, 55),
	(10,3, 58),
	(11,1, 56),
	(12,2, 57);

INSERT INTO public.gestor_pais(
	id_gestor_pais, id_gestor, id_pais)
	VALUES (1,1, 57),
	(2,2, 56),
	(3,3, 53),
	(4,4, 55),
	(5,5, 58),
	(6,1, 57),
	(7,2, 56),
	(8,3, 53),
	(9,4, 55),
	(10,5, 58),
	(11,1, 53),
	(12,2, 55);

INSERT INTO public.usuario_moneda_pais_gestor(
	id_usuario_moneda, id_usuario, id_moneda_pais, cantidad_moneda, id_gestor_pais)
	VALUES (1,1, 1, 100.0, 1),
	(2,1, 12, 20.6, 1),
	(3,2, 2, 20.6, 2),
	(4,2, 6, 20.6, 2),
	(5,3, 3, 5.4, 3),
	(6,3, 8, 15.0, 3),
	(7,4, 4, 35.4, 4),
	(8,4, 9, 44.4, 4),
	(9,5, 5, 784.5, 5),
	(10,5, 10, 8.4, 5),
	(11,6, 6, 45.0, 6),
	(12,6, 12, 75.0, 1),
	(13,7, 7, 4.0, 7),
	(14,7, 11, 7.5, 2),
	(15,8, 8, 45.0, 8),
	(16,8, 3, 75.0, 8),
	(17,9, 9, 8.2, 9),
	(18,9, 4, 254.5, 9),
	(19,10, 10, 26.2, 10),
	(20,10, 5, 18.5, 10),
	(21,5, 5, 55.0, 11),
	(22,9, 4, 5.4, 12);