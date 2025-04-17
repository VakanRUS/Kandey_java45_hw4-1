public class Main {
    public static void main(String[] args) {
        //эээксперименты
//        int salary = 90000;
//        int monthCount = 1;
//        int total = 0;
//        for (; total <= 1000000; monthCount++) {
//            total = total + total / 100;
//            total = total + (salary - 30000);//~30к на повседневные траты и оплаты комуналки
//            System.out.println("Месяц " + monthCount + " Итого " + total);
//            monthCount = monthCount;
//        }
//        if (monthCount < 12)
//            System.out.println("Чтобы накопить свой первый миллион, при такой зарплате и с этими процентами, потребуется " + monthCount + " месяцев");
//        else
//            System.out.println("Чтобы накопить свой первый миллион, при такой зарплате и с этими процентами, потребуется " + monthCount / 12 + " год/лет и " + monthCount % 12 + " месяцев");

        //task 1
        System.out.println("task 1");
        for (int i = 0; i <= 10; i++)
            System.out.printf(i + " ");
        System.out.println();
        System.out.println();

        //task 2
        System.out.println("task 2");
        for (int i = 10; i >= 0; i--)
            System.out.printf(i + " ");
        System.out.println();
        System.out.println();

        //task 3
        System.out.println("task 3");
        for (int i = 0; i <= 17; i += 2)
            System.out.printf(i + " ");
        System.out.println();
        System.out.println();

        //task 4
        System.out.println("task 4");
        for (int i = 10; i >= -10; i--)
            System.out.printf(i + " ");
        System.out.println();
        System.out.println();

        //task 5
        System.out.println("task 5");
        for (int i = 1904; i <= 2096; i += 4)
            System.out.println(i + " год является високосным");
        System.out.println();

        //task 6
        System.out.println("task 6");
        for (int i = 0; i < 100; i += 7)
            System.out.printf(i + " ");
        System.out.println();
        System.out.println();

        //task 7
        System.out.println("task 7");
        for (int i = 1; i <= 512; i *= 2)
            System.out.printf(i + " ");
        System.out.println();
        System.out.println();

        //task 8
        System.out.println("task 8");
        int toTank = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + toTank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        //task 9
        System.out.println("task 9");
        int toBank = 29000;
        int totalWithPercents = 0;
        for (int i = 1; i <= 12; i++) {
            totalWithPercents = totalWithPercents + totalWithPercents / 12;
            totalWithPercents = totalWithPercents + toBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalWithPercents + " рублей");
        }
        System.out.println();

        //task 10
        System.out.println("task 10");
        for (int i = 1; i <= 10; i++)
            System.out.println("2*" + i + "=" + 2 * i);
        System.out.println();
    }
}