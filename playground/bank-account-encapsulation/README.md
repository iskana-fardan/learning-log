# Bank Account Encapsulation

A micro-project to practice **OOP encapsulation** in Java.

## What it does

Simulates a basic bank account with protected fields and controlled access through public methods.

## Concepts practiced

- `private` fields (`owner`, `balance`, `accountNumber`)
- Public getters and methods as the only way to interact with state
- Input validation in `deposit()` and `withdraw()`
- Constructor-level guard for negative initial balance

## Project structure

```
src/
  BankAccount.java   # The encapsulated class
  Main.java          # Demo usage
```

## Running

Open in IntelliJ and run `Main`, or compile and run from the terminal:

```bash
javac src/BankAccount.java src/Main.java -d out/
java -cp out/ Main
```

## Sample output

```
Balance: 1000
Withdrawn: 500
New balance: 500
Deposited: 1000
New balance: 1500
Owner: John
Account Number: 123455
Balance: 1500
```
