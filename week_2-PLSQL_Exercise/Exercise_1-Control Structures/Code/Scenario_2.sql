BEGIN
    FOR c IN (SELECT CustomerID FROM Customers WHERE Balance > 10000) LOOP
        UPDATE Customers
        SET IsVIP = 'Y'
        WHERE CustomerID = c.CustomerID;
    END LOOP;
    COMMIT;
END;
/

SELECT CustomerID, Name, Balance, IsVIP FROM Customers;
