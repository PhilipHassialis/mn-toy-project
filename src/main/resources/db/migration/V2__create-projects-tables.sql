create table projectstatus
(
  projectstatus varchar(255) primary key,
  statusdescription varchar(255)
);

insert into projectstatus
  (projectstatus, statusdescription)
values
  ('ACTIVE', 'Active'),
  ('COMPLETED', 'Completed'),
  ('CANCELLED', 'Cancelled');

create table projects
(
  id serial primary key,
  projectname varchar(255) not null,
  projectdescription varchar(255) not null,
  projectstatus varchar(255),
  projectstartdate date,
  projectenddate date,
  constraint projectname_unique unique (projectname),
  constraint projectstatus_fk foreign key (projectstatus) references projectstatus(projectstatus)
);