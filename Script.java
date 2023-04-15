import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter all the numbers, separetd with commas Ej: 1,2,3,4,5 ");
        String numbers = scan.nextLine();
        scan.close();
        System.out.println("\nIngresaste: [" + numbers + "]");

        // Make the input string a valid array to iterate.
        String[] lista = numbers.split(",");
        Integer oddSum = 0;
        Integer evenSum = 0;
        Integer evenCount = 0;
        for (String number : lista) {
            if (Integer.parseInt(number) % 2 == 0) {
                // It's even.
                evenCount++;
                evenSum += Integer.parseInt(number);
            } else {
                oddSum += Integer.parseInt(number);
            }
        }
        System.out.println("\nSuma números impares: " + oddSum.toString());
        double avgEvens = (evenCount == 0) ? 0 : (evenSum / evenCount);
        System.out.println("Promedio números pares: " + avgEvens + "\n");

    }
}