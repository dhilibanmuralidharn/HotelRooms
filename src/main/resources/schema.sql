create table if not exists hotel(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    location TEXT,
    rating INT
);

create table if not exists room(
    id INT PRIMARY KEY AUTO_INCREMENT,
    roomnumber TEXT,
    roomtype TEXT,
    price DOUBLE,
    hotelid INT,
    FOREIGN KEY (hotelid) REFERENCES hotel(id)
);

