import javax.swing.JFrame;

public class Main {
	
	public static void  main(String[] args){
		
		JFrame frame =new JFrame("Games");
		
		Blocks games = new Blocks();
		
		frame.getContentPane().add(games);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(490, 600);
		frame.setResizable(false);
		
	}

}
