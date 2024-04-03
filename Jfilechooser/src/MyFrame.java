import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;;
public class MyFrame extends JFrame implements  ActionListener{
JFrame frame;
JButton button;
MyFrame() {
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setSize(500,500);
   this.setLayout(new FlowLayout());
   
    frame = new JFrame();
    

    button = new JButton("Select file");
    button.addActionListener(this);


    this.add(button);
    this.pack();
    this.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("/Users/karsangdorjee/cd desktop.pub"));
           //int response = fileChooser.showOpenDialog(null); //opensfile
           int response = fileChooser.showOpenDialog(null); //saves_file


           if(response == JFileChooser.APPROVE_OPTION){
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(file);
           }
        }
    }

}
