import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GUI {

	private JFrame frame;
	private JTextField numSides;
	private JTextField numDie;
	private JTextField numRolls;
	private List<Dice> dice_container = new ArrayList<Dice>();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Dice Rolling Simulation (by Kev)");
		frame.setBounds(100, 100, 560, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblFeltImage = new JLabel("");
		lblFeltImage.setBounds(8, 30, 350, 200);
		lblFeltImage.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\felt_table.png"));
		
		JLabel lblDieRollingSimulation = new JLabel("Die Rolling Simulation");
		lblDieRollingSimulation.setBounds(35, 2, 313, 29);
		lblDieRollingSimulation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		
		JLabel lblProbabilitiesChart = new JLabel("Probabilities Chart");
		lblProbabilitiesChart.setBounds(160, 240, 203, 21);
		lblProbabilitiesChart.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblDieSides = new JLabel("Number of sides");
		lblDieSides.setBounds(362, 25, 112, 26);
		lblDieSides.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblDieNum = new JLabel("Number of die");
		lblDieNum.setBounds(362, 65, 98, 26);
		lblDieNum.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblRollNum = new JLabel("Number of rolls");
		lblRollNum.setBounds(362, 105, 106, 26);
		lblRollNum.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JSlider SpeedSlider = new JSlider();
		SpeedSlider.setMinimum(1);
		SpeedSlider.setBounds(362, 160, 178, 23);
		
		JLabel lblSpeed = new JLabel("Simulation Speed");
		lblSpeed.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblSpeed.setBounds(386, 145, 125, 14);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDiceImage0 = new JLabel("");
		lblDiceImage0.setBounds(55, 73, 40, 40);
		frame.getContentPane().add(lblDiceImage0);
		
		JLabel lblDiceImage1 = new JLabel("");
		lblDiceImage1.setBounds(125, 73, 40, 40);
		frame.getContentPane().add(lblDiceImage1);
		
		JLabel lblDiceImage2 = new JLabel("");
		lblDiceImage2.setBounds(195, 73, 40, 40);
		frame.getContentPane().add(lblDiceImage2);
		
		JLabel lblDiceImage3 = new JLabel("");
		lblDiceImage3.setBounds(265, 73, 40, 40);
		frame.getContentPane().add(lblDiceImage3);
		
		JLabel lblDiceImage4 = new JLabel("");
		lblDiceImage4.setBounds(55, 128, 40, 40);
		frame.getContentPane().add(lblDiceImage4);
		
		JLabel lblDiceImage5 = new JLabel("");
		lblDiceImage5.setBounds(125, 128, 40, 40);
		frame.getContentPane().add(lblDiceImage5);
		
		JLabel lblDiceImage6 = new JLabel("");
		lblDiceImage6.setBounds(195, 128, 40, 40);
		frame.getContentPane().add(lblDiceImage6);
		
		JLabel lblDiceImage7 = new JLabel("");
		lblDiceImage7.setBounds(265, 128, 40, 40);
		frame.getContentPane().add(lblDiceImage7);
		frame.getContentPane().add(lblFeltImage);
		frame.getContentPane().add(lblDieRollingSimulation);
		frame.getContentPane().add(lblSpeed);
		frame.getContentPane().add(SpeedSlider);
		frame.getContentPane().add(lblDieSides);
		frame.getContentPane().add(lblDieNum);
		frame.getContentPane().add(lblRollNum);
		frame.getContentPane().add(lblProbabilitiesChart);
		
		JButton btnRoll = new JButton("ROLL");
		btnRoll.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnRoll.setBounds(364, 185, 172, 44);
		frame.getContentPane().add(btnRoll);
		
		numSides = new JTextField();
		numSides.setBounds(480, 29, 50, 20);
		frame.getContentPane().add(numSides);
		numSides.setColumns(10);
		
		numDie = new JTextField();
		numDie.setColumns(10);
		numDie.setBounds(480, 69, 50, 20);
		frame.getContentPane().add(numDie);
		
		numRolls = new JTextField();
		numRolls.setColumns(10);
		numRolls.setBounds(480, 109, 50, 20);
		frame.getContentPane().add(numRolls);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 265, 333, 56);
		frame.getContentPane().add(scrollPane);
		
		/*table = new JTable();
		table.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);*/

		
		
		
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i < Integer.parseInt(numDie.getText()); i++){
					dice_container.add(new Dice(Integer.parseInt(numSides.getText())));
				}
				//Create an array that will store all possible resulting values to use as columns in JTable.. 1*num_dice - 6*num_dice
				int lower_limit = Integer.parseInt(numDie.getText());
				int upper_limit = lower_limit * Integer.parseInt(numSides.getText());
				Object[] columns = new Object[1+ upper_limit - lower_limit];
				Object[][] rows = new Object[1][1 + upper_limit - lower_limit];
				rows[0][1] = "test1";
				rows[0][2] = "test2";
				rows[0][3] = "test3";
				for(int i = 0; i < columns.length; i++){
					columns[i] = String.valueOf(lower_limit+i);
				}
				for(int i=0; i < Integer.parseInt(numRolls.getText()); i++){
					System.out.print("Roll " + i +": ");
					int total_value = 0;
					for(int j = 0; j < dice_container.size(); j++){
						Dice cur_dice = dice_container.get(j);
						Dice.rollDie(cur_dice);
						total_value += cur_dice.value;
						if(j+1 == dice_container.size()){
							System.out.println(cur_dice.value);
						} else {
							System.out.print(cur_dice.value +", ");
						}
						switch (j) {
						case 0:
							lblDiceImage0.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\d"
													+cur_dice.value+".png"));
							break;
						case 1:
							lblDiceImage1.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\d"
									+cur_dice.value+".png"));
							break;
						case 2:
							lblDiceImage2.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\d"
									+cur_dice.value+".png"));
							break;
						case 3:
							lblDiceImage3.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\d"
									+cur_dice.value+".png"));
							break;
						case 4:
							lblDiceImage4.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\d"
									+cur_dice.value+".png"));
							break;
						case 5:
							lblDiceImage5.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\d"
									+cur_dice.value+".png"));
							break;
						case 6:
							lblDiceImage6.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\d"
									+cur_dice.value+".png"));
							break;
						case 7:
							lblDiceImage7.setIcon(new ImageIcon("C:\\Users\\Kevin\\workspace\\Dice_Simulation\\img\\d"
									+cur_dice.value+".png"));
							break;
						}
					}
					//Add time breaks based on speed scale
					try {
						Thread.sleep(2000 - SpeedSlider.getValue()*18);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(columns[3]);
				JTable table = new JTable(rows, columns);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			    JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(86, 265, 333, 56);
				frame.getContentPane().add(scrollPane);
				System.out.println("columns:" + table.getColumnCount());
				System.out.println("rows:" + table.getRowCount());
				dice_container.clear();
				
			}
		});
		
		
		
	}
}
