import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
public class MouseInfo extends JFrame {
private final JPanel contentPanel = new JPanel();
JLabel value_x = null;
JLabel value_y = null;
/**
* Launch the application.
*/
public static void main(String[] args) {
try {
MouseInfo info_frame = new MouseInfo();
info_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
info_frame.setVisible(true);
info_frame.setAlwaysOnTop(true);
Timer timer = new Timer();
timer.schedule(new TimerTask() {
@Override
public void run() {
Point point =  java.awt.MouseInfo.getPointerInfo().getLocation();
// System.out.println("Location:x="   point.x   ", y="  
// point.y);
info_frame.value_x.setText("" + point.x);
info_frame.value_y.setText(""+point.y);
}
}, 100, 100);
} catch (Exception e) {
e.printStackTrace();
}
}
/**
* Create the dialog.
*/
public MouseInfo() {
setTitle("\u6e38\u6a19\u5ea7\u6a19");
setBounds(500, 300, 250, 180);
getContentPane().setLayout(new BorderLayout());
contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
getContentPane().add(contentPanel, BorderLayout.CENTER);
contentPanel.setLayout(null);
JLabel lblx = new JLabel("\u5ea7\u6a19 x:");
lblx.setFont(new Font("宋體", Font.PLAIN, 20));
lblx.setBounds(22, 27, 66, 31);
contentPanel.add(lblx);
JLabel lbly = new JLabel("\u5ea7\u6a19 y:");
lbly.setFont(new Font("宋體", Font.PLAIN, 20));
lbly.setBounds(22, 68, 66, 31);
contentPanel.add(lbly);
value_x = new JLabel("0");
value_x.setForeground(Color.BLUE);
value_x.setFont(new Font("宋體", Font.PLAIN, 20));
value_x.setBounds(82, 27, 66, 31);
contentPanel.add(value_x);
value_y = new JLabel("0");
value_y.setForeground(Color.BLUE);
value_y.setFont(new Font("宋體", Font.PLAIN, 20));
value_y.setBounds(82, 68, 66, 31);
contentPanel.add(value_y);
}
}
