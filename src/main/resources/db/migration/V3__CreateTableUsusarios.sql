create table usuarios(
    id bigint not null auto_increment,
    username varchar(50) not null,
    password varchar(300) not null,

    primary key(id)
);