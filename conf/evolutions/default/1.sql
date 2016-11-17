# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table administrador (
  id                        bigint auto_increment not null,
  dt_visita                 date,
  local_visita              varchar(255),
  usuario_id                bigint,
  cliente_id                bigint,
  constraint pk_administrador primary key (id))
;

create table cliente (
  id                        bigint auto_increment not null,
  nome_noiva                varchar(255),
  nome_noivo                varchar(255),
  data_casamento            date,
  usuario_id                bigint,
  preferencia_id            bigint,
  constraint pk_cliente primary key (id))
;

create table fornecedor (
  id                        bigint auto_increment not null,
  nome                      varchar(255),
  descricao                 varchar(255),
  site                      varchar(255),
  min_convidados            integer,
  max_convidados            integer,
  valor                     float,
  usuario_id                bigint,
  servico_id                bigint,
  constraint pk_fornecedor primary key (id))
;

create table pacote (
  id                        bigint auto_increment not null,
  nome                      varchar(255),
  valor_total               float,
  descricao                 varchar(255),
  qtd_convidados            integer,
  fornecedor_id             bigint,
  cliente_id                bigint,
  constraint pk_pacote primary key (id))
;

create table preferencias (
  id                        bigint auto_increment not null,
  qtd_convidados            integer,
  qtd_investimento          float,
  horario                   varchar(255),
  localidade                varchar(255),
  detalhes                  varchar(255),
  constraint pk_preferencias primary key (id))
;

create table servico (
  id                        bigint auto_increment not null,
  tipo                      varchar(255),
  valor_servico             float,
  descricao                 varchar(255),
  constraint pk_servico primary key (id))
;

create table usuario (
  id                        bigint auto_increment not null,
  login                     varchar(255),
  senha                     varchar(255),
  perfil                    integer,
  nome                      varchar(255),
  sobrenome                 varchar(255),
  email                     varchar(255),
  telefone                  varchar(255),
  constraint pk_usuario primary key (id))
;


create table pacote_fornecedor (
  pacote_id                      bigint not null,
  fornecedor_id                  bigint not null,
  constraint pk_pacote_fornecedor primary key (pacote_id, fornecedor_id))
;
alter table administrador add constraint fk_administrador_usuario_1 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_administrador_usuario_1 on administrador (usuario_id);
alter table administrador add constraint fk_administrador_cliente_2 foreign key (cliente_id) references cliente (id) on delete restrict on update restrict;
create index ix_administrador_cliente_2 on administrador (cliente_id);
alter table cliente add constraint fk_cliente_usuario_3 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_cliente_usuario_3 on cliente (usuario_id);
alter table cliente add constraint fk_cliente_preferencia_4 foreign key (preferencia_id) references preferencias (id) on delete restrict on update restrict;
create index ix_cliente_preferencia_4 on cliente (preferencia_id);
alter table fornecedor add constraint fk_fornecedor_usuario_5 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_fornecedor_usuario_5 on fornecedor (usuario_id);
alter table fornecedor add constraint fk_fornecedor_servico_6 foreign key (servico_id) references servico (id) on delete restrict on update restrict;
create index ix_fornecedor_servico_6 on fornecedor (servico_id);
alter table pacote add constraint fk_pacote_fornecedor_7 foreign key (fornecedor_id) references fornecedor (id) on delete restrict on update restrict;
create index ix_pacote_fornecedor_7 on pacote (fornecedor_id);
alter table pacote add constraint fk_pacote_cliente_8 foreign key (cliente_id) references cliente (id) on delete restrict on update restrict;
create index ix_pacote_cliente_8 on pacote (cliente_id);



alter table pacote_fornecedor add constraint fk_pacote_fornecedor_pacote_01 foreign key (pacote_id) references pacote (id) on delete restrict on update restrict;

alter table pacote_fornecedor add constraint fk_pacote_fornecedor_fornecedor_02 foreign key (fornecedor_id) references fornecedor (id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table administrador;

drop table cliente;

drop table fornecedor;

drop table pacote_fornecedor;

drop table pacote;

drop table preferencias;

drop table servico;

drop table usuario;

SET FOREIGN_KEY_CHECKS=1;

