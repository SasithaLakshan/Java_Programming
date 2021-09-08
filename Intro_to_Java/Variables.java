//Variables in Java

package Intro_to_Java;

public class Variables {
    public static void main(String[] args) {

        //naming rules in JAVA
        int age = 25;//valid
        int AGE = 24;//valid
        int _age = 24;//Valid but not recommnded
        int $age = 25;//Valid but not recommnded

        System.out.println(age);
        System.out.println(AGE);
        System.out.println(_age);
        System.out.println($age);

        //Integers
        int a = 10;
        int b = 20;
        int c = 30;
        
        System.out.println(a + " " +  b  + " "+ c);
        
        //floats(Remember to add 'f' to end of the number. otherwise it will take as a double)
        float d = 2.5f;
        float e = 3.4f;
        float f = 4.2f;
        
        System.out.println(d + " " + e + " " + f);
        
        //doubles
        double g = 2.4;
        double h = 1.2;
        double i = 2.2;

        System.out.println(g + " " + h + " " + i );

        //chars
        char j = 'H';
        char k = 'S';
        char l = 'A';

        System.out.println(j + " " + k + " " + l);

        //strings
        String m = "Hello,";
        String n = "I'm Sasitha";
        String o = "and am learning JAVA :)";

        System.out.println(m + " " + n + " " + o);

        //booleans
        boolean p = false;
        boolean q = true;

        System.out.println(p + " " + q);
    }
}
