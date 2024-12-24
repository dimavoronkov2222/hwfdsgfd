package org.example;
import java.util.Scanner;
public class Main {
    static class Shapes {
        public static class Triangle {
            public double area(double base, double height) {
                return 0.5 * base * height;
            }
        }
        public static class Rectangle {
            public double area(double width, double height) {
                return width * height;
            }
        }
        public static class Square {
            public double area(double side) {
                return side * side;
            }
        }
        public static class Rhombus {
            public double area(double diagonal1, double diagonal2) {
                return 0.5 * diagonal1 * diagonal2;
            }
        }
    }
    static class CurrencyConverter {
        private static final double USD_TO_EUR = 0.92;
        private static final double USD_TO_GBP = 0.75;
        private static final double USD_TO_JPY = 135.25;
        public double convertToEUR(double amount) {
            return amount * USD_TO_EUR;
        }
        public double convertToGBP(double amount) {
            return amount * USD_TO_GBP;
        }
        public double convertToJPY(double amount) {
            return amount * USD_TO_JPY;
        }
    }
    static class StringUtils {

        public boolean isPalindrome(String str) {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }
        public int countVowels(String str) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        }
        public int countConsonants(String str) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1) {
                    count++;
                }
            }
            return count;
        }
        public int countWordOccurrences(String str, String word) {
            int count = 0;
            int fromIndex = 0;
            while ((fromIndex = str.indexOf(word, fromIndex)) != -1) {
                count++;
                fromIndex += word.length();
            }
            return count;
        }
    }
    static class LengthConverter {
        public double toMillimeters(double meters) {
            return meters * 1000;
        }
        public double toCentimeters(double meters) {
            return meters * 100;
        }
        public double toDecimeters(double meters) {
            return meters * 10;
        }
        public double toKilometers(double meters) {
            return meters / 1000;
        }
    }
    static class WeightConverter {

        public double toMilligrams(double grams) {
            return grams * 1000;
        }
        public double toKilograms(double grams) {
            return grams / 1000;
        }
        public double toCentners(double kilograms) {
            return kilograms / 100;
        }
        public double toTons(double kilograms) {
            return kilograms / 1000;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Выберите задание:");
            System.out.println("1. Подсчет площади геометрических фигур");
            System.out.println("2. Конвертация валют");
            System.out.println("3. Работа со строками");
            System.out.println("4. Перевод длины");
            System.out.println("5. Перевод веса");
            System.out.println("0. Выход");
            System.out.print("Введите номер задания: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Подсчет площади геометрических фигур:");
                    System.out.println("1. Треугольник");
                    System.out.println("2. Прямоугольник");
                    System.out.println("3. Квадрат");
                    System.out.println("4. Ромб");
                    System.out.print("Введите номер фигуры: ");
                    int shapeChoice = scanner.nextInt();
                    if (shapeChoice == 1) {
                        System.out.print("Введите основание треугольника: ");
                        double base = scanner.nextDouble();
                        System.out.print("Введите высоту треугольника: ");
                        double height = scanner.nextDouble();
                        Shapes.Triangle triangle = new Shapes.Triangle();
                        System.out.println("Площадь треугольника: " + triangle.area(base, height));
                    } else if (shapeChoice == 2) {
                        System.out.print("Введите ширину прямоугольника: ");
                        double width = scanner.nextDouble();
                        System.out.print("Введите высоту прямоугольника: ");
                        double rectHeight = scanner.nextDouble();
                        Shapes.Rectangle rectangle = new Shapes.Rectangle();
                        System.out.println("Площадь прямоугольника: " + rectangle.area(width, rectHeight));
                    } else if (shapeChoice == 3) {
                        System.out.print("Введите сторону квадрата: ");
                        double side = scanner.nextDouble();
                        Shapes.Square square = new Shapes.Square();
                        System.out.println("Площадь квадрата: " + square.area(side));
                    } else if (shapeChoice == 4) {
                        System.out.print("Введите первую диагональ ромба: ");
                        double diagonal1 = scanner.nextDouble();
                        System.out.print("Введите вторую диагональ ромба: ");
                        double diagonal2 = scanner.nextDouble();
                        Shapes.Rhombus rhombus = new Shapes.Rhombus();
                        System.out.println("Площадь ромба: " + rhombus.area(diagonal1, diagonal2));
                    }
                    break;
                case 2:
                    System.out.println("Конвертация валют:");
                    System.out.print("Введите сумму в долларах: ");
                    double amount = scanner.nextDouble();
                    CurrencyConverter converter = new CurrencyConverter();
                    System.out.println("В евро: " + converter.convertToEUR(amount));
                    System.out.println("В фунтах: " + converter.convertToGBP(amount));
                    System.out.println("В йенах: " + converter.convertToJPY(amount));
                    break;
                case 3:
                    System.out.println("Работа со строками:");
                    scanner.nextLine();
                    System.out.print("Введите строку: ");
                    String str = scanner.nextLine();
                    StringUtils stringUtils = new StringUtils();
                    System.out.println("Палиндром: " + stringUtils.isPalindrome(str));
                    System.out.println("Количество гласных: " + stringUtils.countVowels(str));
                    System.out.println("Количество согласных: " + stringUtils.countConsonants(str));
                    System.out.print("Введите слово для подсчета вхождений: ");
                    String word = scanner.nextLine();
                    System.out.println("Количество вхождений слова: " + stringUtils.countWordOccurrences(str, word));
                    break;
                case 4:
                    System.out.println("Перевод длины:");
                    System.out.print("Введите длину в метрах: ");
                    double meters = scanner.nextDouble();
                    LengthConverter lengthConverter = new LengthConverter();
                    System.out.println("В миллиметрах: " + lengthConverter.toMillimeters(meters));
                    System.out.println("В сантиметрах: " + lengthConverter.toCentimeters(meters));
                    System.out.println("В дециметрах: " + lengthConverter.toDecimeters(meters));
                    System.out.println("В километрах: " + lengthConverter.toKilometers(meters));
                    break;
                case 5:
                    System.out.println("Перевод веса:");
                    System.out.print("Введите вес в граммах: ");
                    double grams = scanner.nextDouble();
                    WeightConverter weightConverter = new WeightConverter();
                    System.out.println("В миллиграммах: " + weightConverter.toMilligrams(grams));
                    System.out.println("В килограммах: " + weightConverter.toKilograms(grams));
                    System.out.println("В центнерах: " + weightConverter.toCentners(grams / 1000));
                    System.out.println("В тоннах: " + weightConverter.toTons(grams / 1000));
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }
}