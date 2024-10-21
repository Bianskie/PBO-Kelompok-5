CREATE DATABASE Java_Farm;
use Java_Farm;

CREATE TABLE User (
    userID INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(255),
    address TEXT,
    phone VARCHAR(15),
    profilePicture VARCHAR(255),
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Category (
    categoryID INT AUTO_INCREMENT PRIMARY KEY,
    categoryName VARCHAR(100) NOT NULL,
    parentCategoryID INT DEFAULT NULL,
    FOREIGN KEY (parentCategoryID) REFERENCES Category(categoryID)
);

CREATE TABLE Product (
    productID INT AUTO_INCREMENT PRIMARY KEY,
    productName VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL,
    categoryID INT,
    images TEXT,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (categoryID) REFERENCES Category(categoryID)
    );
    
    CREATE TABLE Cart (
    cartID INT AUTO_INCREMENT PRIMARY KEY,
    userID INT NOT NULL,
    totalPrice DECIMAL(10, 2) DEFAULT 0,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (userID) REFERENCES User(userID) ON DELETE CASCADE
);

CREATE TABLE CartItem (
    cartItemID INT AUTO_INCREMENT PRIMARY KEY,
    cartID INT NOT NULL,
    productID INT NOT NULL,
    quantity INT NOT NULL,
    priceAtPurchase DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (cartID) REFERENCES Cart(cartID) ON DELETE CASCADE,
    FOREIGN KEY (productID) REFERENCES Product(productID) ON DELETE CASCADE
);

CREATE TABLE Orders (
    orderID INT AUTO_INCREMENT PRIMARY KEY,
    userID INT NOT NULL,
    shippingAddress TEXT NOT NULL,
    paymentStatus ENUM('pending', 'paid', 'failed') NOT NULL,
    shippingStatus ENUM('pending', 'shipped', 'delivered', 'canceled') NOT NULL,
    orderDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    deliveryDate TIMESTAMP DEFAULT NULL,
    totalAmount DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (userID) REFERENCES User(userID) ON DELETE CASCADE
);

CREATE TABLE Payment (
    paymentID INT AUTO_INCREMENT PRIMARY KEY,
    orderID INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    paymentMethod ENUM('bank_transfer') NOT NULL,
    paymentStatus ENUM('success', 'failed', 'pending') NOT NULL,
    paymentDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (orderID) REFERENCES Orders(orderID) ON DELETE CASCADE
);

CREATE TABLE Shipping (
    shippingID INT AUTO_INCREMENT PRIMARY KEY,
    orderID INT NOT NULL,
    shippingAddress TEXT NOT NULL,
    shippingMethod ENUM ('ninja_exspres','jnt','jaf_exspres'),
    shippingCost DECIMAL(10, 2) DEFAULT 0,
    shippingStatus ENUM('pending', 'shipped', 'delivered', 'canceled') NOT NULL,
    FOREIGN KEY (orderID) REFERENCES Orders(orderID) ON DELETE CASCADE
);

CREATE TABLE Chat (
    chatID INT AUTO_INCREMENT PRIMARY KEY,
    userID INT NOT NULL,
    messages TEXT,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (userID) REFERENCES User(userID) ON DELETE CASCADE
);

use java_farm;
drop table Chat;

alter table user add column role ENUM('admin', 'user') default 'user';

ALTER TABLE Orders
DROP COLUMN shippingStatus;