CREATE OR REPLACE PROCEDURE TransferFunds(
  p_SourceAccountID IN NUMBER,
  p_TargetAccountID IN NUMBER,
  p_Amount IN NUMBER
) AS
  v_SourceBalance NUMBER;
BEGIN
  SELECT Balance INTO v_SourceBalance FROM BankAccount
  WHERE AccountID = p_SourceAccountID
  FOR UPDATE;

  IF v_SourceBalance < p_Amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
  END IF;

  -- Deduct from source
  UPDATE BankAccount
  SET Balance = Balance - p_Amount
  WHERE AccountID = p_SourceAccountID;

  -- Add to target
  UPDATE BankAccount
  SET Balance = Balance + p_Amount
  WHERE AccountID = p_TargetAccountID;

  COMMIT;
END;
/
