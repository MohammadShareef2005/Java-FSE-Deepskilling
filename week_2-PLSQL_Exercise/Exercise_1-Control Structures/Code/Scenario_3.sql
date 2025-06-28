BEGIN
    FOR c IN (
        SELECT c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan for ' || c.Name || ' is due on ' || TO_CHAR(c.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/


