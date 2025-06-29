# 💳 PL/SQL Stored Procedures for Bank Operations

## 📦 Description
This project demonstrates stored procedures to automate core banking tasks using PL/SQL.

## 📂 Files
- `process_monthly_interest.sql` – Applies 1% monthly interest to all savings account balances.
- `update_employee_bonus.sql` – Updates employee salaries by adding a bonus % for a department.
- `transfer_funds.sql` – Transfers a specified amount from one account to another with validation.

## ✅ Usage
1. Run these files in an Oracle-compatible tool (SQL*Plus, SQL Developer).
2. Ensure the required tables (`SavingsAccount`, `Employee`, `BankAccount`) are created.
3. Call the procedures like below:

```sql
-- Process monthly interest
EXEC ProcessMonthlyInterest;

-- Update bonus (e.g., 10% for Department 5)
EXEC UpdateEmployeeBonus(5, 10);

-- Transfer ₹1000 from Account 101 to Account 202
EXEC TransferFunds(101, 202, 1000);
