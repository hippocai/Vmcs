package sg.edu.nus.iss.vmcs.customer.state;

import sg.edu.nus.iss.vmcs.customer.CoinReceiver;
import sg.edu.nus.iss.vmcs.customer.DispenseController;
import sg.edu.nus.iss.vmcs.customer.TransactionController;

public class InsertCoinState implements TransactionState {
	
	private TransactionController transactionController;
	private DispenseController dispenseController;
	private CoinReceiver coinReceiver;
	
	public InsertCoinState(TransactionController transactionController) {
		this.transactionController = transactionController;
		dispenseController = transactionController.getDispenseController();
		coinReceiver = transactionController.getCoinReceiver();
	}

	@Override
	public void startTransaction(int drinkIdentifier) {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void processMoneyReceived(int total) {
		// TODO Auto-generated method stub
		if(total>=this.transactionController.getPrice()){
			this.transactionController.setTransactionState(this.transactionController.getCompleteTransactionState());
			this.transactionController.completeTransaction();
		} else{
			coinReceiver.continueReceive();
		}
	}

	@Override
	public void completeTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation..");
	}

	@Override
	public void cancelTransaction() {
		// TODO Auto-generated method stub
		System.out.println("CancelTransaction: Begin");
		coinReceiver.stopReceive();
		coinReceiver.refundCash();
		this.dispenseController.allowSelection(true);
		this.transactionController.refreshMachineryDisplay();
		System.out.println("CancelTransaction: End");
		
		this.transactionController.setTransactionState(this.transactionController.getSelectDrinkState());
		
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
