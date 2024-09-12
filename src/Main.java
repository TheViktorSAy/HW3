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
        System.out.println("За 3 дня машина произвелка "+ bottlesIn3Days + " бутылок");

        int bottlesIn1Month = bottlePerMinute * minutesInADay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " бутылок");


        // Задание 5






    }
}