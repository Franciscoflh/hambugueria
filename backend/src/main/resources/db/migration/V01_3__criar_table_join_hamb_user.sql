CREATE TABLE hambuguer_usuarios
(
    hambuguer_codigo_burguer INT NOT NULL,
    usuarios_codigo_usuario  INT NOT NULL
);

ALTER TABLE hambuguer_usuarios
    ADD CONSTRAINT fk_hamusu_on_hambuguer FOREIGN KEY (hambuguer_codigo_burguer) REFERENCES hambuguer (codigo_burguer);

ALTER TABLE hambuguer_usuarios
    ADD CONSTRAINT fk_hamusu_on_usuario FOREIGN KEY (usuarios_codigo_usuario) REFERENCES usuario (codigo_usuario);