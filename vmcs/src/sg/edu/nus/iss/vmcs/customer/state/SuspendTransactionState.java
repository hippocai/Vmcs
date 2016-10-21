package sg.edu.nus.iss.vmcs.customer.state;

import sg.edu.nus.iss.vmcs.customer.CoinReceiver;
import sg.edu.nus.iss.vmcs.customer.DispenseController;
import sg.edu.nus.iss.vmcs.customer.TransactionController;

public class SuspendTransactionState implements TransactionState {
	
	private TransactionController transactionController;
	private DispenseController dispenseController;
	private CoinReceiver coinReceiver;
	
	public SuspendTransactionState(TransactionController transactionController) {
		this.transactionController = transactionController;
		dispenseController = transactionController.getDispenseController();
		coinReceiver = transactionController.getCoinReceiver();
	}

	@Override
	public void startTransaction(int drinkIdentifier) {
		// TODO Auto-generated method stub
		
		System.out.println(">>> Invalid operation, the transaction is suspended...");
	}

	@Override
	public void processMoneyReceived(int total) {
		// TODO Auto-generated method stub
		
		System.out.println(">>> Invalid operation, the transaction is suspended...");
	}

	@Override
	public void completeTransaction() {
		// TODO Auto-generated method stub
		
		System.out.println(">>> Invalid operation, the transaction is suspended...");
	}

	@Override
	public void cancelTransaction() {
		// TODO Auto-generated method stub
		
		System.out.println(">>> Invalid operation, the transaction is suspended...");
	}

	@Override
	public void terminateTransaction() {
		// TODO Auto-generated method stub
		System.out.println("TerminateTransaction: Begin");
		this.dispenseController.allowSelection(false);
		coinReceiver.stopReceive();
		coinReceiver.refundCash();
		if(this.transactionController.getCustomerPanel() != null){
			this.transactionController.getCustomerPanel().setTerminateButtonActive(false);
		}
		this.transactionController.refreshMachineryDisplay();
		System.out.println("TerminateTransaction: End");	
	}

	@Override
	public void receiveCoin(double weight) {
		// TODO Auto-generated method stub
		
		System.out.println(">>> Invalid operation, the transaction is suspended...");
	}

	@Override
	public void terminateFault() {
		// TODO Auto-generated method stub
		System.out.println("TerminateFault: Begin");
		this.dispenseController.allowSelection(false);
		coinReceiver.refundCash();
		this.transactionController.refreshMachineryDisplay();
		System.out.println("TerminateFault: End");
	}

}
