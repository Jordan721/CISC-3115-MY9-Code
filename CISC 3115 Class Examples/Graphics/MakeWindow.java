package window;
import javax.swing.*;

public class MakeWindow{

 public static void main(String[] args) {
   JFrame window = new JFrame();

   window.setSize(300, 300);
   // width,height in pioxels


   window.setTitle("Our first GUI Program");
   window.setDefalutClosedOperation(JFrame.EXIT_ON_CLOSE);
   window.setVisible(true);
  }

}
