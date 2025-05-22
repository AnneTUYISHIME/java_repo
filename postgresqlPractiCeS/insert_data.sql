-- Insert records into Books
INSERT INTO Book (title, author, genre, price, stock_quantity) VALUES
('The Silent Patient', 'Alex Michaelides', 'Fiction', 20.00, 10),
('Atomic Habits', 'James Clear', 'Self-help', 18.00, 30),
('Educated', 'Tara Westover', 'Memoir', 22.50, 15),
('The Midnight Library', 'Matt Haig', 'Fiction', 17.00, 20),
('Deep Work', 'Cal Newport', 'Productivity', 25.00, 8);

-- Insert records into Customers
INSERT INTO Customer (first_name, last_name, email, phone) VALUES
('John', 'Doe', 'john.doe@example.com', '123-456-7890'),
('Jane', 'Smith', 'jane.smith@example.com', '234-567-8901'),
('Alice', 'Johnson', 'alice.johnson@example.com', '345-678-9012'),
('Bob', 'Wilson', 'bob.wilson@example.com', '456-789-0123'),
('Emily', 'Watson', 'emily.watson@example.com', '567-890-1234');

-- Insert records into Orders
INSERT INTO Orders (customer_id, order_date, total_amount) VALUES
(1, '2025-05-01', 42.00),
(2, '2025-05-02', 78.50),
(3, '2025-05-03', 25.00),
(4, '2025-05-04', 99.99),
(5, '2025-05-05', 60.00);
select *from book