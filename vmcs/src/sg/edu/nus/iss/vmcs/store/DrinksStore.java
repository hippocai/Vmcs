/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.store;

/**
 * This object is storage, in the vending machine's memory, for the total number of
 * cans of each DrinksBrand held by the vending machine&#46;
 * 
 * @see CashStore
 * @see CashStoreItem
 * @see Coin
 * @see DrinksBrand
 * @see DrinksStoreItem
 * @see Store
 * @see StoreController
 * @see StoreItem
 * @see StoreObject
 * 
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */
public class DrinksStore extends Store {

	private static volatile DrinksStore drinksStore = null;
	/**
	 * This constructor creates an instance of DrinksStore object.
	 */
    public DrinksStore() {
    }
    
    //Singleton Pattern
    //thread safe and performance  promote
    public static DrinksStore getInstance(){
    	if(drinksStore == null){
    		synchronized(DrinksStore.class){
    			//when more than two threads run into the first null check same time
    		    //to avoid instanced more than one time, it needs to be checked again.
    			if(drinksStore == null){
    	    		drinksStore = new DrinksStore();
    			}
    		}
    	}
    	return drinksStore;
    }
}//End of class DrinksStore
