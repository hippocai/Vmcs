package sg.edu.nus.iss.vmcs.util.uifactory;

import java.awt.event.ActionListener;

public interface VMCSButton {
	public abstract void addActionListener(ActionListener l);
	public abstract void setActionCommand(String command);
}
