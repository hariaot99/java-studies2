import java.util.Arrays;

public class App {

    public static boolean isAnagram(String a, String b) {
        char charA[] = a.toLowerCase().toCharArray();
        char charB[] = b.toLowerCase().toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);
        System.out.println(Arrays.toString(charA));
        System.out.println(Arrays.toString(charB));
        if (a == null || b == null) {
            return false;
        } else if (a.length() != b.length()) {
            return false;
        } else
            return Arrays.equals(charA, charB);
    }

    public static String reverseString(String a) {
        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);
        }
        return reverse;
    }

    public static void ex1(int a[]) {
        for (int i = 1; i < a.length; i++) {
            System.out.println("O quadrado de " + a[i] + " eh: " + Math.pow(a[i], 2));
        }
    }

    public static int ex2(int n) {
        int aux = 0;
        for (int i = 0; i < n; i++) {
            aux += i;
        }
        return aux;
    }

    public static void ex3(int n){
        int aux = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(aux+", ");
            aux += 2;
        }
    }
    public static void main(String[] args) {

        System.out.println("Eh um anagrama?" + isAnagram("Ola", "aLo"));
        System.out.println(reverseString("Haria"));
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        ex1(a);
        System.out.println("Ex 2... Resultado = " + ex2(30));
        ex3(42);
    }
}
