package sg.edu.nus.iss.vmcs.customer.state;

public interface TransactionState {
	public void startTransaction(int drinkIdentifier);
	public void processMoneyReceived(int total);
	public void completeTransaction();
	public void cancelTransaction();
	public void terminateTransaction();
	public void terminateFault();
	public void receiveCoin(double weight);
}
