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

insert into userroles
  (userrole, roledescription)
values
  ('ADMIN', 'Administrator');
insert into userroles
  (userrole, roledescription)
values
  ('MANAGER', 'Project Manager');
insert into userroles
  (userrole, roledescription)
values
  ('TESTER', 'Test User');
insert into userroles
  (userrole, roledescription)
values
  ('DEV', 'Developer');

insert into users
  (username, password, userrole)
values
  ('Admin', 'secret', 'ADMIN');
