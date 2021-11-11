

/*create table restaurants
(
   idRestaurant integer not null,
   name varchar(255) not null,
   primary key(idRestaurant)
);

INSERT INTO restaurants (idRestaurant, name) 
VALUES(1,  'Maa Annapurna');
INSERT INTO restaurants (idRestaurant, name) 
VALUES(2,  'American');

create table menus
(
   idMenu integer not null,
   name varchar(255) not null,
   idRestaurant integer not null,
   primary key(idMenu),
   foreign key (idRestaurant) references restaurants(idRestaurant)
);

INSERT INTO menus (idMenu, name,idRestaurant) 
VALUES(1,  'Maharaja Thali',1);

INSERT INTO menus (idMenu, name,idRestaurant) 
VALUES(2,  'Veg Thali',1);

INSERT INTO menus (idMenu, name,idRestaurant) 
VALUES(3,  'Pizza',2);

INSERT INTO menus (idMenu, name,idRestaurant) 
VALUES(4,  'Burger',2);

create table item
(
   idItem integer not null,
   name varchar(255) not null,
   idMenu integer not null,
   primary key(idItem),
   foreign key (idMenu) references menus(idMenu)
);

INSERT INTO item (idItem, name,idMenu) 
VALUES(1,  'Pulao',1);
INSERT INTO item (idItem, name,idMenu) 
VALUES(2,  'Kheer',1);
INSERT INTO item (idItem, name,idMenu) 
VALUES(3,  'Dosa',2);
INSERT INTO item (idItem, name,idMenu) 
VALUES(4,  'Paneer Pizza',3);
INSERT INTO item (idItem, name,idMenu) 
VALUES(5,  'Veg Burger',4); */



















