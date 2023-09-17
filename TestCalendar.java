import java.util.Scanner;

public class TestCalendar {
    public static void main(String[] args) {
//        1接收輸入的年和月
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入年份: ");
        int year = input.nextInt();
        System.out.println("請輸入月份: ");
        int month = input.nextInt();
//         2計算整個年份和月份對應的第一天是星期幾
        int days = 0;
        for (int i = 1900; i < year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }
        //    月份循環
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days += 29;
                }
            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                days += 31;
            } else {
                days += 30;
            }
        }
        int week = 1 + days % 7;
        System.out.println("這個月得第一天是星期:" + week);

        System.out.println("一\t二\t三\t四\t五\t六\t日\t");

        for (int i = 1; i < week; i++) {
            System.out.print("\t");
        }

        int dayOfMonth = 0;

        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    dayOfMonth = 29;
                } else {
                    dayOfMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            default:
                dayOfMonth = 31;
                break;
        }
//        打印日期
        for(int i = 1;i<=dayOfMonth;i++){
            System.out.print(i+"\t");
            if((week - 1+i)%7==0){
                System.out.println();

            }
        }
    }
}
