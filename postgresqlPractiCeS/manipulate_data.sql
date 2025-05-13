-- UPDATE operations
UPDATE Book
SET price = price + 5
WHERE title = 'The Silent Patient';

UPDATE Book
SET stock_quantity = 25
WHERE title = 'Atomic Habits';

-- DELETE operations
DELETE FROM Customer
WHERE email = 'john.doe@example.com';

DELETE FROM Orders
WHERE order_id = 3;

-- SELECT queries
-- 1. List all books in the 'Fiction' genre
SELECT * FROM Book
WHERE genre = 'Fiction';

-- 2. Show all orders with a total amount greater than 50
SELECT * FROM Orders
WHERE total_amount > 50;

-- 3. Search for customers whose last name contains 'son'
SELECT * FROM Customer
WHERE last_name ILIKE '%son%';
