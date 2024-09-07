package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

import controller.listenerGameTicTacToe;
import model.modelGameTicTacToe;

public class view_game extends JFrame{
	public modelGameTicTacToe model;
	private JLabel title_jlabel;
	private JPanel main_jpanel;
	private JLabel main_jlabel;
	
	private JButton play_button;
	private JButton Setting_button;
	private listenerGameTicTacToe ltt;
	
	
	private Font font;
	private JPanel setting_jpanel;
	private JButton setting_back_button;
	private JLabel setting_jlabel;
	
	private JLabel setting_level_jlabel;
	
	private JRadioButton setting_easy;
	private JRadioButton setting_difficult;
	
	
	private ButtonGroup bg;
	private JPanel gameplay_jpanel;
	private JButton gameplay_back_button;
	private JLabel gameplay_jlabel;
	private JLabel gameplay_jlabel_value_level;
	private JButton gameplay_reset_button;
	public JButton gameplay_continue_button;
	public JLabel gameplay_jlable_mark_X;
	public JLabel gameplay_jlable_mark_O;
	private JButton gameplay_button_1;
	private JButton gameplay_button_2;
	private JButton gameplay_button_3;
	private JButton gameplay_button_5;
	private JButton gameplay_button_9;
	private JButton gameplay_button_8;
	private JButton gameplay_button_4;
	private JButton gameplay_button_6;
	private JButton gameplay_button_7;
	private JButton gameplay_button_1_x;
	private JButton gameplay_button_2_x;
	private JButton gameplay_button_3_x;
	private JButton gameplay_button_4_x;
	private JButton gameplay_button_5_x;
	private JButton gameplay_button_6_x;
	private JButton gameplay_button_7_x;
	private JButton gameplay_button_8_x;
	private JButton gameplay_button_9_x;
	private JButton gameplay_button_1_o;
	private JButton gameplay_button_2_o;
	private JButton gameplay_button_3_o;
	private JButton gameplay_button_4_o;
	private JButton gameplay_button_5_o;
	private JButton gameplay_button_6_o;
	private JButton gameplay_button_7_o;
	private JButton gameplay_button_8_o;
	private JButton gameplay_button_9_o;
	public JLabel gameplay_jlabel_result;
	private JLabel setting_go_first_jlabel;
	private JButton play_now_button;
	private JRadioButton setting_computer_jradiobutton;
	private JRadioButton setting_player_jradiobutton;
	private ButtonGroup gf;
	private JLabel game_play_jlabel_go_first;
	public JLabel timer_jlabel;
	
	public JLabel colA;
	public JLabel colB;
	public JLabel colC;
	public JLabel row1;
	public JLabel row2;
	public JLabel row3;

	public int second=60;

	public javax.swing.Timer countTime;
	
	public boolean end=false;
	
