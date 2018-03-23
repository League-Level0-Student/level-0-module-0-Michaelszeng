import javax.swing.JOptionPane;

public class EvethingIsAwesome {
public static void main(String[] args) {
	String thing = JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, thing+" is awesome");
}
}
