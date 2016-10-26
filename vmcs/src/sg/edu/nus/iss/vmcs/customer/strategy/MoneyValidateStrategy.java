package sg.edu.nus.iss.vmcs.customer.strategy;

import sg.edu.nus.iss.vmcs.store.Coin;

public interface MoneyValidateStrategy {
	public boolean validate(Coin coin, ValidateItem validateItem);
}
