INSERT INTO warranty_table
    (warranty_period, warranty_terms, product_buy_date)
VALUES (12, 'Standard warranty', '2026-02-02'),  -- id 1
       (18, 'Extended warranty', '2026-02-02'),  -- id 2
       (6, 'Basic warranty', '2026-02-02'),      -- id 3
       (24, 'Gold warranty', '2026-02-02'),      -- id 4
       (36, 'Platinum warranty', '2026-02-02'),  -- id 5
       (48, 'Diamond warranty', '2026-02-02'),   -- id 6
       (60, 'Ultra warranty', '2026-02-02'),     -- id 7
       (72, 'Prime warranty', '2026-02-02'),     -- id 8
       (84, 'Elite warranty', '2026-02-02'),     -- id 9
       (96, 'Max warranty', '2026-02-02'),       -- id 10
       (108, 'Plus warranty', '2026-02-02'),     -- id 11
       (120, 'Super warranty', '2026-02-02'),    -- id 12
       (132, 'Pro warranty', '2026-02-02'),      -- id 13
       (144, 'Care+ warranty', '2026-02-02'),    -- id 14
       (156, 'Shield warranty', '2026-02-02'),   -- id 15
       (168, 'Safe warranty', '2026-02-02'),     -- id 16
       (180, 'Protect warranty', '2026-02-02'),  -- id 17
       (192, 'Secure warranty', '2026-02-02'),   -- id 18
       (204, 'Advanced warranty', '2026-02-02'), -- id 19
       (216, 'Ultimate warranty', '2026-02-02'); -- id 20

INSERT INTO product_table
    (sku, title_x, price, quantity, product_type, created_at, updated_at, warranty_id)
VALUES ('sku1001', 'Nestle Chocolate', 125.24, 12, 'OVER_PRICED', '2024-01-05 10:12:45', '2024-01-06 11:30:20', 1),
       ('sku1002', 'Dairy Milk Silk', 175.50, 20, 'UNDER_PRICED', '2024-01-08 09:45:10', '2024-01-09 10:15:55', 2),
       ('sku1003', 'KitKat Classic', 45.00, 50, 'UNDER_PRICED', '2024-01-10 14:22:33', '2024-01-11 16:40:12', 3),
       ('sku1004', 'Perk Wafer', 30.00, 100, 'UNDER_PRICED', '2024-01-12 08:05:17', '2024-01-12 18:55:41', 4),
       ('sku1005', 'Munch Crunchy', 35.00, 80, 'UNDER_PRICED', '2024-01-14 12:10:09', '2024-01-15 13:35:26', 5),
       ('sku1006', 'Five Star', 40.00, 60, 'UNDER_PRICED', '2024-01-16 11:00:00', '2024-01-16 19:20:10', 6),
       ('sku1007', 'Snickers Bar', 55.75, 45, 'OVER_PRICED', '2024-01-18 09:33:48', '2024-01-18 21:44:30', 7),
       ('sku1008', 'Mars Chocolate', 60.00, 40, 'OVER_PRICED', '2024-01-20 15:14:02', '2024-01-21 10:25:17', 8),
       ('sku1009', 'Bounty Coconut', 65.00, 30, 'OVER_PRICED', '2024-01-22 07:55:39', '2024-01-22 17:45:11', 9),
       ('sku1010', 'Ferrero Rocher', 399.99, 15, 'OVER_PRICED', '2024-01-24 13:09:58', '2024-01-25 14:20:44', 10),
       ('sku1011', 'Toblerone', 250.00, 18, 'OVER_PRICED', '2024-01-26 10:30:21', '2024-01-27 11:45:19', 11),
       ('sku1012', 'Lindt Dark', 299.50, 22, 'OVER_PRICED', '2024-01-28 08:18:42', '2024-01-28 20:05:33', 12),
       ('sku1013', 'Amul Dark Chocolate', 110.00, 70, 'UNDER_PRICED', '2024-01-30 16:50:00', '2024-01-31 09:40:12', 13),
       ('sku1014', 'Hershey Milk', 90.00, 65, 'UNDER_PRICED', '2024-02-01 11:12:11', '2024-02-02 13:18:27', 14),
       ('sku1015', 'Milky Bar', 25.00, 150, 'UNDER_PRICED', '2024-02-03 14:44:56', '2024-02-03 22:10:39', 15),
       ('sku1016', 'Galaxy Smooth', 140.75, 28, 'OVER_PRICED', '2024-02-05 09:05:34', '2024-02-05 18:25:18', 16),
       ('sku1017', 'Cadbury Gems', 60.00, 90, 'OVER_PRICED', '2024-02-07 12:30:00', '2024-02-08 10:45:50', 17),
       ('sku1018', 'Choco Pie', 55.00, 85, 'OVER_PRICED', '2024-02-09 17:20:41', '2024-02-10 09:55:22', 18),
       ('sku1019', 'Kinder Joy', 70.00, 40, 'OVER_PRICED', '2024-02-11 08:00:00', '2024-02-11 16:30:30', 19),
       ('sku1020', 'Kinder Bueno', 120.00, 35, 'OVER_PRICED', '2024-02-13 13:15:59', '2024-02-14 11:22:10', 20);