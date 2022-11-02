package it.unibo.patterns.templatemethod.live;

public class BankAccountVariableTax extends AbstractBankAccount {

    public BankAccountVariableTax(int currentAmount) {
        super(currentAmount);
    }

    @Override
    protected int getTax(int currentAmount) {
        return (currentAmount<50 ? 1 : 0);
    }

}
