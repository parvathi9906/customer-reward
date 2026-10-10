
INSERT INTO customers (id, name)
VALUES (1, 'Ram'), (2, 'Ramesh'), (3, 'Sita')
ON DUPLICATE KEY UPDATE name = VALUES(name);

INSERT INTO transactions (customer_id, amount, transaction_date) VALUES
    (1, 120.00, '2026-01-05'),
    (1, 75.00,  '2026-01-15'),
    (1, 40.00,  '2026-02-10'),
    (1, 110.00, '2026-02-20'),
    (1, 60.00,  '2026-03-12'),
    (2, 200.00, '2026-01-08'),
    (2, 60.00,  '2026-01-20'),
    (2, 90.00,  '2026-02-14'),
    (2, 150.00, '2026-03-02'),
    (3, 45.00,  '2026-01-11'),
    (3, 100.00, '2026-02-17'),
    (3, 125.00, '2026-03-21');