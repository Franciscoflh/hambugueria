CREATE TABLE pedido
(
    codigo_pedido  INT AUTO_INCREMENT NOT NULL,
    num_pedido     INT                NULL,
    codigo_usuario INT                NULL,
    CONSTRAINT pk_pedido PRIMARY KEY (codigo_pedido)
);

CREATE TABLE pedido_hambuguers
(
    pedido_codigo_pedido      INT NOT NULL,
    hambuguers_codigo_burguer INT NOT NULL
);

ALTER TABLE pedido
    ADD CONSTRAINT FK_PEDIDO_ON_CODIGO_PEDIDO FOREIGN KEY (codigo_pedido) REFERENCES usuario (codigo_usuario);

ALTER TABLE pedido
    ADD CONSTRAINT FK_PEDIDO_ON_CODIGO_USUARIO FOREIGN KEY (codigo_usuario) REFERENCES usuario (codigo_usuario);

ALTER TABLE pedido_hambuguers
    ADD CONSTRAINT fk_pedham_on_hambuguer FOREIGN KEY (hambuguers_codigo_burguer) REFERENCES hambuguer (codigo_burguer);

ALTER TABLE pedido_hambuguers
    ADD CONSTRAINT fk_pedham_on_pedido FOREIGN KEY (pedido_codigo_pedido) REFERENCES pedido (codigo_pedido);