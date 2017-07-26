package converter;

/**
 * Используется для конвертации переменных
 */
public class Converter {
    /**
     *Конвертирует переменную введенную с клавиатуры в число
     * @param variable
     * @return
     */
    public static int convertStringToInt(String variable) {
        return Integer.parseInt(variable);
    }

    /**
     *Конвертирует переменную введенную с клавиатуры в дробное число
     * @param variable
     * @return
     */
    public static double convertStringToDouble(String variable) {
        return Double.parseDouble(variable);
    }

    /**
     *Конвертирует дробное число в стринг
     * @param variable
     * @return
     */
    public static String convertDoubleToString(double variable) {
        return Double.toString(variable);
    }
}
