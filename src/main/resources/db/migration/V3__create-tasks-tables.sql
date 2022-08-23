create table taskstatus
(
  taskstatus varchar(255) primary key,
  statusdescription varchar(255)
);

insert into taskstatus
  (taskstatus, statusdescription)
values
  ('OPEN', 'Open'),
  ('INPROGRESS', 'In Progress'),
  ('COMPLETED', 'Completed'),
  ('CANCELLED', 'Cancelled');

create table tasks
(
  id serial primary key,
  taskname varchar(255) not null,
  taskdescription varchar(255) not null,
  taskstatus varchar(255),
  taskstartdate date,
  taskenddate date,
  projectid int,
  constraint taskstatus_fk foreign key (taskstatus) references taskstatus(taskstatus),
  constraint projectid_fk foreign key (projectid) references projects(id)
);