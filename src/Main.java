public class Main {
    public static void main(String[] args) {
        //1.1
        System.out.println("Задание №1.1");
        int salary = 0;
        int counter = 0;
        while (salary < 2_459_000) {
            salary += 15_000;
            counter++;
        }
        System.out.println("Месяц " + counter + ", сумма накоплений  " + salary + " рублей");

        //1.2
        System.out.println("Задание №1.2");
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //1.3
        System.out.println("Задание №1.3");
        int population = 12000000;
        int born = 17; // на 1000
        int dead = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + population / 1000 * born - population / 1000 * dead;
            System.out.println("Год " + i + ", численность населения  " + population);
        }
        System.out.println();

        double initialContribution = 15_000;
        int ratePerMonth = 7;

        //2.1
        System.out.println("Задание №2.1");
        double total = initialContribution;
        counter = 0;
        while (total < 12_000_000) {
            total *= 1 + (double) ratePerMonth / 100;
            counter++;
            System.out.printf("Месяц %d сумма накоплений равна %.2f рублей\n", counter, total);
        }
        System.out.println();

        //2.2
        System.out.println("Задание №2.2");
        total = initialContribution;
        counter = 0;
        while (total < 12_000_000) {
            total *= 1 + (double) ratePerMonth / 100;
            counter++;
            if (counter % 6 == 0) {
                System.out.printf("Месяц %d сумма накоплений равна %.2f рублей\n", counter, total);
            }
        }
        System.out.printf("Месяц %d сумма накоплений равна %.2f рублей\n", counter, total);
        System.out.println();

        //2.3
        System.out.println("Задание №2.3");
        total = initialContribution;
        for (int i = 1; i <= 108; i++) {
            total *= 1 + (double) ratePerMonth / 100;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d сумма накоплений равна %.2f рублей\n", i, total);
            }
        }
        System.out.println();

        //2.4
        System.out.println("Задание №2.4");
        int firstFridayOfMonth = 4;
        int friday = firstFridayOfMonth;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
        System.out.println();

        //3.1
        System.out.println("Задание №3.1");
        int currentYear = 2022;
        int bottomBorder = currentYear - 200;
        int upperBorder = currentYear + 100;
        for (int year = 0; year <= upperBorder; year += 79) {
            if (year >= bottomBorder) {
                System.out.println(year);
            }
        }
        System.out.println();

        //3.2
        System.out.println("Задание №3.2");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}