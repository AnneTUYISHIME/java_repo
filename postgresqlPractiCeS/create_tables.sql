CREATE TABLE  Book(
 book_id SERIAL PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    genre VARCHAR(50),
    price DECIMAL(10, 2),
    stock_quantity INTEGER
);

CREATE TABLE  Customer(
customer_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone VARCHAR(20)
);

CREATE TABLE Orders(
 order_id SERIAL PRIMARY KEY,
    customer_id INTEGER, -- No foreign key constraint
    order_date DATE,
    total_amount DECIMAL(10, 2)
)
