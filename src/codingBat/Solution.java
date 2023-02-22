package codingBat;

public class Solution {

    public static void main(String[] args) {

    }


    public String notString(String str) {

//        if ( str.length() >= 3 && str.charAt(0) == 'n' && str.charAt(1) == 'o'
//                && str.charAt(2) == 't' ){
//            return str;
//        }
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }


    public int dateFashion(int you, int date) {

        if (you <= 2 || date <= 2)
            return 0;
        if (you >= 8 || date >= 8)
            return 2;
        return 1;
    }


    public boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend) {
            if (cigars >= 40)
                return true;
        } else {
            if (cigars >= 40 && cigars <= 60)
                return true;
        }
        return false;

    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if (noDoubles && die1 == die2 && die1 == 6)
            return die1 + 1;

        if (noDoubles && die1 == die2)
            return die1 + die2 + 1;

        return die1 + die2;
    }

    public boolean old35(int n) {

        if (n % 3 == 0 && n % 5 != 0 || n % 3 != 0 && n % 5 == 0)
            return true;
        return false;

    }

    public int sumLimit(int a, int b) { // 100 : 800 =>
        int sum = a+b;
        String strA = Integer.toString(a);
        String strSum = sum+"";

        if (strSum.length() > strA.length())
            return a;
        return sum;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

        if (equalOk){
            if (a <= b && b <= c)
                return true;
        } else {
            if (a < b && b < c)
                return true;
        }
        return false;

    }


}
