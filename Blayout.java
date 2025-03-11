import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Blayout{

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);

		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();

		panel1.setBackground(Color.green);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.magenta);


        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(50,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(50,100));
        

      ///----------------------------------------this is sub pannel------------------////

        JPanel panel6=new JPanel();
		JPanel panel7=new JPanel();
		JPanel panel8=new JPanel();
		JPanel panel9=new JPanel();
		JPanel panel10=new JPanel();

		panel6.setBackground(Color.white);
        panel7.setBackground(Color.gray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.yellow);
        panel10.setBackground(Color.white);


        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel4.setLayout(new BorderLayout());
        panel4.add(panel6,BorderLayout.NORTH);
        panel4.add(panel7,BorderLayout.WEST);
        panel4.add(panel8,BorderLayout.EAST);
        panel4.add(panel9,BorderLayout.CENTER);
        panel4.add(panel10,BorderLayout.SOUTH);
        

        /////--------------------------sub pannel-------------------------------////

         frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.EAST);
         frame.add(panel4,BorderLayout.CENTER);
         frame.add(panel5,BorderLayout.WEST);

     

	}
}