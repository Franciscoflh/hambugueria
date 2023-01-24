CREATE TABLE hambuguer
(
    codigo_burguer INT AUTO_INCREMENT NOT NULL,
    nome           VARCHAR(100)       NULL,
    `descrição`    VARCHAR(255)       NULL,
    preco          INT                NULL,
    ingredientes   VARCHAR(255)       NULL,
    CONSTRAINT pk_hambuguer PRIMARY KEY (codigo_burguer)
);