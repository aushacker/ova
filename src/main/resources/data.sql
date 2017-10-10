--
-- Load initial data into tables.
--
insert into person(id, name, email, phone) values (1, 'Betty Rubble', 'betty@bedrox.com', '555-9876');
insert into person(id, name, email, phone) values (2, 'Fred Flintstone', 'fred@slatesng.com', '555-1234');
insert into person(id, name, email, phone) values (3, 'Wilma Flintstone', 'wilma@homesupplies.com', '555-1234');
insert into person(id, name, email, phone) values (4, 'Pebbles Flintstone', 'pebbles@bedrox.com', '555-1234');
insert into person(id, name, email, phone) values (5, 'Barney Rubble', 'barney@bedrox.com', '555-9876');
insert into person(id, name, email, phone) values (6, 'Bam Bam Rubble', 'bb@bedrockyouth.org', '555-9876');

insert into claim(id, person_id, description, amount) values (1, 1, 'Compo type #1', 1000.00);
insert into claim(id, person_id, description, amount) values (2, 1, 'Compo type #2', 1500.00);
insert into claim(id, person_id, description, amount) values (3, 2, 'Compo type #1', 2000.42);
insert into claim(id, person_id, description, amount) values (4, 5, 'Compo type #1', 2000.00);
insert into claim(id, person_id, description, amount) values (5, 5, 'Workcover #2', 3000.00);
insert into claim(id, person_id, description, amount) values (6, 5, 'Disability', 8000.00);
