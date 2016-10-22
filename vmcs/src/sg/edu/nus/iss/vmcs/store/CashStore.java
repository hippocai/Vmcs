/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.store;

/**
 * This object represents the store of cash in the vending machine.
 * 
 * @see CashStoreItem
 * @see Coin
 * @see DrinksBrand
 * @see DrinksStore
 * @see DrinksStoreItem
 * @see Store
 * @see StoreController
 * @see StoreItem
 * @see StoreObject
 * 
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */
public class CashStore extends Store {
	/**This is the constant for coin invalid weight.*/
	public final static int INVALID_COIN_WEIGHT = 9999;
	private static volatile CashStore cashStore = null;
	private static PropertyLoader loader;
	public static void setPropertyLoader(PropertyLoader propertyLoader){
		loader=propertyLoader;
	}
	/**
	 * This constructor creates an instance of the CashStore object.
	 */
	private CashStore(PropertyLoader loader) {
		super(loader);
	}
	
	//Singleton Pattern
    //thread safe and performance  promote

    public static CashStore getInstance() throws IllegalAccessException{
    	if(loader==null){
    		throw new IllegalAccessException("Please Set PropertyLoader");
    	}
    	if(cashStore == null){
    		synchronized(CashStore.class){
    		    //when more than two threads run into the first null check same time
    		    //to avoid instanced more than one time, it needs to be checked again.
    			if(cashStore == null){
    	    		cashStore = new CashStore(loader);
    			}
    		}

    	}
    	return cashStore;
    }

	@Override
	public void init() {
		// TODO Auto-generated method stub
		int numOfItems = loader.getNumOfItems();
		setStoreSize(numOfItems);

		for (int i = 0; i < numOfItems; i++) {
		    CashStoreItem item = (CashStoreItem) loader.getItem(i);
			addItem(i, item);
		}	
	}
}//End of class CashStore