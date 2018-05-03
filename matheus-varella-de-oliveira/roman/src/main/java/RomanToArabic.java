import java.util.TreeMap;

public class RomanToArabic {


    private final static TreeMap<String, Integer> mapRoman = new TreeMap<String, Integer>();

    static {
        mapRoman.put("X", 10);
        mapRoman.put("IX", 9);
        mapRoman.put("V", 5);
        mapRoman.put("IV", 4);
        mapRoman.put("I", 1);
    }

    public int toArabicTranslate(String romanNumber) {
        int lastPosition = romanNumber.length() - 1;
        int arabicNumberResult = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            String currentSymbol = "";
            int currentValue = mapRoman.get(Character.toString(romanNumber.charAt(i)));
            if (i == lastPosition) {
                arabicNumberResult += currentValue;
            } else {
                int nextValue = mapRoman.get(Character.toString(romanNumber.charAt(i+1)));
                if (currentValue < nextValue) {
                    currentSymbol += Character.toString(romanNumber.charAt(i)) + Character.toString(romanNumber.charAt(i + 1));
                    arabicNumberResult += mapRoman.get(currentSymbol);
                    i += 1;
                } else {
                    arabicNumberResult += mapRoman.get(Character.toString(romanNumber.charAt(i)));
                }
            }
        }
        return arabicNumberResult;
    }
}