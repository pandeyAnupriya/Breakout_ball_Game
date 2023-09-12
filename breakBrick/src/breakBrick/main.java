package breakBrick;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		
//		CREATING A OBJECT FRAME AND SETTING ITS PROPERTY
	   JFrame obj = new JFrame();
	   
//	   creating GamePlay Object
	   GamePlay gameplay =new GamePlay();
	   obj.setBounds(10,10,700,600);
	   obj.setTitle("Breakout Ball");
	   obj.setResizable(false);
	   obj.setVisible(true);
	   obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   obj.add(gameplay);

	}

}
