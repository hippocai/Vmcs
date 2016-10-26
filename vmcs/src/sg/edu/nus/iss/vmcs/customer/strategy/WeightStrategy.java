package sg.edu.nus.iss.vmcs.customer.strategy;

import sg.edu.nus.iss.vmcs.store.Coin;

public class WeightStrategy implements MoneyValidateStrategy {

	@Override
	public boolean validate(Coin coin, ValidateItem validateItem) {
		// TODO Auto-generated method stub
		if (coin.getWeight() == validateItem.getWeight()){
			return false;
		}
	
		return true;
	}

}
