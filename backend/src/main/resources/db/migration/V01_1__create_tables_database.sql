CREATE TABLE burguer_pedido
(
    codigo_burguer INT NOT NULL,
    codigo_pedido  INT NOT NULL,
    CONSTRAINT pk_burguer_pedido PRIMARY KEY (codigo_burguer, codigo_pedido)
);

CREATE TABLE hambuguer
(
    codigo_burguer INT AUTO_INCREMENT NOT NULL,
    nome           VARCHAR(100) NULL,
    `descrição`    VARCHAR(255) NULL,
    preco          INT NULL,
    ingredientes   VARCHAR(255) NULL,
    CONSTRAINT pk_hambuguer PRIMARY KEY (codigo_burguer)
);

CREATE TABLE pedido
(
    codigo_pedido  INT AUTO_INCREMENT NOT NULL,
    num_pedido     INT NULL,
    codigo_usuario INT NULL,
    CONSTRAINT pk_pedido PRIMARY KEY (codigo_pedido)
);

CREATE TABLE usuario
(
    codigo_usuario INT AUTO_INCREMENT NOT NULL,
    nome           VARCHAR(100) NULL,
    email          VARCHAR(45) NULL,
    senha          VARCHAR(16) NULL,
    telefone       VARCHAR(30) NULL,
    endereco       VARCHAR(100) NULL,
    CONSTRAINT pk_usuario PRIMARY KEY (codigo_usuario)
);