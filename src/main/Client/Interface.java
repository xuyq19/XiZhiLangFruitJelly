import javax.swing.*;
public class Interface {
    Interface(){
        JFrame frame=new JFrame();
        JButton button=new JButton("Click me");
        button.setBounds(100,100,100,100);
        frame.add(button);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Interface();
    }
   
}


/**
 * a java gui interface demo
 */