	public view_game() {
		model = new modelGameTicTacToe();
		this.init();
		time();
	}
	public void init() {
		ltt = new listenerGameTicTacToe(this);
		this.setTitle("Tic Tac Toe");
		Image img = Toolkit.getDefaultToolkit().createImage("title.png");
		this.setIconImage(img);
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		font = new Font("Ariel",Font.BOLD,20);
		this.setLayout(null);
		this.setResizable(false);
		
		title_jlabel= new JLabel();
		title_jlabel.setText("Tic Tac Toe");
		title_jlabel.setForeground(Color.white);
		title_jlabel.setBounds(100, 20, 400, 70);
		title_jlabel.setFont(new Font("Arial",font.BOLD,50));
		

		
		
		setting_jpanel = new JPanel();
		setting_jpanel.setSize(500,600);
		setting_jpanel.setLayout(null);
		setting_back_button = new JButton("Back");
		setting_back_button.addActionListener(ltt);
		setting_jlabel = new JLabel();
		
		gameplay_jpanel = new JPanel();
		gameplay_jpanel.setSize(500,600);
		gameplay_jpanel.setLayout(null);
		gameplay_continue_button=new JButton("Continue");
		gameplay_continue_button.addActionListener(ltt);
		gameplay_jlable_mark_X=new JLabel();
		gameplay_jlable_mark_O=new JLabel();
		gameplay_back_button = new JButton("Back");
		gameplay_back_button.addActionListener(ltt);
		gameplay_jlabel = new JLabel();
		gameplay_jlabel_value_level = new JLabel();
		gameplay_jlabel_value_level.setForeground(Color.CYAN);
		game_play_jlabel_go_first = new JLabel();
		gameplay_reset_button = new JButton("Reset");
		gameplay_reset_button.addActionListener(ltt);
		gameplay_button_1 = new JButton("o1");
		gameplay_button_1.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_1.addActionListener(ltt);
		gameplay_button_2 = new JButton("o2");
		gameplay_button_2.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_2.addActionListener(ltt);
		gameplay_button_3 = new JButton("o3");
		gameplay_button_3.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_3.addActionListener(ltt);
		gameplay_button_4 = new JButton("o4");
		gameplay_button_4.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_4.addActionListener(ltt);
		gameplay_button_5 = new JButton("o5");
		gameplay_button_5.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_5.addActionListener(ltt);
		gameplay_button_6 = new JButton("o6");
		gameplay_button_6.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_6.addActionListener(ltt);
		gameplay_button_7 = new JButton("o7");
		gameplay_button_7.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_7.addActionListener(ltt);
		gameplay_button_8 = new JButton("o8");
		gameplay_button_8.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_8.addActionListener(ltt);
		gameplay_button_9 = new JButton("o9");
		gameplay_button_9.setFont(new Font("Arial",Font.BOLD,0));
		gameplay_button_9.addActionListener(ltt);
		gameplay_button_1_x = new JButton("X");
		gameplay_button_1_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_1_x.addActionListener(ltt);
		gameplay_button_1_x.setForeground(Color.blue);
		gameplay_button_2_x = new JButton("X");
		gameplay_button_2_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_2_x.addActionListener(ltt);
		gameplay_button_2_x.setForeground(Color.blue);
		gameplay_button_3_x = new JButton("X");
		gameplay_button_3_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_3_x.addActionListener(ltt);
		gameplay_button_3_x.setForeground(Color.blue);
		gameplay_button_4_x = new JButton("X");
		gameplay_button_4_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_4_x.addActionListener(ltt);
		gameplay_button_4_x.setForeground(Color.blue);
		gameplay_button_5_x = new JButton("X");
		gameplay_button_5_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_5_x.addActionListener(ltt);
		gameplay_button_5_x.setForeground(Color.blue);
		gameplay_button_6_x = new JButton("X");
		gameplay_button_6_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_6_x.addActionListener(ltt);
		gameplay_button_6_x.setForeground(Color.blue);
		gameplay_button_7_x = new JButton("X");
		gameplay_button_7_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_7_x.addActionListener(ltt);
		gameplay_button_7_x.setForeground(Color.blue);
		gameplay_button_8_x = new JButton("X");
		gameplay_button_8_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_8_x.addActionListener(ltt);
		gameplay_button_8_x.setForeground(Color.blue);
		gameplay_button_9_x = new JButton("X");
		gameplay_button_9_x.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_9_x.setForeground(Color.blue);
		gameplay_button_9_x.addActionListener(ltt);
		gameplay_button_1_o = new JButton("O");
		gameplay_button_1_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_1_o.setForeground(Color.red);
		gameplay_button_1_o.addActionListener(ltt);
		gameplay_button_2_o = new JButton("O");
		gameplay_button_2_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_2_o.addActionListener(ltt);
		gameplay_button_2_o.setForeground(Color.red);
		gameplay_button_3_o = new JButton("O");
		gameplay_button_3_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_3_o.addActionListener(ltt);
		gameplay_button_3_o.setForeground(Color.red);
		gameplay_button_4_o = new JButton("O");
		gameplay_button_4_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_4_o.addActionListener(ltt);
		gameplay_button_4_o.setForeground(Color.red);
		gameplay_button_5_o = new JButton("O");
		gameplay_button_5_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_5_o.addActionListener(ltt);
		gameplay_button_5_o.setForeground(Color.red);
		gameplay_button_6_o = new JButton("O");
		gameplay_button_6_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_6_o.addActionListener(ltt);
		gameplay_button_6_o.setForeground(Color.red);
		gameplay_button_7_o = new JButton("O");
		gameplay_button_7_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_7_o.addActionListener(ltt);
		gameplay_button_7_o.setForeground(Color.red);
		gameplay_button_8_o = new JButton("O");
		gameplay_button_8_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_8_o.addActionListener(ltt);
		gameplay_button_8_o.setForeground(Color.red);
		gameplay_button_9_o = new JButton("O");
		gameplay_button_9_o.setFont(new Font("Arial",Font.BOLD,100));
		gameplay_button_9_o.addActionListener(ltt);
		gameplay_button_9_o.setForeground(Color.red);
		gameplay_jlabel_result = new JLabel(" ");
		timer_jlabel = new JLabel();
		
		main_jpanel = new JPanel();
		main_jpanel.setLayout(null);
		main_jpanel.setSize(500,600);
		
		main_jlabel = new JLabel();
		main_jlabel.setBounds(0,0,500,600);
		main_jlabel.setIcon(new ImageIcon("background2.png"));
		
		
		play_button = new JButton("Player X Player");
		play_button.setForeground(Color.BLACK);
		play_button.setBackground(Color.CYAN);
		play_button.setBounds(130,250,220,50);
		play_button.setFont(font);
		play_button.addActionListener(ltt);
		Setting_button = new JButton("Player X Computer");
		Setting_button.setForeground(Color.BLACK);
		Setting_button.setBackground(Color.CYAN);
		Setting_button.setBounds(130,312,220,50);
		Setting_button.setFont(font);
		Setting_button.addActionListener(ltt);
		setting_easy = new JRadioButton("Easy");
		setting_difficult = new JRadioButton("Difficult");
		
		setting_computer_jradiobutton = new JRadioButton("Computer");
		
		setting_player_jradiobutton = new JRadioButton("Player");
		setting_computer_jradiobutton.addActionListener(ltt);
		setting_player_jradiobutton.addActionListener(ltt);
		setting_easy.addActionListener(ltt);
		setting_difficult.addActionListener(ltt);
		
		gf = new ButtonGroup();
		gf.add(setting_computer_jradiobutton);
		gf.add(setting_player_jradiobutton);
		
		model.setGo_first_value(1);
		bg = new ButtonGroup();
		bg.add(setting_easy);
		bg.add(setting_difficult);
		
		this.model.setLevel_value(2);
		
		main_jpanel.add(play_button);
		main_jpanel.add(Setting_button);
		main_jpanel.add(title_jlabel);
		main_jpanel.add(main_jlabel);
		
		this.add(main_jpanel);
		
		this.setVisible(true);
	}
	
