create table if not exists tbl_user
(
    id         integer unsigned auto_increment primary key not null,
    account_id varchar(20)                                 not null,
    name       varchar(8)                                  not null,
    age        integer unsigned                            not null
)