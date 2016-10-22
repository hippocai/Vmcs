package sg.edu.nus.iss.vmcs.customer.state;

import sg.edu.nus.iss.vmcs.customer.ChangeGiver;
import sg.edu.nus.iss.vmcs.customer.CoinReceiver;
import sg.edu.nus.iss.vmcs.customer.DispenseController;
import sg.edu.nus.iss.vmcs.customer.TransactionController;
import sg.edu.nus.iss.vmcs.store.DrinksBrand;
import sg.edu.nus.iss.vmcs.store.Store;
import sg.edu.nus.iss.vmcs.store.StoreItem;

public class SelectDrinkState implements TransactionState {
	
	private TransactionController transactionController;
	private DispenseController dispenseController;
	private CoinReceiver coinReceiver;
	private ChangeGiver changeGiver;

	public SelectDrinkState(TransactionController transactionController) {
		super();
		this.transactionController = transactionController;
		dispenseController = transactionController.getDispenseController();
		coinReceiver = transactionController.getCoinReceiver();
		changeGiver = transactionController.getChangeGiver();
	}

	@Override
	public void startTransaction(int drinkIdentifier) {
		// TODO Auto-generated method stub
		this.transactionController.setSelection(drinkIdentifier);
		StoreItem storeItem=this.transactionController.getMainController().getStoreController().getStoreItem(Store.DRINK,drinkIdentifier);
		DrinksBrand drinksBrand=(DrinksBrand)storeItem.getContent();
		this.transactionController.setPrice(drinksBrand.getPrice());
		changeGiver.resetChange();
		this.dispenseController.ResetCan();
		changeGiver.displayChangeStatus();
		this.dispenseController.allowSelection(false);
		coinReceiver.startReceiver();
		this.transactionController.getCustomerPanel().setTerminateButtonActive(true);
		this.transactionController.setTransactionState(this.transactionController.getInsetCoinState());
	}

	@Override
	public void processMoneyReceived(int total) {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void completeTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void cancelTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void terminateTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void receiveCoin(double weight) {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void terminateFault() {
		// TODO Auto-generated method stub
		
	}

}
