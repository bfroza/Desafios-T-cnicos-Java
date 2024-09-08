import java.util.HashMap;
import java.util.Map;

public class ResistorCodeConverter {
    public static String resistorCode(String value) {
        // Mapeamento de cores
        Map<Character, String> colorMap = new HashMap<>();
        colorMap.put('0', "preto");
        colorMap.put('1', "marrom");
        colorMap.put('2', "vermelho");
        colorMap.put('3', "laranja");
        colorMap.put('4', "amarelo");
        colorMap.put('5', "verde");
        colorMap.put('6', "azul");
        colorMap.put('7', "violeta");
        colorMap.put('8', "cinza");
        colorMap.put('9', "branco");

        value = value.replace(" ohms", "");

        double numericValue;
        if (value.contains("k")) {
            numericValue = Double.parseDouble(value.replace("k", "")) * 1000;
        } else if (value.contains("M")) {
            numericValue = Double.parseDouble(value.replace("M", "")) * 1000000;
        } else {
            numericValue = Integer.parseInt(value);
        }

        String numericStr = String.valueOf((int) numericValue);

        char firstDigit = numericStr.charAt(0);
        char secondDigit = numericStr.charAt(1);

        int multiplier = numericStr.length() - 2;
        String multiplierColor = colorMap.get((char) ('0' + multiplier));

        String toleranceColor = "dourado";

        return colorMap.get(firstDigit) + " " + colorMap.get(secondDigit) + " " + multiplierColor + " " + toleranceColor;
    }
}
