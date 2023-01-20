public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");

        int saving = 15_000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + saving;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + "  рублей");
            month++;
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = i - 1;
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationCountry = 12_000_000;
        int birthRateThousand = 17;
        int deathRateThousand = 8;
        int yearsCounter = 1;
        int years = 2023;
        System.out.println("Год " + years + ", численность населения составляет " + populationCountry);
        while (yearsCounter <= 10) {
            years++;
            int birthRate = populationCountry * birthRateThousand / 1000;
            int deathRate = populationCountry * deathRateThousand / 1000;
            populationCountry = populationCountry + birthRate - deathRate;
            System.out.println("Год " + years + ", численность населения составляет " + populationCountry);
            yearsCounter++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int savingsAccount = 15_000;
        int percentageAccount = 7;
        int month = 1;
        while (savingsAccount <= 12_000_000) {
            savingsAccount = savingsAccount + savingsAccount * percentageAccount / 100;
            System.out.println("В " + month + " месяце сумма вклада составит " + savingsAccount + " рублей");
            month++;
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int savingsAccount = 15_000;
        int percentageAccount = 7;
        int month = 1;
        while (savingsAccount <= 12_000_000) {
            savingsAccount = savingsAccount + savingsAccount * percentageAccount / 100;
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяце сумма вклада составит " + savingsAccount + " рублей");
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int savingsAccount = 15_000;
        int percentageAccount = 7;
        int month = 1;
        int years = 9;
        while (month <= years * 12) {
            savingsAccount = savingsAccount + savingsAccount * percentageAccount / 100;
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяце сумма вклада составит " + savingsAccount + " рублей");
            }
            month++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFridayMonth = 2;
        while (firstFridayMonth <= 31) {
            System.out.println("Сегодня пятница, " + firstFridayMonth + "-е число. Необходимо подготовить отчет.");
            firstFridayMonth = firstFridayMonth + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int thisYear = 2023;
        int lastYear = thisYear - 200;
        int newYear = thisYear + 100;
        while (lastYear <= newYear) {
            if (lastYear % 79 == 0) {
                System.out.println(lastYear);
            }
            lastYear++;
        }
    }
}