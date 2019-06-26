
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Window  {
     JFrame window = new JFrame();
    JLabel binaryToDecimalLabel =new JLabel();
     JTextField binary=new JTextField();
     JLabel toDecimal=new JLabel();
    JLabel decimalToBinary =new JLabel();
     JTextField Decimal=new JTextField();
    JLabel toBinary=new JLabel();
    JLabel info=new JLabel("Created by Ajaksmaniac");

    public Window(){
        window.setTitle("Binary Converter");

        window.setLayout(null);
        window.setVisible(true);
        window.setSize(300,500);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        run();
    }



    static int[] Int_to_array(int n)

    {

        int j = 0;

        int len = Integer.toString(n).length();

        int[] arr = new int[len];

        while(n!=0)

        {

            arr[len-j-1]=n%10;

            n=n/10;

            j++;

        }

        return arr;

    }
    void run(){



        window.add(binaryToDecimalLabel());
        window.add(binary());
        window.add(toDecimal());
        window.add(decimalToBinary());
        window.add(decimal());
        window.add(toBinary());
        window.add(info());
        window.pack();


    //Ovde doraditi


    }

    JLabel binaryToDecimalLabel(){
         binaryToDecimalLabel = new JLabel("Binary to decimal");
        binaryToDecimalLabel.setVisible(true);
        binaryToDecimalLabel.setLayout(null);
        binaryToDecimalLabel.setBounds(30,10,180,30);
        return binaryToDecimalLabel;

    }
     JTextField binary() {

         JTextField binary = new JTextField();

         binary.setVisible(true);
         binary.setLayout(null);
         binary.setBounds(30,40,90,30);
         binary.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {

                 int number = Integer.parseInt(binary.getText());
                 int[] intArray = Int_to_array(number);


                 int[] num = new int[intArray.length];


                 Binary binar = new Binary(intArray);
                 int converted = binar.convertToDecimal();
            toDecimal.setText(String.valueOf(converted));

             }
         });
         return binary;




     }



    JLabel toDecimal() {

        toDecimal.setBounds(170,40,90,30);
        toDecimal.setVisible(true);

        return toDecimal;


    }


    JLabel decimalToBinary(){
        decimalToBinary = new JLabel("Decimal to binary");
        decimalToBinary.setVisible(true);
        decimalToBinary.setLayout(null);
        decimalToBinary.setBounds(30,70,180,30);
        return decimalToBinary;

    }
    JTextField decimal() {
        JTextField decimal = new JTextField();
        decimal.setBounds(30,100,90,30);;
        decimal.setVisible(true);
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int number = Integer.parseInt(decimal.getText());


                Binary binar = new Binary(number);
                int[] converted = binar.convertToBinary();
                toBinary.setText(Arrays.toString(converted).replaceAll("\\[|\\]|,|\\s", ""));

            }
        });
        return decimal;


    }
    JLabel toBinary() {

        toBinary.setBounds(170,100,90,30);
        toBinary.setVisible(true);
        return toBinary;


    }
    JLabel info(){
        info.setBounds(120,430,180,30);
        return info;

    }

    int getBinary(){

        return Integer.parseInt(binary.getText());
    }

    int getToDecimal(){
        return Integer.parseInt(toDecimal.getText());
    }

    int getDecimal(){
        return Integer.parseInt(Decimal.getText());
    }

    int getToBinary(){
        return Integer.parseInt(toBinary.getText());
    }





    /*  JFrame window = new JFrame("Binary converter");
        GroupLayout layout = new GroupLayout(window);
        window.setVisible(true);


        //window.setLayout(layout);





        binary.setHorizontalAlignment();



*/
}
