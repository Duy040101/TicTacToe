package model;





public class modelGameTicTacToe {
		private int level_value; 
		private int go_first_value ; 
		private int matrix [];     
		private int mark_x;
		private int mark_o;
		private int player;
		
		/**
		 * @return the player
		 */
		public int getPlayer() {
			return player;
		}

		/**
		 * @param player the player to set
		 */
		public void setPlayer(int player) {
			this.player = player;
		}

		public modelGameTicTacToe() {
			player=1;
			mark_x=0;
			mark_o=0;
			go_first_value =1;
			level_value = 2;   
			matrix  =new int[9]; 
			for (int i=0;i<9;i++) {
				 
					matrix[i] = 0;
				
			}
		}

		/**
		 * @return the diem_x
		 */
		public int getMark_x() {
			return mark_x;
		}

		/**
		 * @param diem_x the diem_x to set
		 */
		public void setMark_x(int mark_x) {
			this.mark_x = mark_x;
		}

		/**
		 * @return the diem_o
		 */
		public int getMark_o() {
			return mark_o;
		}

		/**
		 * @param diem_o the diem_o to set
		 */
		public void setMark_o(int mark_o) {
			this.mark_o = mark_o;
		}

		/**
		 * @return the level_value
		 */
		public int getLevel_value() {
			return level_value;
		}

		/**
		 * @param level_value the level_value to set
		 */
		public void setLevel_value(int level_value) {
			this.level_value = level_value;
		}

		/**
		 * @return the go_first_value
		 */
		public int getGo_first_value() {
			return go_first_value;
		}

		/**
		 * @param go_first_value the go_first_value to set
		 */
		public void setGo_first_value(int go_first_value) {
			this.go_first_value = go_first_value;
		}

		/**
		 * @return the matrix_tic_toe
		 */
		public int getMatrix(int k) {
			return this.matrix[k];
		}

		/**
		 * @param matrix_tic_toe the matrix_tic_toe to set
		 */
		public void setMatrix(int k,int matrix) {
			this.matrix[k] = matrix;
		}
		public boolean check_matrixFull() {
			int check ;
			check = matrix[0]*matrix[1]*matrix[2]*matrix[3]*matrix[4]*matrix[5]*matrix[6]*matrix[7]*matrix[8];
			if (check==0) return false;
			else return true;
			
		}
		public static int random(int a,int b) {  
			double x = Math.random(); 
			int xx = a;
			xx = xx + (int)(x*(b-a+1));
			return xx;
		}
		public void random_generate() {  
			int x;
			if (check_matrixFull()==false) {
				x=random(0,8);
				
				while (matrix[x]!=0) {
					x=random(0,8);
				}
				matrix[x]=1;
			}
			
		}
		public void changePlayer() {
			if (this.player==1) this.player=2;
			else this.player=1;
			
		}
		public int checkWin(int[] a) {
			if (a[0] != 0 && a[0] == a[1] && a[1] == a[2])
				return a[0];
			if (a[3] != 0 && a[3] == a[4] && a[4] == a[5])
				return a[3];
			if (a[6] != 0 && a[6] == a[7] && a[7] == a[8])
				return a[6];
			
			if (a[0] != 0 && a[0] == a[3] && a[3] == a[6])
				return a[0];
			if (a[1] != 0 && a[1] == a[4] && a[4] == a[7])
				return a[1];
			if (a[2] != 0 && a[2] == a[5] && a[5] == a[8])
				return a[2];
			
			if (a[0] != 0 && a[0] == a[4] && a[4] == a[8])
				return a[0];
			if (a[2] != 0 && a[2] == a[4] && a[4] == a[6])
				return a[2];
			
			
			
			for (int i = 0; i < 9; i++)
				if (matrix[i] == 0)
					return -1;
			return -1;
		}
		
		public int checkPoint1() {
			int[] matrix2= new int[matrix.length];
			for (int i = 0; i < matrix2.length; i++) {
				matrix2[i]=matrix[i];
			}
			for (int i = 0; i < 9; i++)
				if (matrix2[i] == 0) {
					matrix2[i] = 1;
					if (checkWin(matrix2) == 1) {
						matrix2[i] = 0;
						return i;
					}
					matrix2[i] = 0;
				}
			return -1;
		}
		
		public int checkPoint2() {
			int[] matrix2= new int[matrix.length];
			for (int i = 0; i < matrix2.length; i++) {
				matrix2[i]=matrix[i];
			}
			for (int i = 0; i < 9; i++)
				if (matrix2[i] == 0) {
					matrix2[i] = 2;
					if (checkWin(matrix2) == 2) {
						matrix2[i] = 0;
						return i;
					}
					matrix2[i] = 0;
				}
			return -1;
		}
		public int[] getMatric() {
			return this.matrix;
		}
		public int creatPointRandom() {
			int x = random(0,8);
			if (check_matrixFull()==false) {
			if (matrix[4] == 0)
				return 4;
			if (matrix[0] == 0 || matrix[2] == 0 ||matrix[6] == 0 || matrix[8] == 0)	
				while (matrix[x]!=0  ) { 
						x=random(0,3);
						if (x==0) {
							x=0;
						} else if (x==1) {
							x=2;
							} else if(x==2){
							x=6;
							} else x=8;
						if (matrix[x]==0) {
							return x;
						}

				}
			
			
				while (matrix[x]!=0) {
					x=random(0,8);
				}
			}
			
			return x;
		}
		public int autoPoint() {
			int k = checkPoint1();
			if (k != -1)
				return k;
			else {
				k = checkPoint2();
				if (k != -1) 
					return k;
				else
					return creatPointRandom();
			}
		}
		public void difficult() {
			if (check_matrixFull()==false && checkWin(matrix)==-1) {
				int k;
				k=autoPoint();
				matrix[k]=1;
			}
		}
		public void upMark_x() {
			mark_x++;
		}
		public void upMark_o() {
			mark_o++;
		}
	
}
