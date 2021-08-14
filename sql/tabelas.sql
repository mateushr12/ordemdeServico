create table tb_posto_coleta (
    id serial primary key,
    descricao varchar(300) not null,
    endereco varchar(500) not null
);

create table tb_medico (
    id serial primary key,
    nome varchar(200) not null,
    especialidade varchar(100)  not null
);

create table tb_exame (
    id serial primary key,
    descricao varchar(100) not null,
    preco double precision not null
);

create table tb_paciente (
    id serial primary key,
    nome varchar(200) not null,
    data_nascimento date not null,
    sexo varchar(10) not null,
    endereco varchar(500) not null
);

create table tb_ordem (
    id serial primary key,
    data date not null,
    paciente_id integer not null,
    convenio varchar(50) not null,
    postocoleta_id integer not null,
    medico_id integer not null,
    foreign key (paciente_id) references tb_paciente (id),
    foreign key (medico_id) references tb_medico (id),
    foreign key (postocoleta_id) references tb_posto_coleta (id)
);

create table tb_ordem_exame (
    id serial primary key,
    ordem_id integer not null,
    exame_id integer not null,
    preco double precision not null,
    foreign key (ordem_id) references tb_ordem (id),
    foreign key (exame_id) references tb_exame (id)
);

