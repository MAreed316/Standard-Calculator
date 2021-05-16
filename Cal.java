
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;


public class Cal {
	
	double firstnum;
	double secondnum;
	double result;
	String operations;

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		public Cal() {
			initialize();
		}

		private void initialize() {
			
			frmStandardCalculator = new JFrame();
			frmStandardCalculator.setForeground(Color.GRAY);
			frmStandardCalculator.setBackground(Color.BLACK);
			frmStandardCalculator.setResizable(false);
			frmStandardCalculator.setTitle("Standard Calculator");
			frmStandardCalculator.setBounds(100, 100, 327, 350);
			frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			frmStandardCalculator.getContentPane().setLayout(null);
			
			txtDisplay = new JTextField();
			txtDisplay.setBackground(Color.LIGHT_GRAY);
			txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
			txtDisplay.setBounds(10, 11, 292, 40);
			frmStandardCalculator.getContentPane().add(txtDisplay);
			txtDisplay.setColumns(10);
		

		///////////////*********ROW_1*********
		
		JButton btnbspc = new JButton("<--");
		btnbspc.setBackground(Color.LIGHT_GRAY);
		btnbspc.setForeground(Color.BLACK);
		btnbspc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String btnbspc = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() -1);
					btnbspc = strB.toString();
					txtDisplay.setText(btnbspc);
				}
					
			}
		});
		btnbspc.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnbspc.setBounds(10, 65, 110, 40);
		frmStandardCalculator.getContentPane().add(btnbspc);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.LIGHT_GRAY);
		btnC.setForeground(Color.BLACK);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnC.setBounds(130, 65, 52, 40);
		frmStandardCalculator.getContentPane().add(btnC);
		
		JButton BtnAdd = new JButton("+");
		BtnAdd.setBackground(Color.LIGHT_GRAY);
		BtnAdd.setForeground(Color.BLACK);
		BtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		BtnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		BtnAdd.setBounds(190, 65, 52, 40);
		frmStandardCalculator.getContentPane().add(BtnAdd);
		
		JButton btnper = new JButton("%");
		btnper.setBackground(Color.LIGHT_GRAY);
		btnper.setForeground(Color.BLACK);
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnper.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnper.setBounds(250, 65, 52, 40);
		frmStandardCalculator.getContentPane().add(btnper);
		
		
		//Row 1 End----------------------------
		
		///////////////*********ROW_2*********
		
		JButton Btn7 = new JButton("7");
		Btn7.setBackground(Color.LIGHT_GRAY);
		Btn7.setForeground(Color.BLACK);
		Btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		Btn7.setBounds(10, 115, 52, 40);
		frmStandardCalculator.getContentPane().add(Btn7);
		
		JButton Btn8 = new JButton("8");
		Btn8.setBackground(Color.LIGHT_GRAY);
		Btn8.setForeground(Color.BLACK);
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+Btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		Btn8.setBounds(70, 115, 52, 40);
		frmStandardCalculator.getContentPane().add(Btn8);
		
		JButton Btn9 = new JButton("9");
		Btn9.setBackground(Color.LIGHT_GRAY);
		Btn9.setForeground(Color.BLACK);
		Btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		Btn9.setBounds(130, 115, 52, 40);
		frmStandardCalculator.getContentPane().add(Btn9);
		
		JButton BtnSub = new JButton("-");
		BtnSub.setBackground(Color.LIGHT_GRAY);
		BtnSub.setForeground(Color.BLACK);
		BtnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		BtnSub.setFont(new Font("Tahoma", Font.BOLD, 16));
		BtnSub.setBounds(190, 115, 52, 40);
		frmStandardCalculator.getContentPane().add(BtnSub);
		
	    JButton btnunrt = new JButton("\u221A");
	    btnunrt.setBackground(Color.LIGHT_GRAY);
	    btnunrt.setForeground(Color.BLACK);
	    btnunrt.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
	    		ops = Math.sqrt(ops);
	    		txtDisplay.setText(String.valueOf(ops));
	    	}
	    });
	    btnunrt.setFont(new Font("Tahoma", Font.BOLD, 16));
	    btnunrt.setBounds(250, 115, 52, 40);
	    frmStandardCalculator.getContentPane().add(btnunrt);
						
					//Row 2 end----------------------
					
		///////////////*********ROW_3*********
	    JButton Btn4 = new JButton("4");
	    Btn4.setBackground(Color.LIGHT_GRAY);
	    Btn4.setForeground(Color.BLACK);
	    Btn4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) 
	    	{
	    		String EnterNumber = txtDisplay.getText()+Btn4.getText();
	    		txtDisplay.setText(EnterNumber);
	    	}
	    });
	    Btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
	    Btn4.setBounds(10, 165, 52, 40);
	    frmStandardCalculator.getContentPane().add(Btn4);
	    
	    JButton Btn5 = new JButton("5");
	    Btn5.setBackground(Color.LIGHT_GRAY);
	    Btn5.setForeground(Color.BLACK);
	    Btn5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		String EnterNumber = txtDisplay.getText()+Btn5.getText();
	    		txtDisplay.setText(EnterNumber);
	    	}
	    });
	    Btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
	    Btn5.setBounds(70, 165, 52, 40);
	    frmStandardCalculator.getContentPane().add(Btn5);
	    
	    JButton Btn6 = new JButton("6");
	    Btn6.setBackground(Color.LIGHT_GRAY);
	    Btn6.setForeground(Color.BLACK);
	    Btn6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) 
	    	{
	    		String EnterNumber = txtDisplay.getText()+Btn6.getText();
	    		txtDisplay.setText(EnterNumber);
	    	}
	    });
	    Btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
	    Btn6.setBounds(130, 165, 52, 40);
	    frmStandardCalculator.getContentPane().add(Btn6);
	    
	    JButton BtnMul = new JButton("*");
	    BtnMul.setBackground(Color.LIGHT_GRAY);
	    BtnMul.setForeground(Color.BLACK);
	    BtnMul.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		firstnum=Double.parseDouble(txtDisplay.getText());
	    		txtDisplay.setText("");
	    		operations="*";
	    	}
	    });
	    BtnMul.setFont(new Font("Tahoma", Font.BOLD, 16));
	    BtnMul.setBounds(190, 165, 52, 40);
	    frmStandardCalculator.getContentPane().add(BtnMul);
	    
	    JButton btn1x = new JButton(" 1/x");
	    btn1x.setBackground(Color.LIGHT_GRAY);
	    btn1x.setForeground(Color.BLACK);
	    btn1x.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
	    		ops = 1 / ops;
	    		txtDisplay.setText(String.valueOf(ops));
	    	}
	    });
	    btn1x.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btn1x.setBounds(250, 165, 52, 40);
	    frmStandardCalculator.getContentPane().add(btn1x);
	    //Row 3 end -----------------
	    
			///////////////*********ROW_4*********
	    JButton Btn1 = new JButton("1");
	    Btn1.setBackground(Color.LIGHT_GRAY);
	    Btn1.setForeground(Color.BLACK);
	    Btn1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) 
	    	{
	    		String EnterNumber = txtDisplay.getText()+Btn1.getText();
	    		txtDisplay.setText(EnterNumber);
	    	}
	    });
	    Btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
	    Btn1.setBounds(10, 215, 52, 40);
	    frmStandardCalculator.getContentPane().add(Btn1);
	    
	    JButton Btn2 = new JButton("2");
	    Btn2.setBackground(Color.LIGHT_GRAY);
	    Btn2.setForeground(Color.BLACK);
	    Btn2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		String EnterNumber = txtDisplay.getText()+Btn2.getText();
	    		txtDisplay.setText(EnterNumber);
	    	}
	    });
	    Btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
	    Btn2.setBounds(70, 215, 52, 40);
	    frmStandardCalculator.getContentPane().add(Btn2);
	    
	    JButton Btn3 = new JButton("3");
	    Btn3.setBackground(Color.LIGHT_GRAY);
	    Btn3.setForeground(Color.BLACK);
	    Btn3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) 
						{
							String EnterNumber = txtDisplay.getText()+Btn3.getText();
							txtDisplay.setText(EnterNumber);
						}
					});
					Btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
					Btn3.setBounds(130, 215, 52, 40);
					frmStandardCalculator.getContentPane().add(Btn3);

					JButton BtnDiv = new JButton("/");
					BtnDiv.setBackground(Color.LIGHT_GRAY);
					BtnDiv.setForeground(Color.BLACK);
					BtnDiv.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							firstnum=Double.parseDouble(txtDisplay.getText());
							txtDisplay.setText("");
							operations="/";
						}
					});
					BtnDiv.setFont(new Font("Tahoma", Font.BOLD, 16));
					BtnDiv.setBounds(190, 215, 52, 40);
					frmStandardCalculator.getContentPane().add(BtnDiv);
				
				//Row 4 end-------------------
					
		///////////////*********ROW_5*********
					JButton Btn0 = new JButton("0");
					Btn0.setBackground(Color.LIGHT_GRAY);
					Btn0.setForeground(Color.BLACK);
					Btn0.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) 
						{
							String EnterNumber = txtDisplay.getText()+Btn0.getText();
							txtDisplay.setText(EnterNumber);
						}
					});
					Btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
					Btn0.setBounds(70, 265, 52, 40);
					frmStandardCalculator.getContentPane().add(Btn0);

					JButton BtnDot = new JButton(".");
					BtnDot.setBackground(Color.LIGHT_GRAY);
					BtnDot.setForeground(Color.BLACK);
					BtnDot.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							firstnum=Double.parseDouble(txtDisplay.getText());
							txtDisplay.setText("");
							operations=".";
						}
					});
					BtnDot.setFont(new Font("Tahoma", Font.BOLD, 19));
					BtnDot.setBounds(130, 265, 52, 40);
					frmStandardCalculator.getContentPane().add(BtnDot);
					
					
					JButton btnCE = new JButton("CE");
					btnCE.setBackground(Color.LIGHT_GRAY);
					btnCE.setForeground(Color.BLACK);
					btnCE.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							txtDisplay.setText(null);
						}
					});
					btnCE.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
					btnCE.setBounds(10, 265, 52, 40);
					frmStandardCalculator.getContentPane().add(btnCE);
					
					JButton btneql = new JButton("=");
					btneql.setBackground(Color.LIGHT_GRAY);
					btneql.setForeground(Color.BLACK);
					btneql.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) 
						{
							String answer;
							secondnum=Double.parseDouble(txtDisplay.getText());
							if(operations=="+")
							{
								result=firstnum+secondnum;
								answer=String.format("%.2f", result);
								txtDisplay.setText(answer);
							}
							else if(operations=="-")
							{
								result=firstnum-secondnum;
								answer=String.format("%.2f", result);
								txtDisplay.setText(answer);
							}
							else if(operations=="*")
							{
								result=firstnum*secondnum;
								answer=String.format("%.2f", result);
								txtDisplay.setText(answer);
							}
							else if(operations=="/")
							{
								result=firstnum/secondnum;
								answer=String.format("%.2f", result);
								txtDisplay.setText(answer);
							}
							
							else
							{
								txtDisplay.setText("WRONG INPUT");
							}
						}
					});
					btneql.setFont(new Font("Tahoma", Font.PLAIN, 18));
					btneql.setBounds(250, 215, 52, 92);
					frmStandardCalculator.getContentPane().add(btneql);
					
					JButton btnaddsub = new JButton("\u00B1");
					btnaddsub.setBackground(Color.LIGHT_GRAY);
					btnaddsub.setForeground(Color.BLACK);
					btnaddsub.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
							ops = ops* (-1);
							txtDisplay.setText(String.valueOf(ops));
						}
					});
					btnaddsub.setFont(new Font("Tahoma", Font.BOLD, 16));
					btnaddsub.setBounds(190, 265, 52, 40);
					frmStandardCalculator.getContentPane().add(btnaddsub);
					
					
		//***************************************Standard Calculator**********************************************
		JMenuItem mistn = new JMenuItem("Standard");
		mistn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 320, 380);
				txtDisplay.setBounds(10, 11, 290, 40);
			}
		});
		
	}
}
