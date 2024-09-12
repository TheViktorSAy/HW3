public class Main {
    public static void main(String[] args) {

        // Задание 1

        byte a = 100;
        System.out.println(a);

        short b = 10000;
        System.out.println(b);

        int c = 1000000;
        System.out.println(c);

        long d = 1000000000L;
        System.out.println(d);

        float e = 10f;
        System.out.println(e);

        double f = 11;
        System.out.println(f);

        // Задание 2

        float a1 = 27.12f;
        System.out.println(a1);

        long b1 = 987678965549L;
        System.out.println(b1);

        double c1 = 2.786;
        System.out.println(c1);

        short d1 = 569;
        System.out.println(d1);

        short e1 = -159;
        System.out.println(e1);

        int f1 = 27897;
        System.out.println(f1);

        byte g1 = 67;
        System.out.println(g1);

        // Задание 3

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheetsOfPaper = 480;
        int perStudentPaper = totalSheetsOfPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано "+ perStudentPaper + " листов бумаги");


        //Задание 4

        byte bottlePerMinute = 16 / 2;
        System.out.println( "Бутылок за 1 минуту "+ bottlePerMinute);

        short minutesInADay = 60 * 24;
        System.out.println("Минут в одном дне " +minutesInADay);

        int bottlesIn20Minutes = bottlePerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " бутылок");

        int bottlesIn1Day = bottlePerMinute * minutesInADay;
        System.out.println("За 1 день машина произвела " + bottlesIn1Day + " бутылок");

        int bottlesIn3Days = bottlePerMinute * minutesInADay * 3;
        System.out.println("За 3 дня машина произвела "+ bottlesIn3Days + " бутылок");

        int bottlesIn1Month = bottlePerMinute * minutesInADay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " бутылок");


        // Задание 5

        byte totalCansOfPaint = 120;
        byte forOneClassOfCansWhite = 2;
        byte forOneClassOfCansBrown = 4;
        int forOneClassOfCans = forOneClassOfCansWhite + forOneClassOfCansBrown;
        System.out.println("Банок на один класс " + forOneClassOfCans);

        int totalClasses = totalCansOfPaint / forOneClassOfCans;
        System.out.println("Всего классов " + totalClasses);

        int totalWhiteCans = forOneClassOfCansWhite * totalClasses;
        int totalBrownCans = forOneClassOfCansBrown * totalClasses;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задание 6

        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;

        int totalGram = bananas + milk + iceCream + eggs;
        System.out.println("Результат в граммах " + totalGram);

        float totalKilogram = totalGram / 1000f;
        System.out.println("Результат в килограммах " + totalKilogram);

        //Задание 7

        int needToReset = 7*1000;
        int option250PerDay = 250 ;
        int option500PerDay = 500 ;

        int option250DaysNeed = needToReset / option250PerDay;
        System.out.println("Если худеть на 250 грамм в день, то потребуется " + option250DaysNeed + " дней");

        int option500DaysNeed = needToReset / option500PerDay;
        System.out.println("Если худеть на 500 грамм в день, то потребуется " + option500DaysNeed + " дней");

        int onAverageDaysNeeded = (option250DaysNeed + option500DaysNeed) / 2;
        System.out.println("В среднейм потребуется " + onAverageDaysNeeded + " день");


        //Задание 8

        int mashaPerMonthAsIs = 67760;
        int denisPerMonthAsIs = 83690;
        int kristinaPerMonthAsIs = 76239;

        int mashaPerYearAsIs = 67760 * 12;
        int denisPerYearAsIs = 83690 * 12;
        int kristinaPerYearAsIs = 76239 * 12;

        float incrise = 0.10f;

        float mashaPerMonthToBe = (mashaPerMonthAsIs * incrise) + mashaPerMonthAsIs;
        float denisPerMonthToBe = (denisPerMonthAsIs * incrise) + denisPerMonthAsIs;
        float kristinaPerMonthToBe = (kristinaPerMonthAsIs * incrise) + kristinaPerMonthAsIs;

        float mashaPerYearToBe = mashaPerMonthToBe * 12;
        float denisPerYearToBE = denisPerMonthToBe * 12;
        float kristinaPerYearToBe = kristinaPerMonthToBe * 12;

        float mashaDeltaPerYear = mashaPerYearToBe - mashaPerYearAsIs;
        float denisDeltaPerYear = denisPerYearToBE - denisPerYearAsIs;
        float kristinaDeltaPerYear = kristinaPerYearToBe - kristinaPerYearAsIs;

        System.out.println("Маша теперь получает " + mashaPerMonthToBe + " рублей. Годовой доход вырос на " + mashaDeltaPerYear + " рублей");
        System.out.println("Денис теперь получает " + denisPerMonthToBe + " рублей. Годовой доход вырос на " + denisDeltaPerYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinaPerMonthToBe + " рублей. Годовой доход вырос на " + kristinaDeltaPerYear + " рублей");


    }
}