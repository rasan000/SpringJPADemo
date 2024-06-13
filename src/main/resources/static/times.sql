-- testdb;

create table times (
  id serial primary key,
  departure_date date,
  departure_time varchar(4),
  return_date date,
  return_time varchar(4)
);

insert into times (departure_date, departure_time, return_date, return_time) values ('2020-01-01', '0800', '2020-01-01', '1700');