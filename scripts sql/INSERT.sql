INSERT INTO public.pais(
	id_pais, nombre_pais)
	VALUES (57, 'Colombia'),
	(56, 'Panama'), 
	(53, 'Mexico');

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
	id_usuario, nombre_usuario, id_pais)
	VALUES (1,'Luis Gomez', 57),
	(2,'Mariana Gonzalez', 56),
	(3,'Alejandro Hernandez', 53),
	(4,'Santiago Sanchez', 57),
	(5,'Samuel Lopez', 56),
	(6,'Sandra Milena Martinez', 53),
	(7,'Antonia Garcia', 57),
	(8,'Camila Rodrguez', 56),
	(9,'Jessica Perez', 53),
	(10,'Juan Carlos Ramirez', 57);

INSERT INTO public.gestor(
	id_gestor, nombre_gestor, id_pais)
	VALUES (1,'Bancolombia', 57),
	(2,'Banco Itau', 56),
	(3,'BBVA', 53),
	(4,'Scotiabank', 57),
	(5,'Banco Santander', 56);

INSERT INTO public.moneda_pais(
	id_moneda_pais, id_moneda, id_pais)
	VALUES (1,1, 57),
	(2, 2, 57),
	(3,3, 56),
	(4,4, 56),
	(5,5, 53),
	(6,6, 53),
	(7,7, 57),
	(8,8, 56);

INSERT INTO public.gestor_moneda(
	id_gestor_moneda, id_gestor, id_moneda_pais)
	VALUES (1,1, 1),
	(2,1, 2),
	(3,1, 7),
	(4,4, 2),
	(5,4, 7),
	(6,2, 3),
	(7,2, 4),
	(8,6, 8),
	(9,3, 5),
	(10,3, 6);

INSERT INTO public.usuario_moneda(
	id_usuario_moneda, id_usuario, id_moneda_pais)
	VALUES (1,1, 1),
	(2,1, 2),
	(3,2, 3),
	(4,2, 4),
	(5,3, 5),
	(8,4, 1),
	(9,5, 4);