public class Main {
    public static void main(String[] args) {


    }

    void formatCell(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {

    }

    public static void formatCell(byte properties) {
        //bitflags
        //00000001 (1) - a
        //00000010 (2) - b

    }

}

        9 - underline
        1 - bold
        2 - allcaps



        9 ->    00001001
        1 ->    00000001
        9|1->   00001001
        2 ->    00000010
        9|1|2-> 00001011


4 - italics
8 - align center

        4 ->   00000100
        8 ->   00001000
        4|8 -> 00001100