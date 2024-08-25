import javax.swing.*;                                               //IMPORTED LIBRARIES
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener{
                                                                    //DECLARING AND INITIALIZING
JFrame frame;
JTextField textfield;
JButton[] numberButtons = new JButton[10];
JButton[] functionButtons = new JButton[9];
JButton addButton,subButton,mulButton,divButton;
JButton decButton,equButton,delButton,clrButton,negButton;
JPanel panel;

Font myfont = new Font("AREAL",Font.BOLD,30);             //CREATEING FONT

double num1=0,num2=0,result=0;
char operator;//used char as + is a symbol(special char) not an int, by type conversion we can use it for calculation directly
                        
    calculator(){                                                   //constructor
        //CREATING FRAME 
        frame = new JFrame("calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        //CREATING text field
        textfield = new JTextField();
        textfield.setBounds(50,25,300,50);
        textfield.setFont(myfont);
        textfield.setEditable(false);

                                                                    //initilizing function buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("delete");
        clrButton = new JButton("clear");
        negButton = new JButton("(-)");
                                                                    //applying value of functionbuttons array
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;
                                                                    //loop for function buttons
        for(int i=0;i<9;i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myfont);
            functionButtons[i].setFocusable(false);
        }

                                                                    /*loop for number buttons//
                                                                    as numberbuttons are anonimus we can initialize and set apperance
                                                                    Through single for loop*/
        for(int i = 0;i<10;i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myfont);
            numberButtons[i].setFocusable(false);
        }
                                                                    //setting bounds of delete/clear/negative button seperately
        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);
        
                                                                    //creating panel
        panel = new JPanel();   
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.gray);
                                                                    //adding buttons on pannel 
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

                                                                    //adding the panel obj in main frame
        frame.add(panel);
                                                                    //adding textfield and del/clr/neg buttons outside the panel's scope
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setFocusable(false);//(set it so the frame window does not get the user keyboard input)
        frame.setVisible(true);//setting visibility to view the actual panel
    }
                                                                    //MAIN FUNCTION                
    public static void main(String[] args) {
        
        calculator calc = new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                                                                    //forloop to fetch numbers as a string
        for(int i=0;i<10;i++){
            if(e.getSource() == numberButtons[i]){
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
                                                                    //fetching various function operators and type converting them
        if(e.getSource() == decButton){                             
            textfield.setText(textfield.getText().concat(String.valueOf(".")));
        }

        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");       
         }

         if(e.getSource() == subButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");       
         }
         if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");       
         }
         if(e.getSource() == divButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");       
         }
                                                                        //setting equal's parameters
         if(e.getSource() == equButton){
            num2 = Double.parseDouble(textfield.getText());
                                                                        //conditions in accordance for input
            switch(operator){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textfield.setText(String.valueOf(result));                  //displaying result
            num1 = result; //setting num1 as result so further operations can be performed
         }

         if(e.getSource() == clrButton){                                //function of clear     
            textfield.setText(null);
         }

         if(e.getSource() == delButton){                                //function of delete
            String string = textfield.getText();
            textfield.setText(null);
            for(int i=0;i<string.length()-1;i++){
                textfield.setText(textfield.getText()+string.charAt(i));
            }
         }

        if(e.getSource() == negButton){                                 //negative value operation function
            double temp = Double.parseDouble(textfield.getText());//type conversion
            temp *= -1;//converting the string(number) to negative
            textfield.setText(String.valueOf(temp));//displaying that number
        }
    }
}