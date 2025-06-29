BEGIN
  FOR cust IN (SELECT CustomerID, Age, InterestRate FROM Customer) LOOP
    IF cust.Age > 60 THEN
      UPDATE Customer
      SET InterestRate = InterestRate - 1
      WHERE CustomerID = cust.CustomerID;
    END IF;
  END LOOP;

  COMMIT;
END;
/
