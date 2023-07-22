package simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.println("Pilih operasi yang ingin Anda lakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                doAddition();
                break;
            case 2:
                doSubtraction();
                break;
            case 3:
                doMultiplication();
                break;
            case 4:
                doDivision();
                break;
            default:
                System.out.println("Maaf, pilihan yang Anda masukkan tidak valid.");
        }

        scanner.close();
    }

    public static void doAddition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama:");
        double num1 = scanner.nextDouble();

        System.out.println("Masukkan angka kedua:");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("Hasil penjumlahan: " + result);

        scanner.close();
    }

    public static void doSubtraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama:");
        double num1 = scanner.nextDouble();

        System.out.println("Masukkan angka kedua:");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.println("Hasil pengurangan: " + result);

        scanner.close();
    }

    public static void doMultiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama:");
        double num1 = scanner.nextDouble();

        System.out.println("Masukkan angka kedua:");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("Hasil perkalian: " + result);

        scanner.close();
    }

    public static void doDivision() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama:");
        double num1 = scanner.nextDouble();

        System.out.println("Masukkan angka kedua:");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Maaf, tidak dapat melakukan pembagian dengan angka 0.");
        } else {
            double result = num1 / num2;
            System.out.println("Hasil pembagian: " + result);
        }

        scanner.close();
    }
}
