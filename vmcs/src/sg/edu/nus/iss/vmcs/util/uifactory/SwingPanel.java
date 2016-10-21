package sg.edu.nus.iss.vmcs.util.uifactory;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingPanel extends JPanel implements VMCSPanel {

	@Override
	public void add(VMCSButton button) {
		add((JButton)button);
	}

	@Override
	public void add(VMCSPanel panel) {
		add((JPanel) panel);
		
	}

	@Override
	public void add(VMCSTextField textField) {
		add((JTextField) textField);
	}

	@Override
	public void add(VMCSLabel label) {
		add((JLabel) label);
	}

	@Override
	public void add(String location, VMCSPanel panel) {
		add(location, (JPanel) panel);
	}

}
