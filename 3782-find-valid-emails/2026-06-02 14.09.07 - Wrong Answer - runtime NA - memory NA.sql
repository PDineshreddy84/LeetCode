SELECT *
FROM Users
WHERE REGEXP_LIKE(
    email,
    '^[A-Za-z0-9]+@[A-Za-z]+\\.com$'
);