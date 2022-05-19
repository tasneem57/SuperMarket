import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class pro {

	public static void main(String[] args) {
		Font font3 = new Font ("Bradley Hand ITC",Font.CENTER_BASELINE,30);
		Font font4 = new Font ("Bradley Hand ITC",Font.CENTER_BASELINE,25);
		Font font5 = new Font ("Century Gothic",Font.ITALIC,20);
		Font font6 = new Font ("Algerian",Font.CENTER_BASELINE,30);
		Font font7 = new Font ("Algerian",Font.CENTER_BASELINE,20);
		
   
    JFrame front = new JFrame() ;
    front.setSize(550, 650);
    front.setVisible(true);
    front.setLayout(null);
    front.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JFrame can =new JFrame();
    JFrame dai =new JFrame();
    JFrame spi =new JFrame();
    JFrame jui =new JFrame();
  
    
     // Front >>
    
    
    
     // Logo ..
		JLabel Lpic = new JLabel(new ImageIcon ( pro.class.getResource("picc.png"))) ;
		front.add(Lpic);
		Lpic.setBounds(75, 45, 100, 100);
		 
		JLabel Lbuy = new JLabel ("BUY Supermarket",JLabel.LEFT);
		Lbuy.setFont(font6);
		Lbuy.setBounds(200, 70, 370, 30);
		front.add(Lbuy);
		
    //name..
  		JLabel Lname = new JLabel ("Name",JLabel.CENTER);
  		JTextField Tname = new JTextField ();
  		Lname.setBounds(50,185,180,30);
  		Lname.setForeground(Color.black);
  		Lname.setFont(font3);
  		Tname.setBounds(250,185,200,30);
  		front.add(Lname);
  		front.add(Tname);
  		
  		
  		//Phone Num..
  		JLabel Lnum = new JLabel ("Phone Number",JLabel.CENTER);
  		JTextField Tnum = new JTextField ();
  		Lnum.setBounds(50,285,180,30);
  		Lnum.setForeground(Color.black);
  		Lnum.setFont(font4);
  		Tnum.setBounds(250,285,200,30);
  		front.add(Lnum);
  		front.add(Tnum);
  		//Adress..
  		JLabel Lad = new JLabel ("Adress",JLabel.CENTER);
  		JTextField Tad = new JTextField ();
  		Lad.setBounds(50,385,180,30);
  		Lad.setForeground(Color.black);
  		Lad.setFont(font3);
  		Tad.setBounds(250,385,200,30);
  		front.add(Lad);
  		front.add(Tad);
  		
  		//Order..
  		JButton order = new JButton("BUY");
  		order.setBounds(200, 485, 80, 70);
  		order.setFont(font7);
  		front.add(order);
  		
  		
  	// Data ..
  		JLabel kiloes = new JLabel("Number of kiloes ");
  		kiloes.setBounds(250, 50, 180, 30);
  		kiloes.setFont(font5);
  		kiloes.setForeground(Color.red);
  		JLabel price = new JLabel("Price / Kg ");
  		price.setBounds(500, 50, 180, 30);
  		price.setFont(font5);
  		price.setForeground(Color.red);
  		
  		JLabel kiloes1 = new JLabel("Number of kiloes ");
  		kiloes1.setBounds(250, 50, 180, 30);
  		kiloes1.setFont(font5);
  		kiloes1.setForeground(Color.red);
  		JLabel price1 = new JLabel("Price / Kg ");
  		price1.setBounds(500, 50, 180, 30);
  		price1.setFont(font5);
  		price1.setForeground(Color.red);
  		
  		//
  		JLabel kiloes2 = new JLabel("Number of kiloes ");
  		kiloes2.setBounds(250, 50, 180, 30);
  		kiloes2.setFont(font5);
  		kiloes2.setForeground(Color.red);
  		JLabel price2 = new JLabel("Price / Kg ");
  		price2.setBounds(500, 50, 180, 30);
  		price2.setFont(font5);
  		price2.setForeground(Color.red);
  		
  		JLabel kiloes3 = new JLabel("Number of kiloes ");
  		kiloes3.setBounds(250, 50, 180, 30);
  		kiloes3.setFont(font5);
  		kiloes3.setForeground(Color.red);
  		JLabel price3 = new JLabel("Price / Kg ");
  		price3.setBounds(500, 50, 180, 30);
  		price3.setFont(font5);
  		price3.setForeground(Color.red);
  		
  		JLabel kiloes4 = new JLabel("Number of kiloes ");
  		kiloes4.setBounds(250, 50, 180, 30);
  		kiloes4.setFont(font5);
  		kiloes4.setForeground(Color.red);
  		JLabel price4 = new JLabel("Price / Kg ");
  		price4.setBounds(500, 50, 180, 30);
  		price4.setFont(font5);
  		price4.setForeground(Color.red);
  		
  		JLabel kiloes5 = new JLabel("Number of kiloes ");
  		kiloes5.setBounds(250, 50, 180, 30);
  		kiloes5.setFont(font5);
  		kiloes5.setForeground(Color.red);
  		JLabel price5 = new JLabel("Price / Kg ");
  		price5.setBounds(500, 50, 180, 30);
  		price5.setFont(font5);
  		price5.setForeground(Color.red);
  
  		
  		// price/kg
  		
  		//  price/kg .. for fruits
  		JLabel prapp = new JLabel("10 L.E. ");
  		prapp.setBounds(500, 100, 180, 30);
  		prapp.setFont(font5);
  		prapp.setForeground(Color.BLACK);
  		JLabel prban = new JLabel("5  L.E. ");
  		prban.setBounds(500, 200, 180, 30);
  		prban.setFont(font5);
  		prban.setForeground(Color.BLACK);
   		JLabel prora = new JLabel("4  L.E. ");
  		prora.setBounds(500, 300, 180, 30);
  		prora.setFont(font5);
  		prora.setForeground(Color.BLACK);
  	    //  price/kg .. for fruits
  	  	JLabel prtom = new JLabel("4 L.E. ");
  		prtom.setBounds(500, 100, 180, 30);
  	  	prtom.setFont(font5);
  	  	prtom.setForeground(Color.BLACK);
  	  	JLabel prcar = new JLabel("5 L.E. ");
  	  	prcar.setBounds(500, 200, 180, 30);
  	  	prcar.setFont(font5);
  	  	prcar.setForeground(Color.BLACK);
  	   	JLabel prpot = new JLabel("6 L.E. ");
  	  	prpot.setBounds(500, 300, 180, 30);
  	  	prpot.setFont(font5);
  	  	prpot.setForeground(Color.BLACK);
  		
  		
        
  		// Departments >>
  		
  		
  	    JFrame depart =new JFrame();
  	    depart.setLayout(null);
  	    depart.setSize(1250, 710);
  	  JButton Bfruit = new JButton (new ImageIcon(pro.class.getResource("fruit.png")));
		Bfruit.setBounds(100, 200, 250, 200);
		depart.add(Bfruit);
		//vegetable..
  		JButton Bvegetable = new JButton (new ImageIcon(pro.class.getResource("vegetable.png")));
  		Bvegetable.setBounds(500, 200, 250, 200);
  		depart.add(Bvegetable);
  	   //spices..
  		JButton Bspices = new JButton (new ImageIcon(pro.class.getResource("spices.png")));
  		Bspices.setBounds(900, 200, 250, 200);
  		depart.add(Bspices);
  	   //Diary Product ..
  		JButton Bdiary = new JButton (new ImageIcon(pro.class.getResource("diiarry.png")));
  		Bdiary.setBounds(100, 450, 250, 200);
  		depart.add(Bdiary);
  	   //candy..
  		JButton Bcandy = new JButton (new ImageIcon(pro.class.getResource("candy.png")));
  		Bcandy.setBounds(500, 450, 250, 200);
  		depart.add(Bcandy);
       //juice..
  		JButton Bjuice = new JButton (new ImageIcon(pro.class.getResource("juice.png")));
  		Bjuice.setBounds(900, 450, 250, 200);
  		depart.add(Bjuice);  	
  		
  		 //welcome .. 
  		Font font = new Font ("Cooper Black",Font.BOLD,40);
  		JLabel wel = new JLabel ();
  		wel.setFont(font);
  		wel.setForeground(Color.BLACK);
  		wel.setBounds(100,30,900,90);
  		depart.add(wel);
  		JLabel well = new JLabel ();
  		Font font2 = new Font ("Bradley Hand ITC",Font.CENTER_BASELINE,30);
  		well.setForeground(Color.BLACK);
  		well.setFont(font2);
  		well.setText(" Tell us Your order ... " );
  		well.setBounds(100,100,900,70);
  		depart.add(well);	
  		
  		order.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent arg0) {			
  				depart.setVisible(true);
  				front.setVisible(false);
  				String name = Tname.getText();
  				wel.setText("Welcome " + name );
  			}
  		});
  		
  		
  		
  		// Fruit Frame >>
  		
  		JFrame fruit=new JFrame();
  		fruit.setLayout(null);
  		fruit.setSize(700, 550);
  		fruit.add(kiloes);
  		fruit.add(price);
  		
  	    //apple..
  		JTextField Tapp = new JTextField("0");
  		JLabel Lapp= new JLabel("Apples ");
  		JCheckBox Capp = new JCheckBox();
  		fruit.add(Capp);
  		Capp.setBounds(30, 100, 20, 20);
  		Lapp.setBounds(70, 100, 120, 30);
  		Lapp.setFont(font3);
  		fruit.add(Lapp);
  		Tapp.setBounds(250, 100, 180, 30);
  		fruit.add(Tapp);
  		fruit.add(prapp);
  		//Banana ..
  		JTextField Tban = new JTextField("0");
  		JLabel Lban = new JLabel("Bananas ");
  		JCheckBox Cban = new JCheckBox();
  		fruit.add(Cban);
  		Cban.setBounds(30, 200, 20, 20);
  		Lban.setBounds(70, 200, 180, 30);
  		Lban.setFont(font3);
  		fruit.add(Lban);
  		Tban.setBounds(250, 200, 180, 30);
  		fruit.add(Tban);
  		fruit.add(prban);
   		//orange..
  		JTextField Tora = new JTextField("0");
  		JLabel Lora= new JLabel("Oranges ");
  		JCheckBox Cora = new JCheckBox();
  		fruit.add(Cora);
  		Cora.setBounds(30, 300, 20, 20);
  		Lora.setBounds(70, 300, 150, 30);
  		fruit.add(Lora);
  		Lora.setFont(font3);
  		Tora.setBounds(250, 300, 180, 30);
  		fruit.add(Tora);
  		fruit.add(prora);
  		
  		// next & back
  		JButton fback = new JButton("Back");
  		fback.setBounds(290, 400, 80, 70);
  		fruit.add(fback);
  		JButton fnext = new JButton("Next");
  		fnext.setBounds(500, 400, 80, 70);
  		fruit.add(fnext);
  		
  		
  		
  		   Bfruit.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent arg0) {
  				fruit.setVisible(true);
  				depart.setVisible(false);
  			}
  		});
  		 fback.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {
   				depart.setVisible(true);
   				fruit.setVisible(false);
   			}
   		});
  		  		 
  		 
  		 
  		 
       // Vegetable Frame >>
  		
  		 JFrame Veg =new JFrame();
  		 Veg.setLayout(null);
  		 Veg.setSize(700, 550);
  		 Veg.add(kiloes1);
  		 Veg.add(price1);
  		//Tomato ..
  		JTextField Ttom = new JTextField("0");
  		JLabel Ltom = new JLabel("Tomatoes ");
  		JCheckBox Ctom = new JCheckBox();
  		Veg.add(Ctom);
  		Ctom.setBounds(30, 100, 20, 20);
  		Ltom.setBounds(70, 100, 180, 30);
  		Ltom.setFont(font3);
  		 Veg.add(Ltom);
  		Ttom.setBounds(250, 100, 180, 30);
  		 Veg.add(Ttom);
  		 Veg.add(prtom);
  		//Carrot..
  		JTextField Tcar = new JTextField("0");
  		JLabel Lcar= new JLabel("Carrots ");
  		JCheckBox Ccar = new JCheckBox();
  		Veg.add(Ccar);
  		Ccar.setBounds(30, 200, 20, 20);
  		Lcar.setBounds(70, 200, 130, 30);
  		Lcar.setFont(font3);
  		 Veg.add(Lcar);
  		Tcar.setBounds(250, 200, 180, 30);
  		 Veg.add(Tcar);
  		Veg.add(prcar);
  		//Potatoes..
  		JTextField Tpot = new JTextField("0");
  		JLabel Lpot= new JLabel("Potatoes");
  		JCheckBox Cpot = new JCheckBox();
  		Veg.add(Cpot);
  		Cpot.setBounds(30, 300, 20, 20);
  		Lpot.setBounds(70, 300, 180, 30);
  		 Veg.add(Lpot);
  		Lpot.setFont(font3);
  		Tpot.setBounds(250, 300, 180, 30);
  		 Veg.add(Tpot);
  		Veg.add(prpot);
  		 
  	// next & back
   		JButton vback = new JButton("Back");
   		vback.setBounds(290, 400, 80, 70);
   		Veg.add(vback);
   		JButton vnext = new JButton("Next");
   		vnext.setBounds(500, 400, 80, 70);
   		Veg.add(vnext);   		
   		
  		Bvegetable.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent arg0) {
  				Veg.setVisible(true);
  				fruit.setVisible(false);
  				depart.setVisible(false);
  			}
  		});
  		vback.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {
   				depart.setVisible(true);
   				Veg.setVisible(false);
   			}
   		});
  		
  		
  	//Bill Frame >>
  		
    	  JFrame bill =new JFrame("Bill");
    	  bill.setLayout(null);
  	  bill.setSize(700, 550);
  	  JLabel Lord= new JLabel("Your Order : ");
  	  JLabel Lbill = new JLabel("Your Bill : ");
  	 JLabel LP= new JLabel("L.E.");
  	  Lord.setBounds(70, 150, 200, 30);
  	  Lbill.setBounds(70, 230, 170, 30);
   	  LP.setBounds(340, 230, 170, 30);
   	  LP.setFont(font5);
   	  LP.setForeground(Color.RED);
  	  Lord.setFont(font3);
  	  Lbill.setFont(font3);
  	  bill.add(Lord);
  	  bill.add(Lbill);
  	  bill.add(LP);
  	  
  	JButton bback = new JButton("Back");
		bback.setBounds(150, 300, 80, 70);
		bill.add(bback);
		JButton bnext = new JButton("Finish");
		bnext.setBounds(450, 300, 80, 70);
		bill.add(bnext);
  	  

		
		// Next Buttons >>
		
		// Fruit .. Next Button ..
		
		JLabel getprice = new JLabel ();
	  	 fnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  		int finalprice =0;
			  	    String kban=Tban.getText();
			  	    int kban2;			  	   
			  	    kban2 = Integer.parseInt(kban);
			  		finalprice = finalprice + ( kban2 *5 );
			  		String kapp=Tapp.getText();
			  	    int kapp2 = Integer.parseInt(kapp);
			  		finalprice = finalprice + ( kapp2 *10 );					  
			  	    String kora=Tora.getText();
			  		int kora2 = Integer.parseInt(kora);
			  		finalprice = finalprice + ( kora2 *4 );
			  		getprice.setFont(font5);
			  		getprice.setForeground(Color.RED);
			  		getprice.setBounds(270, 230 , 80, 30);
			  		bill.add(getprice);
			  		 String ktom=Ttom.getText();
				  	    int ktom2;			  	   
				  	    ktom2 = Integer.parseInt(ktom);
				  		finalprice = finalprice + ( ktom2 *4 );
				  		String kcar=Tcar.getText();
				  	    int kcar2 = Integer.parseInt(kcar);
				  		finalprice = finalprice + ( kcar2 *5 ); 
				  	    String kpot=Tpot.getText();
				  		int kpot2 = Integer.parseInt(kpot);
				  		finalprice = finalprice + ( kpot2 *6 );
				  		String finalprice2 = Integer.toString(finalprice) ;
				  	  getprice.setText(finalprice2);
						Veg.setVisible(false);
				    fruit.setVisible(false);
				    bill.setVisible(true);
			}
  	 });
  	 
  	 // Vegetabel .. Next Button ..
  	vnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		  		int finalprice =0;
		  	    String kban=Tban.getText();
		  	    int kban2;			  	   
		  	    kban2 = Integer.parseInt(kban);
		  		finalprice = finalprice + ( kban2 *5 );
		  		String kapp=Tapp.getText();
		  	    int kapp2 = Integer.parseInt(kapp);
		  		finalprice = finalprice + ( kapp2 *10 );					  
		  	    String kora=Tora.getText();
		  		int kora2 = Integer.parseInt(kora);
		  		finalprice = finalprice + ( kora2 *4 );
		  		//String finalprice2 = Integer.toString(finalprice) ;
		  		getprice.setFont(font5);
		  		getprice.setForeground(Color.RED);
		  		//getprice.setText(finalprice2);
		  		getprice.setBounds(270, 230 , 80, 30);
		  		bill.add(getprice);
		  		 String ktom=Ttom.getText();
			  	    int ktom2;			  	   
			  	    ktom2 = Integer.parseInt(ktom);
			  		finalprice = finalprice + ( ktom2 *4 );
			  		String kcar=Tcar.getText();
			  	    int kcar2 = Integer.parseInt(kcar);
			  		finalprice = finalprice + ( kcar2 *5 ); 
			  	    String kpot=Tpot.getText();
			  		int kpot2 = Integer.parseInt(kpot);
			  		finalprice = finalprice + ( kpot2 *6 );
			  		String finalprice2 = Integer.toString(finalprice) ;
			  	  getprice.setText(finalprice2);
			        bill.setVisible(true);
					Veg.setVisible(false);
			    fruit.setVisible(false);
				Veg.setVisible(false);
				
			}
		});
  	 
  	
  	// CheckBox Action ..  in Bill Frame
  	 JLabel O1=new JLabel("Oranges ");
	  	 O1.setBounds(445, 150, 200, 30);
	  	 O1.setFont(font5);
	   	 O1.setForeground(Color.RED);
	  	 bill.add(O1);
  	     O1.setVisible(false);
  	
  	JLabel B1=new JLabel("Bananas ");
	  	 B1.setBounds(350, 150, 220, 30);
	  	 B1.setFont(font5);
	   	 B1.setForeground(Color.RED);
	  	 bill.add(B1);
	  	 B1.setVisible(false);
	  	 
	JLabel A1=new JLabel("Apples ");
	     A1.setBounds(270, 150, 220, 30);
		 A1.setFont(font5);
     	 A1.setForeground(Color.RED);
		 bill.add(A1);
		 A1.setVisible(false);
		  	 
	JLabel T1=new JLabel("Tomatoes ");
		 T1.setBounds(450, 175, 200, 30);
         T1.setFont(font5);
		 T1.setForeground(Color.RED);
	     bill.add(T1);
		 T1.setVisible(false);
	  	
	JLabel C1=new JLabel("Carrots, ");
	  	C1.setBounds(350, 175, 220, 30);
	  	C1.setFont(font5);
	  	C1.setForeground(Color.RED);
		bill.add(C1);
		C1.setVisible(false);
		  	 
	JLabel P1=new JLabel("Potatoes, ");
		P1.setBounds(250, 175, 220, 30);
		P1.setFont(font5);
		P1.setForeground(Color.RED);
		bill.add(P1);
		P1.setVisible(false);
		  	 
		
  		Capp.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {   			
   			 A1.setVisible(true);
   			}
  		});
  		
  		Cban.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {   				
   			 B1.setVisible(true);
   			}
   		});
  		Cora.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {   				
   				O1.setVisible(true);   			
   			}
   		});
  		
  		Ctom.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {   			
   			 T1.setVisible(true);
   			}
  		});
  		
  		Ccar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {   				
   			 C1.setVisible(true);
   			}
   		});
  		Cpot.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {
   				P1.setVisible(true);
   			}
   		});
  		
  		
  		// Final Buttons .. in Bill Frame ..
  		
  		bback.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {
      	     bill.setVisible(false);	
   			 depart.setVisible(true);
   			getprice.setText(null);
   			}
   		});
  		bnext.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {
      	     bill.setVisible(false);	
   			}
   		});
    
  		
	}

}
