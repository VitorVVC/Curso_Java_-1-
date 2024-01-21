package Model.Entities;

import Model.Exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = validDouble(balance);
        this.withdrawLimit = validDouble(withdrawLimit);
    }

    // Métodos extras
    private Double validDouble(Double value) {
        if (value < 0.0) {
            throw new DomainException("Negative numbers isn't accepts");
        }
        return value;
    }

    private void validWithdraw(Double value) {
        if (value > withdrawLimit) {
            throw new DomainException("Withdraw Error: The amount exceeds withdraw limit");
        }
        if (value > balance) {
            throw new DomainException("Withdraw Error: Not enough balance");
        }
    }

    // Métodos pedidos no exercicio
    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        validWithdraw(amount);
        balance -= amount;
    }

    // Métodos get e set
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getwithdrawLimit() {
        return withdrawLimit;
    }

    public void setwithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
