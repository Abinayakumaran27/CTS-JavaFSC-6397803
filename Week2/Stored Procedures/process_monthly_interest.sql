CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  FOR acc IN (SELECT AccountID, Balance FROM SavingsAccount) LOOP
    UPDATE SavingsAccount
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountID = acc.AccountID;
  END LOOP;

  COMMIT;
END;
/
