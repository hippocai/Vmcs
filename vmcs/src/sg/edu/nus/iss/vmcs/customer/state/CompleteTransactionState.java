package sg.edu.nus.iss.vmcs.customer.state;

import sg.edu.nus.iss.vmcs.customer.ChangeGiver;
import sg.edu.nus.iss.vmcs.customer.CoinReceiver;
import sg.edu.nus.iss.vmcs.customer.DispenseController;
import sg.edu.nus.iss.vmcs.customer.TransactionController;

public class CompleteTransactionState implements TransactionState {
	
	private TransactionController transactionController;
	private DispenseController dispenseController;
	private CoinReceiver coinReceiver;
	private ChangeGiver changeGiver;
	
	public CompleteTransactionState(TransactionController transactionController) {
		this.transactionController = transactionController;
		dispenseController = transactionController.getDispenseController();
		coinReceiver = transactionController.getCoinReceiver();
		changeGiver = transactionController.getChangeGiver();
	}

	@Override
	public void startTransaction(int drinkIdentifier) {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void processMoneyReceived(int total) {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void completeTransaction() {
		// TODO Auto-generated method stub
		System.out.println("CompleteTransaction: Begin");
		this.dispenseController.dispenseDrink(this.transactionController.getSelection());
		int totalMoneyInserted=coinReceiver.getTotalInserted();
		int change=totalMoneyInserted-this.transactionController.getPrice();
		if(change>0){
			this.changeGiver.giveChange(change);
		}
		else{
			this.transactionController.getCustomerPanel().setChange(0);
//			this.transactionController.setTransactionState(this.transactionController.getSuspendTransactionState());
		}
		coinReceiver.storeCash();
		this.dispenseController.allowSelection(true);
		
		this.transactionController.refreshMachineryDisplay();
		System.out.println("CompleteTransaction: End");
		this.transactionController.setTransactionState(this.transactionController.getSelectDrinkState());
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
