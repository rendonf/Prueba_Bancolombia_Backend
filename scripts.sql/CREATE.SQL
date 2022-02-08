CREATE DATABASE "criptomoneda"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

COMMENT ON DATABASE "criptomoneda"
    IS 'Prueba Bancolombia';

CREATE TABLE IF NOT EXISTS public.pais
(
    id_pais bigint NOT NULL,
    nombre_pais character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT pais_pkey PRIMARY KEY (id_pais)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.pais
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.moneda
(
    id_moneda bigint NOT NULL,
    nombre_moneda character varying(255) COLLATE pg_catalog."default",
    simbolo_moneda character varying(255) COLLATE pg_catalog."default",
    valor_dolar real NOT NULL,
    CONSTRAINT moneda_pkey PRIMARY KEY (id_moneda)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.moneda
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.usuario
(
    id_usuario bigint NOT NULL,
    apellido_usuario character varying(255) COLLATE pg_catalog."default",
    nombre_usuario character varying(255) COLLATE pg_catalog."default",
    id_pais bigint,
    CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario),
    CONSTRAINT fksc507r4jpstq91ou0jv9derm5 FOREIGN KEY (id_pais)
        REFERENCES public.pais (id_pais) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.usuario
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.gestor
(
    id_gestor bigint NOT NULL,
    nombre_gestor character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT gestor_pkey PRIMARY KEY (id_gestor)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.gestor
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.moneda_pais
(
    id_moneda_pais bigint NOT NULL,
    id_moneda bigint,
    id_pais bigint,
    CONSTRAINT moneda_pais_pkey PRIMARY KEY (id_moneda_pais),
    CONSTRAINT fkb13j49f0fa0lfcu5buahimxh7 FOREIGN KEY (id_moneda)
        REFERENCES public.moneda (id_moneda) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkpx9fgp2s2va3tfeny7o453t3m FOREIGN KEY (id_pais)
        REFERENCES public.pais (id_pais) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.moneda_pais
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.gestor_pais
(
    id_gestor_pais bigint NOT NULL,
    id_gestor bigint,
    id_pais bigint,
    CONSTRAINT gestor_pais_pkey PRIMARY KEY (id_gestor_pais),
    CONSTRAINT fkb8vrmhmq178dasiuxk3quvl83 FOREIGN KEY (id_pais)
        REFERENCES public.pais (id_pais) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkp7tr3vg8qk1k54g1b5norytmm FOREIGN KEY (id_gestor)
        REFERENCES public.gestor (id_gestor) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.gestor_pais
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.usuario_moneda_pais_gestor
(
    id_usuario_moneda bigint NOT NULL,
    cantidad_moneda real NOT NULL,
    id_gestor_pais bigint,
    id_moneda_pais bigint,
    id_usuario bigint,
    CONSTRAINT usuario_moneda_pais_gestor_pkey PRIMARY KEY (id_usuario_moneda),
    CONSTRAINT fk8mg3jnp3j4mwsv8k4mi0t8bem FOREIGN KEY (id_usuario)
        REFERENCES public.usuario (id_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fki1bgeorkei354jx1qnk22w9xu FOREIGN KEY (id_gestor_pais)
        REFERENCES public.gestor_pais (id_gestor_pais) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkt5x2r8to2g3sbn83sjyj7ob0q FOREIGN KEY (id_moneda_pais)
        REFERENCES public.moneda_pais (id_moneda_pais) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.usuario_moneda_pais_gestor
    OWNER to postgres;