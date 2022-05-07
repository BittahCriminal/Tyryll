import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Taskbar {

  public static JFrame frame;
  public static JTextArea textArea;
  
  // you should comment your code. 
  // makes it easier to collaborate
  // with others on what you are trying
  // to accomplish

  
  public static void main(String[] args) {
    new Taskbar();    
  } 

  public Taskbar() {
    createWindow();
    frame.setVisible(true);
  }
  
  public void createWindow() {
    frame = new JFrame("Notepad");
    frame.setSize(400, 350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void createJTextArea() {
    textArea = new JTextArea();
    frame.add(textArea);
  }
}