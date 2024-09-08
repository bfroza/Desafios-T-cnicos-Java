import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Valor de ohms a ser convertido (formato 'valor ohms' -> '47 ohms'): ");
            String resistor = scanner.nextLine().trim();

            if (!resistor.toLowerCase().endsWith(" ohms")) {
                System.out.println("Erro: Escreva no formato sugerido.");
                continue;
            }

            try {
                String result = ResistorCodeConverter.resistorCode(resistor);
                System.out.println("Sequência de cores: " + result);
                break;  
            } catch (Exception e) {
                System.out.println("Erro: Valor inválido. Tente novamente.");
            }
        }
        scanner.close();
    }
}
