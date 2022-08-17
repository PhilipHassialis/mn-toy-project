create table projects
(
  id serial primary key,
  projectname varchar(255) not null,
  projectdescription varchar(255) not null,
  projectstatus varchar(255),
  projectstartdate date,
  projectenddate date,
  constraint projectname_unique unique (projectname)
);