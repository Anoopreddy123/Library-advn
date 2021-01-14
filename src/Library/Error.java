package Library;

import javax.swing.*;

public class Error {
   JLabel label1 = new JLabel();

   Error(){
       JFrame jf = new JFrame("Error Connecting");
       jf.setLayout(null);
       jf.setVisible(true);
       jf.setSize(500, 250);
       jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       label1.setText("Couldnot connect with the MySql."+
               "Check your connection");
       label1.setBounds(10, 10, 600, 40);
       jf.add(label1);

   }




}
