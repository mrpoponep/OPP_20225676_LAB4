package OtherProject.hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumbers{
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotificaton = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotificaton += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotificaton += strNum2;

        JOptionPane.showMessageDialog(null, strNotificaton, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}