public class practice3 {
    /*
        static int printNumber(int num){
            if(num==0){
                return 0;
            }else {
                System.out.println(num);
                return printNumber(num-1);
            }
        }


        public static void main(String[] args) {
            System.out.println(printNumber(10));
        }


    static String printAt(String str) {

        if (str.length() <= 1) {
            return str;
        }
            return str.charAt(0) + "@" + printAt(str.substring(1));
        }


    public static void main(String[] args) {
        System.out.println(printAt("hello"));
    }

    static int speedRacer(int speed, boolean isHoliday) {
        while (!isHoliday) {
            if (speed <= 60) {
                return 0;
                break;
            } else if (speed >= 61 && speed <= 80) {
                return 100;
                break;
            } else {
                return 200;
                break;
            }
        }
        while (isHoliday) {
            if (speed <= 65) {
                return 0;
                break;
            } else if (speed >= 66 && speed <= 80) {
                return 100;
                break;
            } else {
                return 200;
                break;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(speedRacer(65,true));
        System.out.println(speedRacer(86,false));
    }

    static boolean twoSumOne(int a, int b, int c){
        if (a + b == c || a + c == b || b + c == a){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(twoSumOne(1,2,3));
        System.out.println(twoSumOne(3,1,2));
        System.out.println(twoSumOne(3,2,2));
    }


    static boolean isOrdered(int a, int b, int c, boolean opt) {
        if (opt) {
            if (c > b && c > a) {
                return true;
            } else {
                return false;
            }
        } else {
            if (b > a && c > b) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isOrdered(1, 2, 4, false)); // true
        System.out.println(isOrdered(1, 2, 1, false)); // false
        System.out.println(isOrdered(1, 1, 2, true)); // true
    }


    static boolean isCool(int num){
        if(num%11==0 || num%11==1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isCool(22)); // true
        System.out.println(isCool(23)); // true
        System.out.println(isCool(24)); // false
    }


    static String secomDalcom(int n){
        if(n%3==0 && n%5==0){
            return "새콤달콤";
        }else if(n%3==0){
            return "새콤";
        }else if (n%5==0) {
            return "달콤";
        }else{
            return n + "!";
        }

    }

    public static void main(String[] args) {
        System.out.println(secomDalcom(5)); // 달콤
        System.out.println(secomDalcom(3)); // 새콤
        System.out.println(secomDalcom(11)); // 11!

    }

    static int sumUnique(int a, int b, int c){
        if(a!=b && a!=c && b!=c){
            return a+b+c;
        } else if (a==b && b!=c && a!=c) {
            return c;
        } else if (a==c && b!=c && a!=b) {
            return b;
        } else if (a==b && b==c) {
            return 0;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumUnique(1,2,3));
        System.out.println(sumUnique(3,2,3));
        System.out.println(sumUnique(3,3,3));
    }


    static String repeatChar(String sentence){
        String result = "";

        for(int i = 0; i < sentence.length(); i++){
            char theChar = sentence.charAt(i);
            result += String.valueOf(theChar) + (theChar);
        }
        return result;
    }

    static int printNumber(int num) {
        if (num == 0) {
            return 0;
        }else {
            System.out.println(num);
            return printNumber(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(printNumber(10));
    }

    static int printNumber(int num){
        if(num==0){
            return 0;
        } else {
            System.out.println(num);
            return printNumber(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(printNumber(10));
    }


    static String printAt(String str){
        if(str.length()<=1){
            return str;
        }
        return str.charAt(0) + "@" + printAt(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(printAt("hello"));
    }


    public static void main(String[] args) {
        String a = "Hello World!";
        System.out.println(a.substring(3,7));
    }
*/
    static String printAt(String str){

        int i=0;
        String result = "";
    }


}

