package View_Control;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.text.JTextComponent;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class GraphingCalculatorAJ extends JFrame {
    public JTextField TBar = new JTextField();
    public static JTextField JBar = new JTextField();
    public static String input = new String();
    ArrayList<util.Point> Cords = new ArrayList<util.Point>();
    /*char[] x;
    char[] y;
*/
    //char[][] point = new char[][] {double x, OPERATOR, double y};

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                GraphingCalculatorAJ frame = new GraphingCalculatorAJ();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public GraphingCalculatorAJ() {


        getContentPane().setBackground(new Color(175, 238, 238));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 418, 315);
        getContentPane().setLayout(null);


        TBar.setText("");
        TBar.setForeground(Color.BLACK);
        TBar.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
        TBar.setHorizontalAlignment(SwingConstants.RIGHT);
        TBar.setBounds(18, 6, 377, 67);
        getContentPane().add(TBar);

        JBar.setText("");
        JBar.setForeground(Color.BLACK);
        JBar.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
        JBar.setHorizontalAlignment(SwingConstants.RIGHT);
        JBar.setBounds(18, 166, 377, 67);
        getContentPane().add(JBar);


        JButton GCalculate = new JButton("Calculate");
        GCalculate.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        GCalculate.setOpaque(true);
        GCalculate.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                GCalculate.setBackground(Color.WHITE);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                GCalculate.setBackground(new Color(236, 120, 20));

            }
        });

        GCalculate.addActionListener(e -> {

            input = TBar.getText();

            //   Convert(input);
            getPoints();
        });
        GCalculate.setBounds(35, 86, 75, 40);
        getContentPane().add(GCalculate);


    }

    public void getPoints() {
        for (double x = 0; x < 1; x = x + 1) {
            double y = 0;
            util.Point nextPoint = new util.Point(x, y);
            Cords.add(nextPoint);


        }


    }

    /*public static void Convert(String in) {
in.replaceAll("*"," MULTIPLY ");
        in.replaceAll("/"," DIVIDE ");
        in.replaceAll("^"," EXPONENT ");


    }
    */

}

