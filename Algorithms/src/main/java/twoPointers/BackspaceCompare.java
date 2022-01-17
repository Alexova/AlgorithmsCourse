package twoPointers;

/**
 * Each # symbol is treated like backspace, so "xyz##" is x and "p#x" is x;
 */
class BackspaceCompare {

    public static boolean compare(String str1, String str2) {
        int p1 = str1.length() - 1;
        int p2 = str2.length() - 1;
        while (p1 >= 0 && p2 >= 0){
            p1 = findNext(str1, p1);
            p2 = findNext(str2, p2);
            if(p1 < 0 || p2 < 0 || str1.charAt(p1) != str2.charAt(p2)){
                return false;
            } else {
                p1--;
                p2--;
            }
        }
        return true;
    }

    private static int findNext(String string, int index) {
        int count = 0;
        while (string.charAt(index - count) == '#'){
            count ++;
        }
        return index - count * 2;
    }
}