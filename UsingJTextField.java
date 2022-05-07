import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class UsingJTextField implements ActionListener {

  private static JLabel UserLabel;
  private static JLabel PasswordLabel;
  private static JTextField UserText;
  private static JPasswordField Passwordtxt;
  private static JButton Loginbutton;
  private static JButton Exitbutton;
  private static JLabel success;
  
  public static void main(String[] args) {
  
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    
    panel.setLayout(null);

    UserLabel = new JLabel("User");
    UserLabel.setBounds(10, 20, 80, 25);
    panel.add(UserLabel);

    PasswordLabel = new JLabel("Password");
    PasswordLabel.setBounds(10, 50, 80, 25);
    panel.add(PasswordLabel);

    UserText = new JTextField();
    UserText.setBounds(100, 20, 165, 25);
    panel.add(UserText);

    Passwordtxt = new JPasswordField();
    Passwordtxt.setBounds(100, 50, 165, 25);
    panel.add(Passwordtxt);

    Loginbutton = new JButton("Login");
    Loginbutton.setBounds(10, 80, 80, 25);
    Loginbutton.addActionListener(new UsingJTextField());
    panel.add(Loginbutton);

    Exitbutton = new JButton("Exit");
    Exitbutton.setBounds(80, 80, 80, 25);
    Exitbutton.addActionListener((e -> {
	        frame.dispose();
	        }));
    Exitbutton.setFocusable(false);
    panel.add(Exitbutton);

    success = new JLabel("");
    success.setBounds(10, 110, 300, 25);
    panel.add(success);

    frame.setVisible(true);
  }
   public void actionPerformed(ActionEvent login) {
          String user = UserText.getText();
          String password = Passwordtxt.getText();
          System.out.println(user + "," + password);
          // so if they aren't admin, then you can't login?
          // this implementation is very limited. 
          if(user.equals("Admin") && password.equals("Admin")){success.setText("Welcome!");}
          else{success.setText("Login details does not match!");}
  }

  /*public void actionPerformed(ActionEvent event) {
    
  }*/

  /*public void setUpButtonListeners(){
    ActionListener buttonListener = new ActionListener () {
      @Override
      public void actionPerformed(ActionEvent ae) {
        // instructions to happen when an event (button clicked)
        // occurs
        // putting in an event that isn't relevant. will need to have this updated.
        System.out.println("Ouch!");
      }
    };
  }*/
  
 }
