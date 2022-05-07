import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;

public class Taskbar {

  public static JFrame frame;
  public static JTextArea textArea;
  

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