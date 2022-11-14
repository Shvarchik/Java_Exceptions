public class Sem1HT1 {

    public static int div (int a, int b) {
        return a/b;                                 // / by zero
    }
    private static int intFromString(String s) {
        return Integer.parseInt(s);                // NumberFormatException
    }


    public static void methodArrayOutOfBound(String s) {
        
        char [] signes = new char[s.length()];
        for (int i = 0; i <= signes.length; i++){     //  StringIndexOutOfBoundsException
            signes[i] = s.charAt(i);
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = a-a;
        //int n = div(a,b);                              
        //System.out.println(n);
        String s = "123456hgf";
        methodArrayOutOfBound(s);
        System.out.println(intFromString(s));
    }

}
