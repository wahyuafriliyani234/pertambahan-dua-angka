
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi GUI Pertama");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 300);
        JLabel label = new JLabel();
        label.setText("Ini label");
        frame.add(label);
        frame.setVisible(true);

    }
}
