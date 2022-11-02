package it.unibo.patterns.templatemethod.live;

public class BankAccountFixedTax extends AbstractBankAccount {

    public BankAccountFixedTax(int currentAmount) {
        super(currentAmount);
    }

    @Override
    protected int getTax(int currentAmount) {
        return 1;
    }

}
