CREATE OR REPLACE PROCEDURE TransferFunds (
    fromAccount IN NUMBER,
    toAccount IN NUMBER,
    amount IN NUMBER
) IS
    fromBalance NUMBER;
BEGIN
   
    SELECT Balance INTO fromBalance
    FROM Accounts
    WHERE AccountID = fromAccount;

    IF fromBalance < amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

   
    UPDATE Accounts
    SET Balance = Balance - amount,
        LastModified = SYSDATE
    WHERE AccountID = fromAccount;


    UPDATE Accounts
    SET Balance = Balance + amount,
        LastModified = SYSDATE
    WHERE AccountID = toAccount;

    COMMIT;
END;
/


EXEC TransferFunds(1, 2, 500);  -- Transfer ₹500 from Account 1 to 2
SELECT * FROM Accounts;
