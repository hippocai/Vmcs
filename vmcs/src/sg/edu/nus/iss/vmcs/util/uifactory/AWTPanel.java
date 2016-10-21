package sg.edu.nus.iss.vmcs.util.uifactory;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JPanel;

public class AWTPanel extends Panel implements VMCSPanel {

	@Override
	public void add(VMCSButton button) {
		add((Button)button);
	}
	
	@Override
	public void add(VMCSPanel panel) {
		if (panel instanceof Panel)
			add((Panel) panel);
		if (panel instanceof JPanel)
			add((JPanel) panel);
	}
	
	@Override
	public void add(String loc, VMCSPanel panel) {
		if (panel instanceof Panel)
			add(loc, (Panel) panel);
		if (panel instanceof JPanel)
			add(loc, (JPanel) panel);
	}

	@Override
	public void add(VMCSTextField textField) {
		add((TextField) textField);
	}

	@Override
	public void add(VMCSLabel label) {
		add((Label) label);
	}
	
}
