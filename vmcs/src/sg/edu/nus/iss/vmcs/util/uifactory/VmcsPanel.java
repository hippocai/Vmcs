package sg.edu.nus.iss.vmcs.util.uifactory;

import java.awt.LayoutManager;

public interface VmcsPanel {
	public abstract void add(VmcsButton button);
	public abstract void add(VmcsTextField textField);
	public abstract void add(VmcsLabel label);
	public abstract void setLayout(LayoutManager gridLayout);
	
}
