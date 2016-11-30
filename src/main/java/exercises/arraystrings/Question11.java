package exercises.arraystrings;

/**
 * Created by adrian on 11/22/2016.
 */
public class Question11 {
    public static boolean hasUniqueChars(final String s) {
        boolean[] charOccurs = new boolean[Character.MAX_VALUE];

        for(final Character c : s.toCharArray()) {
            if(charOccurs[c]) return false;
            charOccurs[c] = true;
        }

        return true;
    }
    public static boolean hasUniqueChars2(final String s) {
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)) return false;
            }
        }

        return true;
    }
}
