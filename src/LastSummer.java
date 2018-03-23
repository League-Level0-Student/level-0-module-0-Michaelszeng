import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, "I know that you existed last summer "+name+"!");
}
}
