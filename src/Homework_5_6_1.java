public class Homework_5_6_1 {
    public static void main(String[] args) {
        int myInt = 2_147_483_647; //-2_147_483_648
        byte myBite = 127; // -128
        short myShort = 327_67; //-327_68
        long myLong = 9_223_372_036_854_775_807L; //9_223_372_036_854_775_808L
        float myFloat = 3.4e38f; // -3.4e38f
        double myDouble = 1.7e308; // -1.7e308
        boolean myBoolean = true; // false
        char myChar = 'a'; //Символьный char
        int inChar = myChar - '0'; // ответ - 49
        char myChar2 = 49;
        char convertChar = (char) ('0'+myChar2); // ответ - a
    }
}
