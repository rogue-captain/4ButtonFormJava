/**
Programmer: Sully Erkan-Rijos      
  
Class: CST 120 

Lab: 10

Description:
*for some reason button 1 acts like a set/reset before using buttons and in between using buttons...
*
This Java program will have 4 buttons for the user to interface with. 
button 1 = random background color.
button 2 = a centered picture printed to the screen. 
button 3 = 1 - 10 images produced depending on user input.
button 4 = random anything goes.  
**/


import java.awt.*;       

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.*;


@SuppressWarnings("serial")

public class ErkanRijosSLab10 extends JPanel implements ActionListener
{
	//IMAGE////////////////////////////////////////////////
	Image fieldImg;
	String imgFile1 = "./images/fieldpic.jpeg" ;
	
	Image gloveImg;
	String imgFile2 = "./images/glove.jpng " ;
	
	Image discImg;
	String imgFile3 = "./images/Disc.gif" ;
	
	Image garfieldImg;
	String imgFile4 = "./images/garfieldtiedup.gif " ;
	
	Image redcarImg;
	String imgFile5 = "./images/redcar.png" ;
	
	Image crossfaceImg;
	String imgFile6 = "./images/crosstoface.jpeg" ;
	
	Image rodtangImg;
	String imgFile7 = "./images/rodtang.jpg" ;
	
	Image rodtang2Img;
	String imgFile8 = "./images/rodtang2.jpg" ;
	
	Image jakeVSsilvaImg;
	String imgFile9 = "./images/jakeVSsilva.jpg" ;
	
	Image rodtang3Img;
	String imgFile10 = "./images/rodtang3.jpg" ;
	//IMAGE////////////////////////////////////////////////
	




///////////////////////////////ARRAY O' images
private Image[] imageArray = 
{
		fieldImg = Toolkit.getDefaultToolkit().getImage(imgFile1),
		gloveImg = Toolkit.getDefaultToolkit().getImage(imgFile2),
		discImg = Toolkit.getDefaultToolkit().getImage(imgFile3),
		garfieldImg = Toolkit.getDefaultToolkit().getImage(imgFile4),
		redcarImg = Toolkit.getDefaultToolkit().getImage(imgFile5),
		crossfaceImg = Toolkit.getDefaultToolkit().getImage(imgFile6),
		rodtangImg = Toolkit.getDefaultToolkit().getImage(imgFile7),
		rodtang2Img = Toolkit.getDefaultToolkit().getImage(imgFile8),
		jakeVSsilvaImg = Toolkit.getDefaultToolkit().getImage(imgFile9),
		rodtang3Img = Toolkit.getDefaultToolkit().getImage(imgFile10)
};
/////////////////////////////////ARRAY O' images



//Variables/////////////////////////////////////////////////////	
	private JButton tester1;
	
	private JButton tester2;
	
	private JButton tester3;
	
	private JButton tester4;
	
	//
    
    private Font f1 = new Font ("Serif", Font.BOLD, 20);
    
    private Font s1 = new Font ("Gothic", Font.ITALIC, 20);
    
    //
	
	private static Random new_random = new Random();
    
    //static JFrame frame = new JFrame("Lab 10");
    
    private JTextField userField;
    
    //
    
    int buttonNumber = 0;
    
    int randNum = 0;
    
    int userInteger ;
    
    int imagePrintNumber = 0;

    //
    
    String userIntegerValue = String.valueOf(userInteger);

  //Variables/////////////////////////////////////////////////////	   
    
    
    
