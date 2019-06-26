





import java.util.Arrays;
import java.lang.Math;
public class Binary {
    int[] num;  //in binary number
    int[] decimal;
    int decimal2;
    int[] binary; // binary table

   //builds binary table by length of num
    public Binary(int[]num){
        this.num = num;
        binary = new int[getBinLeng()];
        binary[getBinLeng() - 1] = 1;

        for(int i = getBinLeng() -2; i >= 0 ;i--){

           binary[i] = binary[i] + (binary[i+1]*2);

        }




    }



    public Binary(int decimal){


        this.decimal2 = decimal;




    }
//System[0] = 1, for(int i = 1; i<=getLeng - 1; i++){binary}
    int convertToDecimal(){
        int number = 0;
        boolean end = false;
        while(!end)


                for(int i = 0; i <= getBinLeng() - 1 ;i++){
                    if(num[i] == 1){
                        number=number + binary[i];

                    }
                    end = true;

                }




        return number;
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



    int[] convertToBinary(){
        int ostatak = 0;
        int index = 0;


         binary = new int[10];


        // counter for binary array
        int i = 0;
        while (decimal2 > 0)
        {
            // storing remainder in binary array
            binary[i] = decimal2 % 2;
            decimal2 = decimal2 / 2;
            i++;
        }

        int n = i;
        int[] b = new int[n];
        int j = n;
        for (int c = 0; c < n; c++) {
            b[j - 1] = binary[c];
            j = j - 1;
        }

        return b;
    }





    int getBinLeng(){

        return num.length;
    }





}
