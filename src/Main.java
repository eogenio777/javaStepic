import java.math.BigInteger;
import java.util.Arrays;
import static java.lang.System. *;

public class Main {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
       int count = 0;
       if(a){
           count++;
       }
       if(b){
           count++;
       }
       if(c){
           count++;
       }
       if(d){
           count++;
       }
       return count == 2;
    }

    public static boolean isPowerOfTwo(int value) {
        return java.lang.Integer.bitCount(Math.abs(value)) == 1;
    }

    public static int maxArrInt(int ... numbers){
        int max = numbers[0];
        for(int i = 0; i< numbers.length;++i){
            if(numbers[i]>max)
                max = numbers[i];
        }
        return max;
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder rev = new StringBuilder(text);
        rev.reverse();
        return text.equals(rev.toString());
    }

    public static BigInteger factorial(int value) {

        BigInteger result = BigInteger.ONE;
        //BigInteger result = new BigInteger("1");
        for(int i = 2; i <= value; ++i)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];

        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if (i > a1.length-1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        StringBuilder textString = new StringBuilder();

        for(int i = 0;i < roles.length;++i){
            result.append(roles[i] + ":" + "\n");
            for(int j = 0;j < textLines.length;++j){
                if(textLines[j].startsWith(roles[i] + ":")) {
                    textLines[j] = textLines[j].replaceFirst(roles[i] + ":", "");
                    result.append((j + 1) + ")" + textLines[j] + "\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {

//        String [] roles= {
//                "Городничий",
//                "Аммос Федорович",
//                "Артемий Филиппович",
//                "Лука Лукич"};
//        String [] textLines={
//                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
//                "Аммос Федорович: Как ревизор?",
//                "Артемий Филиппович: Как ревизор?",
//                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
//                "Аммос Федорович: Вот те на!",
//                "Артемий Филиппович: Вот не было заботы, так подай!",
//                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};//System.out.println(printTextPerRole(roles,textLines));


//        BigInteger bi = new BigInteger("1");
//        BigInteger bi2 = BigInteger.ONE;
//        bi = bi.multiply(new BigInteger("3"));
//        out.println(bi);

        byte[] x = new byte[]{65,66,67,68,69,70,71};
        AsciiCharSequence myX = new AsciiCharSequence(x);
        System.out.println(myX.length());
        System.out.println(myX.charAt(3));
        System.out.println(myX.subSequence(3,5));
        System.out.println(myX.toString());

        x[1] = 65;
        System.out.println(myX.toString());

        Integer i = new Integer("1");

        Object test = new Integer("1");
       //out.println(test instanceof firstTask);
        out.println(i.equals(test) + " " + (i.hashCode() == test.hashCode()));

    }
}
