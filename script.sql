create table phone (id binary not null,citycode integer,contrycode integer,number integer,user_id binary,primary key (id))

create table user (id binary not null,created_at timestamp not null,email varchar(255),isactive bit default 0,name varchar(255),password varchar(255),token varchar(255),updated_at timestamp,primary key (id))

alter table phone add constraint FKb0niws2cd0doybhib6srpb5hh foreign key (user_id) references user
