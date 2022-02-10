create table TB_TIPO_TELE (
       CG_TIPO_TELE bigint not null,
       DC_TIPO_TELE varchar(255),
       primary key (CG_TIPO_TELE)
)
;
create sequence SEQ_TIPO_TELE start with 1 increment by 1
;