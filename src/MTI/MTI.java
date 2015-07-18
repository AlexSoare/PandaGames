package MTI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MTI implements ActionListener{
	int y,q,i,w,z,poz,c=16,gasit,sec=0,wini=0;
	
	Timer time = new Timer();

	JFrame f = new JFrame("MTI");
	
	JButton d1 = new JButton();
	JButton d2 = new JButton();
	JButton d3 = new JButton();
	JButton d4 = new JButton();
	JButton d5 = new JButton();
	JButton d6 = new JButton();
	JButton d7 = new JButton();
	JButton d8 = new JButton();
	JButton d9 = new JButton();
	JButton d10 = new JButton();
	JButton d11 = new JButton();
	JButton d12 = new JButton();
	JButton d13 = new JButton();
	JButton d14 = new JButton();
	JButton d15 = new JButton();
	JButton d16 = new JButton();
	JButton start = new JButton("Start");
	JButton again = new JButton("Again");
	JButton close = new JButton("Close");
	
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JLabel l6 = new JLabel();
	JLabel l7 = new JLabel();
	JLabel l8 = new JLabel();
	JLabel l9 = new JLabel();
	JLabel l10 = new JLabel();
	JLabel l11 = new JLabel();
	JLabel l12 = new JLabel();
	JLabel l13 = new JLabel();
	JLabel l14 = new JLabel();
	JLabel l15 = new JLabel();
	JLabel l16 = new JLabel();
	
	JLabel back = new JLabel();
	
	Icon p1 = new ImageIcon("Resource/MTI/p1.png");
	Icon p2 = new ImageIcon("Resource/MTI/p2.png");
	Icon p3 = new ImageIcon("Resource/MTI/p3.png");
	Icon p4 = new ImageIcon("Resource/MTI/p4.png");
	Icon p5 = new ImageIcon("Resource/MTI/p5.png");
	Icon p6 = new ImageIcon("Resource/MTI/p6.png");
	Icon p7 = new ImageIcon("Resource/MTI/p7.png");
	Icon p8 = new ImageIcon("Resource/MTI/p8.png");
	Icon win = new ImageIcon("Resource/MTI/win.gif");
	Icon bg = new ImageIcon("Resource/MTI/back.png");
	Icon wn = new ImageIcon("Resource/MTI/win.png");
	Icon lo = new ImageIcon("Resource/MTI/lose.png");
	
	Vector<JButton> v = new Vector<JButton>(16,1);
	
	Vector<JLabel> v2 = new Vector<JLabel>(16,1);
	
	Vector<Integer> vi = new Vector<Integer>(16,1);
	
	Vector<Icon> vicon = new Vector<Icon>(8,1);
	
	public MTI(){
		
		f.setSize(408,426);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setLayout(null); 
		
		back.setBounds(0,0,404,404);
		
		back.setIcon(bg);
		
		start.setBounds(150,250,100,50);
		start.addActionListener(this);
		
		again.setBounds(100,200,100,50);
		again.addActionListener(this);	
		again.setVisible(false);
		f.add(again);
		
		close.setBounds(200,200,100,50);
		close.addActionListener(this);
		close.setVisible(false);
		f.add(close);
		
		
		v.add(d1);v.add(d2);v.add(d3);v.add(d4);v.add(d5);v.add(d6);v.add(d7);v.add(d8);
		v.add(d9);v.add(d10);v.add(d11);v.add(d12);v.add(d13);v.add(d14);v.add(d15);v.add(d16);
		
		v2.add(l1);v2.add(l2);v2.add(l3);v2.add(l4);v2.add(l5);v2.add(l6);v2.add(l7);v2.add(l8);
		v2.add(l9);v2.add(l10);v2.add(l11);v2.add(l12);v2.add(l13);v2.add(l14);v2.add(l15);v2.add(l16);
		
		vicon.add(p1);vicon.add(p2);vicon.add(p3);vicon.add(p4);vicon.add(p5);vicon.add(p6);vicon.add(p7);vicon.add(p8);
		
		f.add(start);
		
		y=0;
		q=0;
		while(y<=303)
		{
			for(i=0;i<=303;i+=101){
				v.get(q).setBounds(i,y,101,101);
				v.get(q).addActionListener(this);
				f.add(v.get(q));
				v2.get(q).setBounds(i,y,101,101);
				f.add(v2.get(q));
				q++;
			}
			y=y+101;
		}
		for(i=0;i<16;i++)
			vi.add(0);
		InitRand();
		
		
		f.add(back);
	
	}
	
	class Time extends TimerTask {
	     public void run() {
	    	 for(i=0;i<16;i++)
	    		 v.get(i).setVisible(true);
	     }
	}
	
	class sec extends TimerTask {
	     public void run() {
	    	 sec++;
	    	 f.setTitle("Secunde "+sec);
	    	 if(sec<15 && wini==0)
	    		 time.schedule(new sec(), 1000);
	    	 else if(wini==0){
	    		 for(i=0;i<16;i++) {
	    			 v2.get(i).setVisible(false);
	    			 v.get(i).setVisible(false);
	    		 }
	    		 again.setVisible(true);
	    		 close.setVisible(true);
	    		 back.setIcon(lo);
	    	 }else wini=0;
	     }
	}
	
	
	public void InitRand(){
		for(i=0;i<16;i++)
			vi.set(i, 0);
		for(poz=1;poz<=8;poz++){
			z=randInt(0,15);
			while(vi.get(z)!=0)
				z=randInt(0,15);
			vi.set(z, poz);
			w=randInt(0,15);
			while(vi.get(w)!=0){
				w=randInt(0,15);
				if((w==0 && vi.get(w+1)==poz) || (w==15 && vi.get(w-1)==poz) || (w!=15 && vi.get(w+1)==poz) || (w!=0 && vi.get(w-1)==poz))
					w=randInt(0,15);
			}
			vi.set(w, poz);
		}
		for(i=0;i<16;i++)
		{
			v2.get(i).setIcon(vicon.get(vi.get(i)-1));
			v.get(i).setVisible(false);
			v2.get(i).setVisible(false);
		}
		q=0;
	}

		
	public static int randInt(int min, int max) {

	     Random rand = new Random();

	     int randomNum = rand.nextInt((max - min) + 1) + min;

	     return randomNum;
	 }
	
	public void finish(){
		
	}
			
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start){
			start.setVisible(false);
			for(i=0;i<16;i++)
				v2.get(i).setVisible(true);
			time.schedule(new Time(), 1500);
			time.schedule(new sec(), 1000);
			back.setIcon(null);
		}
		if(e.getSource()==again)
		{
			sec=0;
			back.setIcon(null);
			again.setVisible(false);
			close.setVisible(false);
			InitRand();
			for(i=0;i<16;i++)
				v2.get(i).setVisible(true);
			time.schedule(new Time(), 1500);
			time.schedule(new sec(), 1000);
		}
		if(e.getSource()==close)
			f.dispose();
		
		for(i=0;i<16;i++)
			if(e.getSource() == v.get(i)){
				v.get(i).setVisible(false);
				if(c!=16)
					if(v2.get(i).getIcon().equals(v2.get(c).getIcon())){
						v.get(i).setVisible(false);
						v.get(c).setVisible(false);
						v2.get(i).setIcon(win);
						v2.get(c).setIcon(win);
						c=16;
						q++;
						if(q==8)
						{
							for(i=0;i<16;i++)
								v2.get(i).setVisible(false);
							again.setVisible(true);
							close.setVisible(true);
							back.setIcon(wn);
							wini=1;
						}
							
					}else{
						v.get(c).setVisible(true);
						c=i;
					}
				else
					c=i;
			}
		
		
	}

}
