/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  João
 * Created: 09/12/2017
 */

CREATE TABLE bairro
(
  id_bairro serial NOT NULL,
  nome_bairro character varying(50),
  id_cidade integer,
  CONSTRAINT pk_bairro PRIMARY KEY (id_bairro),
  CONSTRAINT fk_cidade FOREIGN KEY (id_cidade)
      REFERENCES cidade (id_cidade) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE bairro
  OWNER TO postgres;

CREATE TABLE cidade
(
  id_cidade serial NOT NULL,
  nome_cidades character varying(50),
  id_estado integer,
  CONSTRAINT pk_cidade PRIMARY KEY (id_cidade),
  CONSTRAINT fk_estado FOREIGN KEY (id_estado)
      REFERENCES estados (id_estado) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE cidade
  OWNER TO postgres;

CREATE TABLE clientes
(
  id_cliente serial NOT NULL,
  nome_cliente character varying(50),
  endereco_cliente character varying(50),
  rg_cliente character varying(12),
  cpf_cliente character varying(12),
  id_bairro integer,
  id_cidade integer,
  CONSTRAINT pk_cliente PRIMARY KEY (id_cliente),
  CONSTRAINT pk_bairro FOREIGN KEY (id_bairro)
      REFERENCES bairro (id_bairro) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT pk_cidade FOREIGN KEY (id_cidade)
      REFERENCES cidade (id_cidade) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE clientes
  OWNER TO postgres;


CREATE TABLE estados
(
  id_estado serial NOT NULL,
  nome_estado character varying(50),
  sigla_estado character varying(2),
  CONSTRAINT pk_estado PRIMARY KEY (id_estado)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE estados
  OWNER TO postgres;


CREATE TABLE itens_cli_tel
(
  id_cliente integer NOT NULL,
  id_tel integer NOT NULL,
  CONSTRAINT pk_tel_cli PRIMARY KEY (id_cliente, id_tel),
  CONSTRAINT fk_cli FOREIGN KEY (id_cliente)
      REFERENCES clientes (id_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_tel FOREIGN KEY (id_tel)
      REFERENCES telefone (id_telefone) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE itens_cli_tel
  OWNER TO postgres;


CREATE TABLE itens_venda_produto
(
  id_venda integer NOT NULL,
  id_produto integer NOT NULL,
  quantidade_produto integer,
  CONSTRAINT pk_produto_venda PRIMARY KEY (id_venda, id_produto),
  CONSTRAINT fk_prod FOREIGN KEY (id_produto)
      REFERENCES produto (id_produto) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_venda FOREIGN KEY (id_venda)
      REFERENCES venda (id_venda) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE itens_venda_produto
  OWNER TO postgres;

CREATE TABLE produto
(
  id_produto serial NOT NULL,
  nome_produto character varying(50),
  preco_venda numeric,
  quantidade integer,
  CONSTRAINT pk_produto PRIMARY KEY (id_produto)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE produto
  OWNER TO postgres;

CREATE TABLE telefone
(
  id_telefone serial NOT NULL,
  numero_tel character varying(15),
  CONSTRAINT pk_tel PRIMARY KEY (id_telefone)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE telefone
  OWNER TO postgres;


CREATE TABLE venda
(
  id_venda serial NOT NULL,
  data_venda character varying(10),
  valor_venda numeric,
  id_cliente integer,
  CONSTRAINT pk_venda PRIMARY KEY (id_venda),
  CONSTRAINT fk_cliente FOREIGN KEY (id_cliente)
      REFERENCES clientes (id_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE venda
  OWNER TO postgres;
