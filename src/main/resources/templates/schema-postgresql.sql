CREATE TABLE IF NOT EXISTS tb_funcionarios (
    id BIGINT PRIMARY KEY,
    nome  varchar(50),
    doc   varchar(20),
    idade int,
    setor varchar(20),
    cargo varchar(20)
    );