//Data Types in JAVA

package Intro_to_Java;

public class DataTypes {
    public static void main(String[] args) {
        //boolean type
        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag + " and " + flag2);

        //byte type
        byte range;
        byte range2;
        range = 123;
        range2 = 127;
        System.out.println(range + " and " + range2);

        //short type
        short temp;
        short temp2;
        temp = -200;
        temp2 = 150;
        System.out.println(temp + " and " + temp2);

        //int type
        int something = 0;
        int another = 999999999;
        System.out.println(something + " and " + another);

        //long type
        long range3 = -999999999999999999L;
        long range4 = 999999999999999999L;
        System.out.println("Maxium range of long is : " + range3 + " and " + range4);

        //double type
        double sum = 34.5;
        double sum2 = 445.3;
        System.out.println(sum + " and " + sum2);

        //float type
        float avg1 = 45.5f;
        float avg2 = 55.3f;
        System.out.println(avg1 + " and " + avg2);

        //char type
        char letter1 = '\u0051';
        char letter2 = '\u0056';
        char letter3 = '\u0045';
        System.out.println(letter1 + " and " + letter2 + " and " + letter3);

        //string type
        String name = "Sasitha";
        String surname = "Lakshan";
        System.out.println("Name : " + name + "\nSurname : " + surname);

    }
}
