package by.it.kasarab.kasarab_l01;

class TaskC {
    public static void main(String[] args) {

     /*   byte i = 0;
        do {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");

            String octal = Integer.toOctalString(i);
            if (octal.length() > 8) octal = octal.substring(octal.length() - 8);
            octal = String.format("%8s", octal).replace(" ", "0");

            String hex = Integer.toHexString(i);
            if (hex.length() > 8) hex = hex.substring(hex.length() - 8);
            hex = String.format("%8s", hex).replace(" ", "0");

            System.out.printf("%8s %8s %8s %4d \n", binary, octal, hex, i);
        } while (-1 != i++);  */




       /* for (byte i=0; i<10; i++) {

        }

        byte i = 0;
        while (i<10){

            i++;
        } */


/*текст ніже напісан татьяной касараб*/

    for (byte i= -128; i< 127;i++){
    String binary = Integer.toBinaryString(i);
    if (binary.length()>8) binary=binary.substring(binary.length()-8);
    binary=String.format("%8s", binary).replace(" ", "0");

    String hex = Integer.toHexString(i);
    if (hex.length()>8) hex=hex.substring(hex.length()-8);
    hex=String.format("%8s", hex).replace(" ", "0");

    String octal = Integer.toOctalString(i);
    if (octal.length()>8) octal=octal.substring(octal.length()-8);
    octal=String.format("%8s", octal).replace(" ", "0");


            System.out.printf("%8s ", binary, i);
            System.out.printf("%8s ", octal, i);
        System.out.printf("%8s   %4d  %n", hex, i);

    }
        for (byte i = 127; ; ) {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");

            String hex = Integer.toHexString(i);
            if (hex.length() > 8) hex = hex.substring(hex.length() - 8);
            hex = String.format("%8s", hex).replace(" ", "0");

            String octal = Integer.toOctalString(i);
            if (octal.length() > 8) octal = octal.substring(octal.length() - 8);
            octal = String.format("%8s", octal).replace(" ", "0");

            System.out.printf("%8s ", binary, i);
            System.out.printf("%8s ", octal, i);
            System.out.printf("%8s   %4d  %n", hex, i);
            return;
        }
    }
}
