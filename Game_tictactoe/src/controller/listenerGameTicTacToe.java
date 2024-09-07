package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_game;

public class listenerGameTicTacToe implements ActionListener{
	private  view_game view;
	private int i;
	public listenerGameTicTacToe(view_game view) {
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
if (e.getActionCommand()=="Player X Player") {
	view.end=false;
	view.countTime.stop();
	view.game_play_monitor();
	view.time();
			
		} else if (e.getActionCommand()=="Back") {
			view.gameplay_jlabel_result.setText("");
			view.countTime.stop();
			view.second=60;
			view.time();
			view.model.setPlayer(1);
			view.model.setMark_o(0);
			view.model.setMark_x(0);
			view.model.setLevel_value(2);
			for ( i=0; i < 9;i++) view.model.setMatrix(i, 0);
			
			view.show_matrix();
			view.gameplay_jlabel_result.setVisible(false);
			view.enable_matrix(1);
			view.main_monitor();
			view.end=false;
		} else if (e.getActionCommand()=="Computer") {
			view.model.setGo_first_value(0);
		} else if (e.getActionCommand()=="Player") {
			view.model.setGo_first_value(1);
		} else if (e.getActionCommand()=="Player X Computer") {
			view.setting_monitor();
		} else if (e.getActionCommand()=="Easy") {
			view.model.setLevel_value(0);
		} else if (e.getActionCommand()=="Difficult") {
			view.model.setLevel_value(1);
		} else if (e.getActionCommand()=="Player VS Player") {
			view.model.setLevel_value(2);
		}else if (e.getActionCommand()=="Play Now") {
			view.end=false;
			view.countTime.stop();
			view.game_play_monitor();
			view.time();
			if (view.model.getGo_first_value()==0 && view.model.getLevel_value()!=2) {
				view.countTime.stop();
				view.second=60;
				view.time();
				if (view.model.getLevel_value()==0) {
					int bien_so = random(1,9);
					if (bien_so==1) view.go_line(2, "o1");
					if (bien_so==2) view.go_line(2, "o2");
					if (bien_so==3) view.go_line(2, "o3");
					if (bien_so==4) view.go_line(2, "o4");
					if (bien_so==5) view.go_line(2, "o5");
					if (bien_so==6) view.go_line(2, "o6");
					if (bien_so==7) view.go_line(2, "o7");
					if (bien_so==8) view.go_line(2, "o8");
					if (bien_so==9) view.go_line(2, "o9");
				}
				else view.go_line(2, "o5");
				view.show_matrix();
			}
			
			
		} else if (e.getActionCommand()=="o1") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o1");
			view.check_matrix();
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="o2") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o2");
			view.check_matrix();
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="o3") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o3");
			view.check_matrix();
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="o4") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o4");
			view.check_matrix();
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="o5") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o5");
			view.check_matrix();
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="o6") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o6");
			view.check_matrix();
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="o7") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o7");
			view.check_matrix();
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="o8") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o8");
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="o9") {
			view.countTime.stop();
			view.second=60;
			view.time();
			view.go_line(view.model.getPlayer(),"o9");
			view.check_matrix();
			if (view.model.getLevel_value()==0) {
				view.model.random_generate();
			} else if (view.model.getLevel_value()==1) {
				view.model.difficult();
			} else {
				view.model.changePlayer();
			}
			view.show_matrix();
			view.check_matrix();
		} else if (e.getActionCommand()=="Reset") {
			view.gameplay_jlabel_result.setText("");
			if (view.model.getLevel_value()!=2) {
				view.gameplay_jlabel_result.setText("");
			}
			view.end=false;
			view.countTime.stop();
			view.second=60;
			view.time();
			
			view.model.setPlayer(1);
			view.model.setMark_o(0);
			view.model.setMark_x(0);
			for ( i=0; i < 9;i++) view.model.setMatrix(i, 0);
			
			view.gameplay_jlable_mark_X.setText("X:"+view.model.getMark_x());
			view.gameplay_jlable_mark_O.setText("O:"+view.model.getMark_o());
			view.show_matrix();
			if (view.model.getLevel_value()!=2)
			view.gameplay_jlabel_result.setVisible(false);
			view.enable_matrix(1);
			if (view.model.getGo_first_value()==0 && view.model.getLevel_value()!=2) {
				if (view.model.getLevel_value()==0) {
					int bien_so = random(1,9);
					if (bien_so==1) view.go_line(2, "o1");
					if (bien_so==2) view.go_line(2, "o2");
					if (bien_so==3) view.go_line(2, "o3");
					if (bien_so==4) view.go_line(2, "o4");
					if (bien_so==5) view.go_line(2, "o5");
					if (bien_so==6) view.go_line(2, "o6");
					if (bien_so==7) view.go_line(2, "o7");
					if (bien_so==8) view.go_line(2, "o8");
					if (bien_so==9) view.go_line(2, "o9");
				}
				else view.go_line(2, "o5");
				view.show_matrix();
			}
		}
			else if (e.getActionCommand()=="Continue") {
				if (view.model.getLevel_value()!=2) {
					view.gameplay_jlabel_result.setText("");
				}
				view.gameplay_jlabel_result.setText("");
				view.gameplay_continue_button.setVisible(false);
				view.end=false;
				view.countTime.stop();
				view.second=60;
				view.time();
				
				
				for ( i=0; i < 9;i++) view.model.setMatrix(i, 0);
				
				view.gameplay_jlable_mark_X.setText("X:"+view.model.getMark_x());
				view.gameplay_jlable_mark_O.setText("O:"+view.model.getMark_o());
				view.show_matrix();
				if (view.model.getLevel_value()!=2)
				view.gameplay_jlabel_result.setVisible(false);
				view.enable_matrix(1);
				if (view.model.getGo_first_value()==0 && view.model.getLevel_value()!=2) {
					if (view.model.getLevel_value()==0) {
						int bien_so = random(1,9);
						if (bien_so==1) view.go_line(2, "o1");
						if (bien_so==2) view.go_line(2, "o2");
						if (bien_so==3) view.go_line(2, "o3");
						if (bien_so==4) view.go_line(2, "o4");
						if (bien_so==5) view.go_line(2, "o5");
						if (bien_so==6) view.go_line(2, "o6");
						if (bien_so==7) view.go_line(2, "o7");
						if (bien_so==8) view.go_line(2, "o8");
						if (bien_so==9) view.go_line(2, "o9");
					}
					else view.go_line(2, "o5");
					view.show_matrix();
				}
			
				
		}
	}
	public static int random(int a,int b) {  // sinh ra một số ngẫu nhiên từ a, b
		double x = Math.random(); 
		int xx = a;
		xx = xx + (int)(x*(b-a+1));
		return xx;
	}

	

}
