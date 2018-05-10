import java.util.TreeMap;


public class ArabicToRoman {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public final static String toRoman(int number) {
        int lessOrEqualNumber = map.floorKey(number);
        if (number == lessOrEqualNumber) {
            return map.get(number);
        }
        return map.get(lessOrEqualNumber) + toRoman(number - lessOrEqualNumber);
    }
}

