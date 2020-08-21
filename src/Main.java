import java.math.BigInteger;
import java.util.Random;
import java.util.Arrays;
import static java.lang.System. *;
//fuck
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

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for(int i = 0; i < analyzers.length; ++i){
            if(analyzers[i].processText(text) != Label.OK)
                return analyzers[i].processText(text);
        }
        return Label.OK;
    }

    public static double sqrt(double x) {
        if(x < 0)
            throw new java.lang.IllegalArgumentException("Expected non-negative number, got " + x);
        return Math.sqrt(x);
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = new Throwable().getStackTrace();
        if (ste.length < 3) {
            return null;
        } else {
            return ste[2].getClassName() + "#" + ste[2].getMethodName();
        }
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection rc = robotConnectionManager.getConnection()) {
                rc.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) throw e;
            }
        }
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

//        byte[] x = new byte[]{65,66,67,68,69,70,71};
//        AsciiCharSequence myX = new AsciiCharSequence(x);
//        System.out.println(myX.length());
//        System.out.println(myX.charAt(3));
//        System.out.println(myX.subSequence(3,5));
//        System.out.println(myX.toString());
//
//        x[1] = 65;
//        System.out.println(myX.toString());
//
//        Integer i = new Integer("1");
//
//        Object test = new Integer("1");
//       //out.println(test instanceof firstTask);
//        out.println(i.equals(test) + " " + (i.hashCode() == test.hashCode()));

// инициализация анализаторов для проверки в порядке данного набора анализаторов
//        String[] spamKeywords = {"spam", "bad"};
//        int commentMaxLength = 40;
//        TextAnalyzer[] textAnalyzers1 = {
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers2 = {
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers3 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers4 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords)
//        };
//        TextAnalyzer[] textAnalyzers5 = {
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers6 = {
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords)
//        };
//        // тестовые комментарии
//        String[] tests = new String[8];
//        tests[0] = "This comment is so good.";                            // OK
//        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
//        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
//        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
//        tests[4] = "This comment is so bad....";                          // SPAM
//        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
//        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
//        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
//        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
//                textAnalyzers4, textAnalyzers5, textAnalyzers6};
//        Main testObject = new Main();
//        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
//        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
//        for (String test : tests) {
//            numberOfAnalyzer = 1;
//            System.out.print("test #" + numberOfTest + ": ");
//            System.out.println(test);
//            for (TextAnalyzer[] analyzers : textAnalyzers) {
//                System.out.print(numberOfAnalyzer + ": ");
//                System.out.println(testObject.checkLabels(analyzers, test));
//                numberOfAnalyzer++;
//            }
//            numberOfTest++;
//        }
//        System.out.println(sqrt(4.0));
//        try {
//            System.out.println(sqrt(-4.0));
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }

    }
}
