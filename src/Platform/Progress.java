package Platform;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Progress {
	
	Timer time = new Timer();
	
	int i=0;
	
	static JFrame frame = new JFrame();
	
	static JProgressBar progress = new JProgressBar();
	
	static Icon background = new ImageIcon("Resource/Loading/background.gif");
	
	static JLabel back = new JLabel();
	
	public Progress(){
		frame.setSize(800,795);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		back.setBounds(0, 0, 800, 766);
		back.setIcon(background);
		
		progress.setBounds(200, 20 , 400, 30);
		progress.setMinimum( 0 );
		progress.setMaximum( 100 );
		progress.setValue( i );
		progress.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		progress.setStringPainted(true);
		progress.setForeground(Color.RED);
		progress.setString(String.valueOf(i)+"%");
		
		frame.add(progress);
		frame.add(back);
		new Panda();
		time.schedule(new Time(), 50);

	}
	
	class Time extends TimerTask {
	    public void run() {
	    	i++;
	    	if(i<=100)
	    	{
	    		if(i>=25 && i<50){
	    			progress.setForeground(Color.YELLOW);
	    		}
	    		if(i>=50 && i<75){
	    			progress.setForeground(Color.GREEN);
	    		}
	    		if(i>=75){
	    			progress.setForeground(Color.BLUE);
	    		}
	    		progress.setValue(i);
	    		progress.setString(String.valueOf(i)+"%");
	    		time.schedule(new Time(), 50);
	    	}else{
	    		frame.dispose();
	    		Panda.frame.setVisible(true);
	    	}
	    	
	    		
	    }
	    
	}
	
	public static void main(String[] args) {
		new Progress();
	}

}
