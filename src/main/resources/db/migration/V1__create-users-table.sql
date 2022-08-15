create table userroles
(
  userrole varchar(255) primary key,
  roledescription varchar(255)
);

create table users
(
  id serial primary key,
  username varchar(255) not null,
  password varchar(255) not null,
  userrole varchar(255) not null,
  constraint role_fk foreign key (userrole) references userroles(userrole)
);