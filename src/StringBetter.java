public class StringBetter {
    public static <T> T betterString(T s1, T s2, TwoElementPredicate<T> p) {
        if (p.isBetter(s1, s2)) {
            return s1;
        }
        else return s2;
    }


}
