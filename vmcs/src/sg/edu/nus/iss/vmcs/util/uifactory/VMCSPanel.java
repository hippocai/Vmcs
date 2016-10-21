package sg.edu.nus.iss.vmcs.util.uifactory;

import java.awt.LayoutManager;

public interface VMCSPanel {
	public abstract void add(VMCSButton button);
	public abstract void add(String location, VMCSPanel panel);
	public abstract void add(VMCSPanel panel);
	public abstract void add(VMCSTextField textField);
	public abstract void add(VMCSLabel label);
	public abstract void setLayout(LayoutManager gridLayout);
	
}
