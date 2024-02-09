//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte b1 = 4; // -126 , 127
        short s1 = 50; //  -32767, 32767
        int i1 = 100;  //  -2147483647,  2147483647
        long l1 = 999L;  // -9223372036854775807, -9223372036854775807

        System.out.println(b1-i1);
        System.out.println(s1-b1);
        System.out.println(i1-l1);

        System.out.println(s1);
        System.out.println(l1);
    }
}