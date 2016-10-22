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
	private static PropertyLoader loader;
	public static void setPropertyLoader(PropertyLoader propertyLoader){
		loader=propertyLoader;
	}
    private DrinksStore(PropertyLoader loader) {
    	super(loader);
    }
    
    //Singleton Pattern
    //thread safe and performance  promote
    public static DrinksStore getInstance() throws IllegalAccessException{
    	if(loader==null){
    		throw new IllegalAccessException("Please Set PropertyLoader");
    	}
    	if(drinksStore == null){
    		synchronized(DrinksStore.class){
    			//when more than two threads run into the first null check same time
    		    //to avoid instanced more than one time, it needs to be checked again.
    			if(drinksStore == null){
    	    		drinksStore = new DrinksStore(loader);
    			}
    		}
    	}
    	return drinksStore;
    }

	@Override
	public void init() {
		// TODO Auto-generated method stub
		int numOfItems = loader.getNumOfItems();
		setStoreSize(numOfItems);

		for (int i = 0; i < numOfItems; i++) {
            DrinksStoreItem item = (DrinksStoreItem) loader.getItem(i);
			StoreObject brand = item.getContent();
			StoreObject existingBrand = findObject(brand.getName());
			if (existingBrand != null) {
			    item.setContent(existingBrand);
			}
			addItem(i, item);	
		}
	}
}//End of class DrinksStore
