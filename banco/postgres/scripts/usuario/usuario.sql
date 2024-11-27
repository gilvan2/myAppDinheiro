CREATE TABLE IF NOT EXISTS usuario (
    id SERIAL PRIMARY KEY,
    cpf VARCHAR(11) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    usuario VARCHAR(20) NOT NULL,
    email VARCHAR(60) NOT NULL,
    senha VARCHAR(250) NOT NULL --Isso aqui vai precisar ser criptografado
);

INSERT INTO usuario (cpf, nome, usuario, email, senha)
VALUES ('12345678901', 'João da Silva', 'joaosilva', 'joao.silva@email.com', 'senha123');

select * from usuario