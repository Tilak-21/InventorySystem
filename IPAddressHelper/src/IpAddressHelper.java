//Name: Tilak K Chudasama
//Date: 02/11
// Program: IP Address Converter

public class IpAddressHelper {
    public static void main(String[] args) {

        System.out.println(binaryStringToDottedDecimal("11111111111111111111111111111111"));

        System.out.println(dottedDecimalToBinaryString("80.16.0.1"));

    }


    public static String binaryStringToDottedDecimal(String binaryIPAddress) {
        int number1;
        int number2;
        int number3;
        int number4;
        int lengthOfString = binaryIPAddress.length();

        //Throws IllegalArgumentException if the length of binary digits is not 32
        if (lengthOfString != 32){
            throw new IllegalArgumentException("The String is not 32 char. long. Try again!");

        }
        else {
            //Uses substrings
            String word1 = binaryIPAddress.substring(0, 8);
            String word2 = binaryIPAddress.substring(8, 16);
            String word3 = binaryIPAddress.substring(16, 24);
            String word4 = binaryIPAddress.substring(24, 32);

            number1 = Integer.parseInt(word1, 2);
            number2 = Integer.parseInt(word2, 2);
            number3 = Integer.parseInt(word3, 2);
            number4 = Integer.parseInt(word4, 2);

        }

        //return statement for string
        return number1 + "." + number2 + "." + number3 + "." + number4;

    }

    public static String dottedDecimalToBinaryString(String dottedIPAddress) {                                                                                                                                                                   
        //gets the index of each dot
        int index1 = dottedIPAddress.indexOf('.');
        int index2 = dottedIPAddress.indexOf('.',index1+1);
        int index3 = dottedIPAddress.indexOf('.',index2+1);


        //uses that index to figure out where to snip the substring
        String word1 = dottedIPAddress.substring(0, index1);
        String word2 = dottedIPAddress.substring(index1+1, index2);
        String word3 = dottedIPAddress.substring(index2+1, index3);
        String word4 = dottedIPAddress.substring(index3+1);


        //converts string int then converting it to binary.
        String w1 = Integer.toBinaryString(Integer.parseInt(word1));
        String correctedW1 = checkLengthPerByte(w1);
        String w2 = Integer.toBinaryString(Integer.parseInt(word2));
        String correctedW2 = checkLengthPerByte(w2);
        String w3 = Integer.toBinaryString(Integer.parseInt(word3));
        String correctedW3 = checkLengthPerByte(w3);
        String w4 = Integer.toBinaryString(Integer.parseInt(word4));
        String correctedW4 = checkLengthPerByte(w4);

        String Mainword = correctedW1 + correctedW2 + correctedW3 + correctedW4;


        //This returns a proper 32 bit string.
        return Mainword;
    }

    //This method is used to correct the leading zero problems, and add 0 in front when needed.
    public static String checkLengthPerByte(String incoming){
        if(incoming.length() == 1){
            return "0" + "0" + "0" +"0" + "0" + "0" + "0" + incoming;
        }
        else if (incoming.length() == 2) {
            return "0" + "0" + "0" + "0" + "0" + "0" + incoming;
        }
        else if (incoming.length() == 3) {
            return "0" + "0" + "0" + "0" + "0" + incoming;
        }
        else if (incoming.length()== 4){
            return "0" + "0" + "0" + "0" + incoming;
        }

        else if(incoming.length() == 5){
            return "0" + "0" + "0" + incoming;
        }
        else if (incoming.length() == 6) {
            return "0" + "0" + incoming;
        }
        else if (incoming.length() == 7) {
            return "0" + incoming;
        }
        else if (incoming.length()== 8){
            return incoming;
        }
        else {
            return "NIL";
        }
    }

}