CREATE TABLE usuario
(
    codigo_usuario INT AUTO_INCREMENT NOT NULL,
    nome           VARCHAR(100)       NULL,
    email          VARCHAR(45)        NULL,
    senha          VARCHAR(16)        NULL,
    telefone       VARCHAR(30)        NULL,
    endereco       VARCHAR(30)        NULL,
    CONSTRAINT pk_usuario PRIMARY KEY (codigo_usuario)
);