public class Main {

    public static void main(String[] args) {
        for (int i = 1; i<= 20; i++) {
            System.out.println(i+"\t =\t "+ ArabicToRoman.toRoman(i));
        }
        Printer printerResult = new Printer();
        RomanToArabic romanToArabic = new RomanToArabic();
        printerResult.printerResult(romanToArabic.toArabicTranslate("X"));
        printerResult.printerResult(romanToArabic.toArabicTranslate("XI"));
        printerResult.printerResult(romanToArabic.toArabicTranslate("XIV"));
        printerResult.printerResult(romanToArabic.toArabicTranslate("XV"));
    }
}