 /////////////////////////////CONSTRUCTOR/////////////////////////////////
public void button1()
{
     tester1 = new JButton("Background");
        
     tester1.setBackground(Color.PINK);
        
     tester1.setForeground(Color.BLACK);
        
     tester1.setFont(s1);

     //
     
	tester2 = new JButton("Drawing");
	
	tester2.setBackground(Color.PINK);
    
    tester2.setForeground(Color.BLACK);
    
    tester2.setFont(f1);

    //
    
	tester3 = new JButton("Image(s)");
	
	tester3.setBackground(Color.PINK);
    
    tester3.setForeground(Color.BLACK);
    
    tester3.setFont(f1);
    
    //
    
    userField = new JTextField (7);   
	
	userField.setBackground(Color.WHITE);
	
	userField.setForeground(Color.RED);
	
	userField.setFont(s1);

	//
	
	tester4 = new JButton("Thoughts...");

	tester4.setBackground(Color.PINK);

	tester4.setForeground(Color.BLACK);

	tester4.setFont(s1);
	
    add(tester1);
    
    tester1.addActionListener(this);
     
    add(tester2);
    
    tester2.addActionListener(this);  
    
    add(tester3);
    
    tester3.addActionListener(this);

	add(tester4);

	tester4.addActionListener(this);
	
	add(userField);
	
	userField.addActionListener(this);
}


    
//method to change background color////////////////////////////////
public void changeBackgroundColor() 
{	
    int red = Math.abs(new_random.nextInt()) % 256;
    
    int green = Math.abs(new_random.nextInt()) % 256;
    
    int blue = Math.abs(new_random.nextInt()) % 256;
    
    setBackground(new Color(red, green, blue));
    
}
////////////////////////////////////////////////////////////////////




//Method to get a random image from the array
private Image getRandomImage(Image[] images)
{
	int index = new_random.nextInt(images.length);
    
	return images[index];
}
/////////////////////random image method




////////////////////////////////////////////////////////////////////
public void thickPen(Graphics g)
{
    Dimension d = getSize();

    int x = d.width / 2;
    
    int y = d.height / 2;

    randNum = (Math.abs(new_random.nextInt(1, 20)));

    int DL = 1;
    int TL = 0;

    if (randNum < 11) {
    	
        while (TL < randNum) {
            g.setColor(Color.red);
            g.drawLine(x - d.width/2, y + 200, x + d.width/2, y + 200);
            TL++;
        }
        
    } else {
    	
        while (DL < randNum)
        {
            g.setColor(Color.red);
            g.drawLine(x - d.width/2, y + 200, x + d.width/2, y + 200);
            DL++;
            y = y + 1;
        }
    }

}
////////////////////////////////////////////////////////////////////


//method for picture//////////////////////////////////////////////////////////////////
public void picture(Graphics g)
{
	Dimension d = getSize();

	int centerX = d.width/2; 
				
	int centerY = d.height/2;
	
	//
				
	g.setColor(Color.black);
	
	g.fillArc (centerX-10, centerY-20, 5, 5, 0, 360); //eye
	
	g.setColor(Color.white);
		
 	g.fillOval(centerX-10, centerY-50, 10, 30); //bunny ear L
	 	
 	g.fillOval(centerX-4, centerY-50, 10, 30); //bunny ear R
		
	g.fillOval (centerX-40, centerY-30, 50, 30); //head
		
	g.fillOval(centerX-25, centerY-10, 50, 50); //torso
	
	g.fillOval (centerX, centerY, 60, 80); //body
	
	g.fillOval (centerX+50, centerY+45,15,30); //cotton tail
	
	g.fillOval (centerX-5, centerY+35, 30, 40); //bunny thigh REAR
	
	g.fillOval (centerX-25, centerY+70, 40, 10); // lil bunny foot REAR
		
	g.fillRect(centerX-20, centerY+20, 10, 30); //lil bunny FRONT leg
	
	g.fillOval(centerX-30, centerY+40, 20, 10); //lil bunny front paw
	
}
//method for picture//////////////////////////////////////////////////////////////////


//method for button 3///////////////////////////////////////////////////////////////
public void errorMessage(Graphics g)
{
	Dimension d = getSize();
	
	int randomErrorNum = Math.abs(new_random.nextInt(1, 5));
	
	//
	
	switch (randomErrorNum)
	{
	case 1: g.drawString ("error1: input # from 1 - 10.", d.width/2 -100, d.height -120);
	break;
	
	case 2: g.drawString ("error2: please enter a number from 1 - 10.", d.width/2 -110, d.height -120);
	break;
	
	case 3: g.drawString ("error3: acceptable number range is: 1 - 10.", d.width/2 -110, d.height -120);
	break;
	
	case 4: g.drawString ("error4: please use only numbers, 1 - 10.", d.width/2 -110, d.height -120);
	break;
	
	case 5: g.drawString ("error5: Only #s from 1 - 10 will work.", d.width/2 -110, d.height -120);
	break;
	}
	
	
}
//method for button 3///////////////////////////////////////////////////////////////



/////////////////////////////method for image selection////////////////////////////////////
public void images(Graphics g)
{
	 imagePrintNumber = userInteger; 
	 
	 int randomx = Math.abs(new_random.nextInt(10, 500));
	 
	 int randomy = Math.abs(new_random.nextInt(10, 500));
	 
 
	 for (int i = 0; i <= userInteger; i++)
	 {
		 Image randomImg = getRandomImage(imageArray);
		 
		 g.drawImage(randomImg, randomx, randomy, 100, 100, this);
	 }
}
///////////////////////////method for image selection//////////////////////////////////////


///////////////////////////////////ACTION////////////////////////////////////////
@Override
public void actionPerformed(ActionEvent ae) {

Object source = ae.getSource();

try {  
userInteger = Integer.parseInt(userField.getText());
} catch (NumberFormatException x) {
userInteger = 0;
}

// Check which button was pressed
if (source == tester1) {
buttonNumber = 1;
} else if (source == tester2) {
buttonNumber = 2;
} else if (source == tester3) {
buttonNumber = 3;
} else if (source == tester4) {
buttonNumber = 4;
}
}
///////////////////////////////////ACTION////////////////////////////////////////



	
/////////////////////////////GRAPHICS G//////////////////////////////////////////////////	
@Override

public void paintComponent(Graphics g) 
{
	super.paintComponent(g);
    
    Dimension d = getSize();
    
    int x = d.width/2;
    int y = d.height/2;
    
   
    userIntegerValue = ("user Integer = " + userInteger);
    g.drawString(userIntegerValue, d.width - 130, 80);
	
	//BUTON1///////////////////////////////////////
	tester1.setSize(d.width/4, 50);
	tester1.setLocation(10, 10);
	//////////////////////////////////////////////
	
	//BUTON2///////////////////////////////////////
	tester2.setSize(d.width/4, 50);
	tester2.setLocation(d.width - 150, 10);
	//////////////////////////////////////////////
	
	//BUTON3///////////////////////////////////////
	tester3.setSize(d.width/4, 50);
	tester3.setLocation(10, d.height -60);
	//////////////////////////////////////////////
	
	//BUTON4///////////////////////////////////////
	tester4.setSize(d.width/4, 50);
	tester4.setLocation(d.width -150, d.height -60);
	//////////////////////////////////////////////
	
//////////TEXT BOX/////////////////////////////////
	userField.setSize(100, 50);
	userField.setLocation(d.width/2 - 50, 100 );
//////////////////////////////////////////////////
	
	switch (buttonNumber)
	{
	case 1: changeBackgroundColor();
	break;
	
	case 2:     	
		picture (g);
		thickPen(g); 
	break;
	
	case 3:     {
    	if (userInteger > 0 && userInteger < 11) 
	    {   
	        for (int i2 = 1; i2 < userInteger; i2++) 
	        {
	        	images(g);
	        }
	        
	    } else {
	    	
	        errorMessage(g);
	        thickPen(g);
	    }
        
    }
	    
	break;

	
	case 4: g.drawString ("This project was a Doozy !", x - d.width/8, y);
	break;
	
	default:
	}
	
}
//////////////////////////////GRAPHICS/////////////////////////////////////////////


	//////////////////////////////MAIN///////////////////////////////////
	public static void main(String[] args) 
	{    
	    JFrame frame = new JFrame("CST 120 - JAVA - Lab 10");
	    
	    ErkanRijosSLab10 panel = new ErkanRijosSLab10();
	    
	    panel.button1();

	    frame.add(panel);
	    
	    frame.setBackground(new Color(
	    		
	    		Math.abs(new_random.nextInt() % 256), 
	    		Math.abs(new_random.nextInt() % 256), 
	    		Math.abs(new_random.nextInt() % 256)));

	    frame.setForeground(Color.white);
	    
	    frame.setSize(600, 600);
	    
	    frame.setVisible(true);
	    
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
