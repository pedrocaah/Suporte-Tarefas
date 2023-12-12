create table tb_cliente (
	id bigint,
	nome varchar(50) not null,
	codigo varchar(50) not null,
	constraint pk_id_cliente_2 primary key(id)
);

select * from tb_cliente;
delete from tb_cliente;

create sequence sq_cliente
start 1
increment 1
owned by tb_cliente.id;

