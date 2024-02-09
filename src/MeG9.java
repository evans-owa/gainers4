public class MeG9 {
    public static void main(String[] args) {
        String s1 = "VanSe acUdemy";

        // calling Strings Methods in java

        // toUpperCase
        System.out.println(s1.toUpperCase());

        // toLowerCase

        String s2 = s1.toLowerCase();
        System.out.println(s2);

        //no modification of the original variable
        System.out.println(s1);


        // s1 length()
        int i = s1.length();   // store it into a integer variable i
        System.out.println(i);

        //isEmpty()
        //System.out.println(s1.isEmpty());

        //isBlank  this is a boolean method
        System.out.println(s1.isBlank());


        //charAt()
        char c = s1.charAt(12);
        System.out.println(c);

        //indexOf() lastIndexOf()
         //s1.indexOf('a');
        System.out.println(s1.indexOf('U'));
        System.out.println(s1.indexOf('a')); // get the index of the first a
        System.out.println(s1.lastIndexOf('a')); // gets the index of the last a

        //concat()
        //s1.concat("Jomba");

        String s13 =s1.concat(" Jomba");
        System.out.println(s13);
    }
}
