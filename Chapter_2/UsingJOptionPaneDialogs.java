import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {

            String name = JOptionPane.showInputDialog(null, "Enter your name:");


            if (name == null) {
                break;
            }


            int response = JOptionPane.showConfirmDialog(null, 
                    "Do you want your name to be shown?", 
                    "Name Confirmation", 
                    JOptionPane.YES_NO_OPTION);

          
            if (response == JOptionPane.YES_OPTION) {
                
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
                break; 
                
            } else {
            
                continue;
            }
        }
    }
}
