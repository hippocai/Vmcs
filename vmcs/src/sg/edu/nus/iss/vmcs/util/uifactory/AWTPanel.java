package sg.edu.nus.iss.vmcs.util.uifactory;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class AWTPanel extends Panel implements VmcsPanel  {

	@Override
	public void add(VmcsButton button) {
		add((Button)button);
		
	}

	@Override
	public void add(VmcsLabel label) {
		
		add((Label) label);
		
	}

	@Override
	public void add(VmcsTextField textfield) {
		add((TextField) textfield);
		
	}

}