	public void main_monitor() {
		setting_jpanel.setVisible(false);
		gameplay_jpanel.setVisible(false);
		main_jpanel.setVisible(true);
		
	}
	public void setting_monitor() {
		setting_easy.setSelected(true);
		setting_player_jradiobutton.setSelected(true);
		model.setLevel_value(0);
		model.setGo_first_value(1);
		main_jpanel.setVisible(false);
		setting_jpanel.setVisible(true);
		
		setting_jlabel.setBounds(0,0,500,600);
		setting_jlabel.setIcon(new ImageIcon("background2.png"));
		
		play_now_button = new JButton("Play Now");
		play_now_button.setForeground(Color.BLACK);
		play_now_button.setBackground(Color.CYAN);
		play_now_button.setBounds(170,450,130,50);
		play_now_button.setFont(font);
		play_now_button.addActionListener(ltt);
		
		setting_back_button.setBounds(370,500,100,30);
		setting_back_button.setBackground(Color.cyan);
		setting_back_button.setFont(font);
		
		setting_go_first_jlabel = new JLabel("Go First :");
		setting_go_first_jlabel.setFont(new Font("Arial",Font.BOLD,38));
		setting_go_first_jlabel.setBounds(20,290,200,100);
		setting_go_first_jlabel.setForeground(Color.red);
		
		setting_level_jlabel = new JLabel("Level :");
		setting_level_jlabel.setFont(new Font("Arial",Font.BOLD,40));
		setting_level_jlabel.setBounds(20,230,200,100);
		setting_level_jlabel.setForeground(Color.red);

		setting_easy.setBounds(200,265,60,40);
		setting_computer_jradiobutton.setBounds(200,320,100,40);
		setting_player_jradiobutton.setBounds(320,320,80,40);
		setting_difficult.setBounds(320,265,80,40);
		setting_easy.setFont(new Font("Arial",Font.BOLD,15));
		setting_computer_jradiobutton.setFont(new Font("Arial",Font.BOLD,15));
		setting_player_jradiobutton.setFont(new Font("Arial",Font.BOLD,15));
		setting_difficult.setFont(new Font("Arial",Font.BOLD,15));
		setting_easy.setBackground(Color.decode("#DFF24B"));
		setting_computer_jradiobutton.setBackground(Color.decode("#DFF24B"));
		setting_player_jradiobutton.setBackground(Color.decode("#DFF24B"));
		setting_difficult.setBackground(Color.decode("#DFF24B"));
		
		setting_jpanel.add(setting_computer_jradiobutton);
		setting_jpanel.add(setting_player_jradiobutton);
		setting_jpanel.add(setting_go_first_jlabel);
		setting_jpanel.add(setting_easy);
		setting_jpanel.add(setting_difficult);
		
		setting_jpanel.add(play_now_button);
		
		setting_jpanel.add(setting_level_jlabel);
		setting_jpanel.add(setting_back_button);
		setting_jpanel.add(setting_jlabel);
		
		
		this.add(setting_jpanel);
		
	}
	public void enable_matrix(int check) {
		if (check==1) {
			gameplay_button_1.setEnabled(true);
			gameplay_button_2.setEnabled(true);
			gameplay_button_3.setEnabled(true);
			gameplay_button_4.setEnabled(true);
			gameplay_button_5.setEnabled(true);
			gameplay_button_6.setEnabled(true);
			gameplay_button_7.setEnabled(true);
			gameplay_button_8.setEnabled(true);
			gameplay_button_9.setEnabled(true);
			gameplay_button_1_x.setEnabled(true);
			gameplay_button_2_x.setEnabled(true);
			gameplay_button_3_x.setEnabled(true);
			gameplay_button_4_x.setEnabled(true);
			gameplay_button_5_x.setEnabled(true);
			gameplay_button_6_x.setEnabled(true);
			gameplay_button_7_x.setEnabled(true);
			gameplay_button_8_x.setEnabled(true);
			gameplay_button_9_x.setEnabled(true);
			gameplay_button_1_o.setEnabled(true);
			gameplay_button_2_o.setEnabled(true);
			gameplay_button_3_o.setEnabled(true);
			gameplay_button_4_o.setEnabled(true);
			gameplay_button_5_o.setEnabled(true);
			gameplay_button_6_o.setEnabled(true);
			gameplay_button_7_o.setEnabled(true);
			gameplay_button_8_o.setEnabled(true);
			gameplay_button_9_o.setEnabled(true);
		} else if (check==2) {
			gameplay_button_1.setEnabled(false);
			gameplay_button_2.setEnabled(false);
			gameplay_button_3.setEnabled(false);
			gameplay_button_4.setEnabled(false);
			gameplay_button_5.setEnabled(false);
			gameplay_button_6.setEnabled(false);
			gameplay_button_7.setEnabled(false);
			gameplay_button_8.setEnabled(false);
			gameplay_button_9.setEnabled(false);
			gameplay_button_1_x.setEnabled(false);
			gameplay_button_2_x.setEnabled(false);
			gameplay_button_3_x.setEnabled(false);
			gameplay_button_4_x.setEnabled(false);
			gameplay_button_5_x.setEnabled(false);
			gameplay_button_6_x.setEnabled(false);
			gameplay_button_7_x.setEnabled(false);
			gameplay_button_8_x.setEnabled(false);
			gameplay_button_9_x.setEnabled(false);
			gameplay_button_1_o.setEnabled(false);
			gameplay_button_2_o.setEnabled(false);
			gameplay_button_3_o.setEnabled(false);
			gameplay_button_4_o.setEnabled(false);
			gameplay_button_5_o.setEnabled(false);
			gameplay_button_6_o.setEnabled(false);
			gameplay_button_7_o.setEnabled(false);
			gameplay_button_8_o.setEnabled(false);
			gameplay_button_9_o.setEnabled(false);
		}
	}
	public void check_matrix() {
		if (end == false) {
			
		
		if (second==0) {
			if (model.getLevel_value()!=2) {
				countTime.stop();
				enable_matrix(2);
				gameplay_jlabel_result.setText("You close");
				gameplay_jlabel_result.setVisible(true);
				model.upMark_o();
				end = true;
			}else if (model.getLevel_value()==2) {
				
				if (model.getPlayer()==1) {
					countTime.stop();
					enable_matrix(2);
					gameplay_jlabel_result.setText("O Win");
					gameplay_jlabel_result.setVisible(true);
					model.upMark_o();
					end = true;
				}else if (model.getPlayer()==2) {
					countTime.stop();
					enable_matrix(2);
					gameplay_jlabel_result.setText("X Win");
					gameplay_jlabel_result.setVisible(true);
					model.upMark_x();
					end = true;
				}
			}
		} else if (second !=0) {
			
		if (model.getMatrix(0)==1 && model.getMatrix(1)==1 && model.getMatrix(2)==1) {
			model.upMark_o();
			enable_matrix(2);
			gameplay_jlabel_result.setText("O Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(3)==1 && model.getMatrix(4)==1 && model.getMatrix(5)==1) {
			model.upMark_o();
			enable_matrix(2);
			gameplay_jlabel_result.setText("O Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(6)==1 && model.getMatrix(7)==1 && model.getMatrix(8)==1) {
			model.upMark_o();
			enable_matrix(2);
			gameplay_jlabel_result.setText("O Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(0)==1 && model.getMatrix(3)==1 && model.getMatrix(6)==1) {
			model.upMark_o();
			enable_matrix(2);
			gameplay_jlabel_result.setText("O Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(1)==1 && model.getMatrix(4)==1 && model.getMatrix(7)==1) {
			model.upMark_o();
			enable_matrix(2);
			gameplay_jlabel_result.setText("O Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(2)==1 && model.getMatrix(5)==1 && model.getMatrix(8)==1) {
			model.upMark_o();
			enable_matrix(2);
			gameplay_jlabel_result.setText("O Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(0)==1 && model.getMatrix(4)==1 && model.getMatrix(8)==1) {
			model.upMark_o();
			enable_matrix(2);
			gameplay_jlabel_result.setText("O Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(2)==1 && model.getMatrix(4)==1 && model.getMatrix(6)==1) {
			model.upMark_o();
			enable_matrix(2);
			gameplay_jlabel_result.setText("O Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		//
		if (model.getMatrix(0)==2 && model.getMatrix(1)==2 && model.getMatrix(2)==2) {
			model.upMark_x();
			enable_matrix(2);
			gameplay_jlabel_result.setText("X Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(3)==2 && model.getMatrix(4)==2 && model.getMatrix(5)==2) {
			model.upMark_x();
			enable_matrix(2);
			gameplay_jlabel_result.setText("X Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(6)==2 && model.getMatrix(7)==2 && model.getMatrix(8)==2) {
			model.upMark_x();
			enable_matrix(2);
			gameplay_jlabel_result.setText("X Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(0)==2 && model.getMatrix(3)==2 && model.getMatrix(6)==2) {
			model.upMark_x();
			enable_matrix(2);
			gameplay_jlabel_result.setText("X Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(1)==2 && model.getMatrix(4)==2 && model.getMatrix(7)==2) {
			model.upMark_x();
			enable_matrix(2);
			gameplay_jlabel_result.setText("X Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(2)==2 && model.getMatrix(5)==2 && model.getMatrix(8)==2) {
			model.upMark_x();
			enable_matrix(2);
			gameplay_jlabel_result.setText("X Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(0)==2 && model.getMatrix(4)==2 && model.getMatrix(8)==2) {
			model.upMark_x();
			enable_matrix(2);
			gameplay_jlabel_result.setText("X Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else
		if (model.getMatrix(2)==2 && model.getMatrix(4)==2 && model.getMatrix(6)==2) {
			model.upMark_x();
			enable_matrix(2);
			gameplay_jlabel_result.setText("X Win");
			gameplay_jlabel_result.setVisible(true);
			countTime.stop();
			end = true;
		} else {
			if (model.check_matrixFull()==true) {
				enable_matrix(2);
				gameplay_jlabel_result.setText("Draw");
				gameplay_jlabel_result.setVisible(true);
				countTime.stop();
				end = true;
			}
		}
		}
		}
		gameplay_continue_button.setVisible(end);
	}
	public void show_matrix () {
		///
		if (model.getMatrix(0)==0) {
			gameplay_button_1.setVisible(true);
			gameplay_button_1_x.setVisible(false);
			gameplay_button_1_o.setVisible(false);
		} else if (model.getMatrix(0)==1) {
			gameplay_button_1.setVisible(false);
			gameplay_button_1_x.setVisible(false);
			gameplay_button_1_o.setVisible(true);
		} else if (model.getMatrix(0)==2) {
			gameplay_button_1.setVisible(false);
			gameplay_button_1_x.setVisible(true);
			gameplay_button_1_o.setVisible(false);
		}
		// 
		if (model.getMatrix(1)==0) {
			gameplay_button_2.setVisible(true);
			gameplay_button_2_x.setVisible(false);
			gameplay_button_2_o.setVisible(false);
		} else if (model.getMatrix(1)==1) {
			gameplay_button_2.setVisible(false);
			gameplay_button_2_x.setVisible(false);
			gameplay_button_2_o.setVisible(true);
		} else if (model.getMatrix(1)==2) {
			gameplay_button_2.setVisible(false);
			gameplay_button_2_x.setVisible(true);
			gameplay_button_2_o.setVisible(false);
		}
		// 
		if (model.getMatrix(2)==0) {
			gameplay_button_3.setVisible(true);
			gameplay_button_3_x.setVisible(false);
			gameplay_button_3_o.setVisible(false);
		} else if (model.getMatrix(2)==1) {
			gameplay_button_3.setVisible(false);
			gameplay_button_3_x.setVisible(false);
			gameplay_button_3_o.setVisible(true);
		} else if (model.getMatrix(2)==2) {
			gameplay_button_3.setVisible(false);
			gameplay_button_3_x.setVisible(true);
			gameplay_button_3_o.setVisible(false);
		}
		// 
		if (model.getMatrix(3)==0) {
			gameplay_button_4.setVisible(true);
			gameplay_button_4_x.setVisible(false);
			gameplay_button_4_o.setVisible(false);
		} else if (model.getMatrix(3)==1) {
			gameplay_button_4.setVisible(false);
			gameplay_button_4_x.setVisible(false);
			gameplay_button_4_o.setVisible(true);
		} else if (model.getMatrix(3)==2) {
			gameplay_button_4.setVisible(false);
			gameplay_button_4_x.setVisible(true);
			gameplay_button_4_o.setVisible(false);
		}
		//
		if (model.getMatrix(4)==0) {
			gameplay_button_5.setVisible(true);
			gameplay_button_5_x.setVisible(false);
			gameplay_button_5_o.setVisible(false);
		} else if (model.getMatrix(4)==1) {
			gameplay_button_5.setVisible(false);
			gameplay_button_5_x.setVisible(false);
			gameplay_button_5_o.setVisible(true);
		} else if (model.getMatrix(4)==2) {
			gameplay_button_5.setVisible(false);
			gameplay_button_5_x.setVisible(true);
			gameplay_button_5_o.setVisible(false);
		}
		/////////////// 1 2
		if (model.getMatrix(5)==0) {
			gameplay_button_6.setVisible(true);
			gameplay_button_6_x.setVisible(false);
			gameplay_button_6_o.setVisible(false);
		} else if (model.getMatrix(5)==1) {
			gameplay_button_6.setVisible(false);
			gameplay_button_6_x.setVisible(false);
			gameplay_button_6_o.setVisible(true);
		} else if (model.getMatrix(5)==2) {
			gameplay_button_6.setVisible(false);
			gameplay_button_6_x.setVisible(true);
			gameplay_button_6_o.setVisible(false);
		}
		//
		if (model.getMatrix(6)==0) {
			gameplay_button_7.setVisible(true);
			gameplay_button_7_x.setVisible(false);
			gameplay_button_7_o.setVisible(false);
		} else if (model.getMatrix(6)==1) {
			gameplay_button_7.setVisible(false);
			gameplay_button_7_x.setVisible(false);
			gameplay_button_7_o.setVisible(true);
		} else if (model.getMatrix(6)==2) {
			gameplay_button_7.setVisible(false);
			gameplay_button_7_x.setVisible(true);
			gameplay_button_7_o.setVisible(false);
		}
		//
		if (model.getMatrix(7)==0) {
			gameplay_button_8.setVisible(true);
			gameplay_button_8_x.setVisible(false);
			gameplay_button_8_o.setVisible(false);
		} else if (model.getMatrix(7)==1) {
			gameplay_button_8.setVisible(false);
			gameplay_button_8_x.setVisible(false);
			gameplay_button_8_o.setVisible(true);
		} else if (model.getMatrix(7)==2) {
			gameplay_button_8.setVisible(false);
			gameplay_button_8_x.setVisible(true);
			gameplay_button_8_o.setVisible(false);
		}
		//
		if (model.getMatrix(8)==0) {
			gameplay_button_9.setVisible(true);
			gameplay_button_9_x.setVisible(false);
			gameplay_button_9_o.setVisible(false);
		} else if (model.getMatrix(8)==1) {
			gameplay_button_9.setVisible(false);
			gameplay_button_9_x.setVisible(false);
			gameplay_button_9_o.setVisible(true);
		} else if (model.getMatrix(8)==2) {
			gameplay_button_9.setVisible(false);
			gameplay_button_9_x.setVisible(true);
			gameplay_button_9_o.setVisible(false);
		}
		//
		if (model.getLevel_value()==2) {
		if (model.getPlayer()==1)
			game_play_jlabel_go_first.setText("Luot cua X");
		else game_play_jlabel_go_first.setText("Luot cua O");
		}
		
	}
	public void go_line(int player,String str) {
		if (player==2) {
			if (str=="o1") {
				model.setMatrix(0, 1);
			} else if (str=="o2") {
				model.setMatrix(1, 1);
			} else if (str=="o3") {
				model.setMatrix(2, 1);
			} else if (str=="o4") {
				model.setMatrix(3, 1);
			} else if (str=="o5") {
				model.setMatrix(4, 1);
			} else if (str=="o6") {
				model.setMatrix(5, 1);
			} else if (str=="o7") {
				model.setMatrix(6, 1);
			} else if (str=="o8") {
				model.setMatrix(7, 1);
			} else if (str=="o9") {
				model.setMatrix(8, 1);
			}
		}
		else if (player==1) {
			if (str=="o1") {
				model.setMatrix(0, 2);
			} else if (str=="o2") {
				model.setMatrix(1, 2);
			} else if (str=="o3") {
				model.setMatrix(2, 2);
			} else if (str=="o4") {
				model.setMatrix(3, 2);
			} else if (str=="o5") {
				model.setMatrix(4, 2);
			} else if (str=="o6") {
				model.setMatrix(5, 2);
			} else if (str=="o7") {
				model.setMatrix(6, 2);
			} else if (str=="o8") {
				model.setMatrix(7, 2);
			} else if (str=="o9") {
				model.setMatrix(8, 2);
			}
		}
	}
	public void game_play_monitor() {
		setting_jpanel.setVisible(false);
		main_jpanel.setVisible(false);
		
		gameplay_jlabel.setIcon(new ImageIcon("background2.png"));
		
		gameplay_jpanel.setVisible(true);
		
		if (this.model.getLevel_value()==2) gameplay_jlabel_value_level.setText("Player mod"); 
		else if (this.model.getLevel_value()==0) gameplay_jlabel_value_level.setText("Easy Mode");
		else gameplay_jlabel_value_level.setText("Difficult Mode");
		gameplay_jlabel_value_level.setBounds(10,5,200,30);
		gameplay_jlabel_value_level.setFont(new Font("Arial",Font.BOLD,25));
		
		if (model.getLevel_value()!=2) {
			
		
		if (model.getGo_first_value()==1) {
			game_play_jlabel_go_first.setText("You Go First");
			game_play_jlabel_go_first.setForeground(Color.red);
		}
		else if (model.getGo_first_value()==0) {
			game_play_jlabel_go_first.setText("You Go Second");
			game_play_jlabel_go_first.setForeground(Color.blue);
		}
		
		}else {
			game_play_jlabel_go_first.setText("Luot cua X");
			game_play_jlabel_go_first.setForeground(Color.PINK);
		}
		
		
		game_play_jlabel_go_first.setBounds(300,5,200,30);
		game_play_jlabel_go_first.setFont(new Font("Arial",Font.BOLD,25));
		
		gameplay_jlabel.setBounds(0,0,500,600);
		
		
		
		gameplay_button_1.setBounds(66,38,116,116);
		gameplay_button_1.setBackground(Color.white);
		gameplay_button_2.setBounds(66+126,38,116,116);
		gameplay_button_2.setBackground(Color.white);
		gameplay_button_3.setBounds(66+126+126,38,116,116);
		gameplay_button_3.setBackground(Color.white);
		gameplay_button_4.setBounds(66,38+126,116,116);
		gameplay_button_4.setBackground(Color.white);
		gameplay_button_5.setBounds(66+126,38+126,116,116);
		gameplay_button_5.setBackground(Color.white);
		gameplay_button_6.setBounds(66+126+126,38+126,116,116);
		gameplay_button_6.setBackground(Color.white);
		gameplay_button_7.setBounds(66,38+126+126,116,116);
		gameplay_button_7.setBackground(Color.white);
		gameplay_button_8.setBounds(66+126,38+126+126,116,116);
		gameplay_button_8.setBackground(Color.white);
		gameplay_button_9.setBounds(66+126+126,38+126+126,116,116);
		gameplay_button_9.setBackground(Color.white);
		gameplay_button_1_x.setBounds(66,38,116,116);
		gameplay_button_1_x.setBackground(Color.white);
		gameplay_button_2_x.setBounds(66+126,38,116,116);
		gameplay_button_2_x.setBackground(Color.white);
		gameplay_button_3_x.setBounds(66+126+126,38,116,116);
		gameplay_button_3_x.setBackground(Color.white);
		gameplay_button_4_x.setBounds(66,38+126,116,116);
		gameplay_button_4_x.setBackground(Color.white);
		gameplay_button_5_x.setBounds(66+126,38+126,116,116);
		gameplay_button_5_x.setBackground(Color.white);
		gameplay_button_6_x.setBounds(66+126+126,38+126,116,116);
		gameplay_button_6_x.setBackground(Color.white);
		gameplay_button_7_x.setBounds(66,38+126+126,116,116);
		gameplay_button_7_x.setBackground(Color.white);
		gameplay_button_8_x.setBounds(66+126,38+126+126,116,116);
		gameplay_button_8_x.setBackground(Color.white);
		gameplay_button_9_x.setBounds(66+126+126,38+126+126,116,116);
		gameplay_button_9_x.setBackground(Color.white);
		gameplay_button_1_o.setBounds(66,38,116,116);
		gameplay_button_1_o.setBackground(Color.white);
		gameplay_button_2_o.setBounds(66+126,38,116,116);
		gameplay_button_2_o.setBackground(Color.white);
		gameplay_button_3_o.setBounds(66+126+126,38,116,116);
		gameplay_button_3_o.setBackground(Color.white);
		gameplay_button_4_o.setBounds(66,38+126,116,116);
		gameplay_button_4_o.setBackground(Color.white);
		gameplay_button_5_o.setBounds(66+126,38+126,116,116);
		gameplay_button_5_o.setBackground(Color.white);
		gameplay_button_6_o.setBounds(66+126+126,38+126,116,116);
		gameplay_button_6_o.setBackground(Color.white);
		gameplay_button_7_o.setBounds(66,38+126+126,116,116);
		gameplay_button_7_o.setBackground(Color.white);
		gameplay_button_8_o.setBounds(66+126,38+126+126,116,116);
		gameplay_button_8_o.setBackground(Color.white);
		gameplay_button_9_o.setBounds(66+126+126,38+126+126,116,116);
		gameplay_button_9_o.setBackground(Color.white);
		
		gameplay_jlabel_result.setBounds(200,5,200,30);
		gameplay_jlabel_result.setFont(new Font("Arial",Font.BOLD,25));
		gameplay_jlabel_result.setForeground(Color.pink);
		
	
		timer_jlabel.setText(second+"s");
		timer_jlabel.setFont(new Font("Arial",Font.BOLD,60));
		timer_jlabel.setForeground(Color.red);
		timer_jlabel.setBounds(200,450,200,50);
	
		gameplay_back_button.setBounds(370,500,100,30);
		gameplay_back_button.setBackground(Color.cyan);
		gameplay_back_button.setFont(font);
		gameplay_reset_button.setBounds(20,500,100,30);
		gameplay_reset_button.setBackground(Color.cyan);
		gameplay_reset_button.setFont(font);
		gameplay_continue_button.setBounds(130,500,120,30);
		gameplay_continue_button.setFont(font);
		gameplay_continue_button.setBackground(Color.cyan);
		gameplay_jlable_mark_X.setBounds(260, 500, 50, 30);
		gameplay_jlable_mark_X.setFont(new Font("Arial",Font.BOLD,25));
		gameplay_jlable_mark_X.setForeground(Color.pink);
		gameplay_jlable_mark_X.setText("X:"+model.getMark_x());
		gameplay_jlable_mark_O.setBounds(310, 500, 50, 30);
		gameplay_jlable_mark_O.setFont(new Font("Arial",Font.BOLD,25));
		gameplay_jlable_mark_O.setForeground(Color.pink);
		gameplay_jlable_mark_O.setText("O:"+model.getMark_o());
		
		row1 = new JLabel();
		row1.setText("1");
		row1.setBounds(50,66,50,50);
		row1.setFont(new Font("Arial",Font.BOLD,25));
		row1.setForeground(Color.red);
		
		row2 = new JLabel();
		row2.setText("2");
		row2.setBounds(50,66+126,50,50);
		row2.setFont(new Font("Arial",Font.BOLD,25));
		row2.setForeground(Color.red);
		
		row3 = new JLabel();
		row3.setText("3");
		row3.setBounds(50,66+126+126,50,50);
		row3.setFont(new Font("Arial",Font.BOLD,25));
		row3.setForeground(Color.red);
		
		colA = new JLabel();
		colA.setText("A");
		colA.setBounds(50+60,400,50,50);
		colA.setFont(new Font("Arial",Font.BOLD,25));
		colA.setForeground(Color.red);
		
		colB = new JLabel();
		colB.setText("B");
		colB.setBounds(50+60+126,400,50,50);
		colB.setFont(new Font("Arial",Font.BOLD,25));
		colB.setForeground(Color.red);
		
		colC = new JLabel();
		colC.setText("C");
		colC.setBounds(50+60+126+126,400,50,50);
		colC.setFont(new Font("Arial",Font.BOLD,25));
		colC.setForeground(Color.red);
		
		gameplay_jpanel.add(row1);
		gameplay_jpanel.add(row2);
		gameplay_jpanel.add(row3);
		gameplay_jpanel.add(colA);
		gameplay_jpanel.add(colB);
		gameplay_jpanel.add(colC);
		
		gameplay_jpanel.add(timer_jlabel);
		gameplay_jpanel.add(gameplay_jlable_mark_O);
		gameplay_jpanel.add(gameplay_jlable_mark_X);
		gameplay_jpanel.add(gameplay_continue_button);
		gameplay_jpanel.add(game_play_jlabel_go_first);
		gameplay_jpanel.add(gameplay_jlabel_result);
		gameplay_jlabel_result.setVisible(true);
		gameplay_jpanel.add(gameplay_button_1);
		gameplay_jpanel.add(gameplay_button_2);
		gameplay_jpanel.add(gameplay_button_3);
		gameplay_jpanel.add(gameplay_button_4);
		gameplay_jpanel.add(gameplay_button_5);
		gameplay_jpanel.add(gameplay_button_6);
		gameplay_jpanel.add(gameplay_button_7);
		gameplay_jpanel.add(gameplay_button_8);
		gameplay_jpanel.add(gameplay_button_9);
		gameplay_jpanel.add(gameplay_button_1_x);
		gameplay_jpanel.add(gameplay_button_2_x);
		gameplay_jpanel.add(gameplay_button_3_x);
		gameplay_jpanel.add(gameplay_button_4_x);
		gameplay_jpanel.add(gameplay_button_5_x);
		gameplay_jpanel.add(gameplay_button_6_x);
		gameplay_jpanel.add(gameplay_button_7_x);
		gameplay_jpanel.add(gameplay_button_8_x);
		gameplay_jpanel.add(gameplay_button_9_x);
		gameplay_jpanel.add(gameplay_button_1_o);
		gameplay_jpanel.add(gameplay_button_2_o);
		gameplay_jpanel.add(gameplay_button_3_o);
		gameplay_jpanel.add(gameplay_button_4_o);
		gameplay_jpanel.add(gameplay_button_5_o);
		gameplay_jpanel.add(gameplay_button_6_o);
		gameplay_jpanel.add(gameplay_button_7_o);
		gameplay_jpanel.add(gameplay_button_8_o);
		gameplay_jpanel.add(gameplay_button_9_o);
		gameplay_button_1_x.setVisible(false);
		gameplay_button_2_x.setVisible(false);
		gameplay_button_3_x.setVisible(false);
		gameplay_button_4_x.setVisible(false);
		gameplay_button_5_x.setVisible(false);
		gameplay_button_6_x.setVisible(false);
		gameplay_button_7_x.setVisible(false);
		gameplay_button_8_x.setVisible(false);
		gameplay_button_9_x.setVisible(false);
		gameplay_button_1_o.setVisible(false);
		gameplay_button_2_o.setVisible(false);
		gameplay_button_3_o.setVisible(false);
		gameplay_button_4_o.setVisible(false);
		gameplay_button_5_o.setVisible(false);
		gameplay_button_6_o.setVisible(false);
		gameplay_button_7_o.setVisible(false);
		gameplay_button_8_o.setVisible(false);
		gameplay_button_9_o.setVisible(false);
		gameplay_jpanel.add(gameplay_reset_button);
		gameplay_jpanel.add(gameplay_jlabel_value_level);
		gameplay_jpanel.add(gameplay_back_button);
		gameplay_jpanel.add(gameplay_jlabel);
		
		this.add(gameplay_jpanel);	
	}
	
	public void time() {
		if (model.checkWin(model.getMatric())==-1) {
			second =60;
			timer_jlabel.setText(second+"s");
		}
		countTime = new javax.swing.Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				check_matrix();
				second--;
				if (second>=0) {
					timer_jlabel.setText(second+"s");
				}
			}
		}
				
				); 
		countTime.start();
	}
	 
	
	

}
