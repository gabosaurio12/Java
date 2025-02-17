import javax.swing.*;

public class App {
	private JFrame frame;
	private JPanel panel;

	public App(int x, int y) {
		frame = new JFrame("App");
		frame.setSize(x, y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		elementosPanel();

		frame.add(panel);
		frame.setVisible(true);
	}

	private void elementosPanel() {
		panel.add(new JLabel("Hola k ace"));
		panel.add(new JButton("Tocame Jack"));
		panel.add(new JTextField(10));
		panel.add(new JTextArea(5,2));
		panel.add(new JCheckBox("Si?"));
		panel.add(new JRadioButton("SW"));
		panel.add(new JComboBox<String>());

		String[] datos = {"1", "2", "3"};	
		JList<String> lista = new JList<>(datos);
		panel.add(lista);
	}
}
