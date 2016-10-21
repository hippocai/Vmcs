package sg.edu.nus.iss.vmcs.store;

import java.io.IOException;

import sg.edu.nus.iss.vmcs.system.CashPropertyLoader;
import sg.edu.nus.iss.vmcs.system.DrinkPropertyLoader;
import sg.edu.nus.iss.vmcs.system.Environment;

public class PropertyFactory {

	public static PropertyLoader getProp(String name) throws Exception{
		if(name.equalsIgnoreCase("cash")){
			CashPropertyLoader cp=new CashPropertyLoader(Environment.getCashPropFile());
			cp.initialize();
			return cp;
		}else if(name.equalsIgnoreCase("drinks")||name.equalsIgnoreCase("drink")){
			DrinkPropertyLoader dp=new DrinkPropertyLoader(Environment.getDrinkPropFile());
			dp.initialize();
			return dp;
		}
		throw new IllegalArgumentException("property name: "+name+" not found");
	}
}
