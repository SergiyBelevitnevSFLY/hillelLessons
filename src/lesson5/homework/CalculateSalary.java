package lesson5.homework;

public class CalculateSalary {

    public static void main(String[] args) {

        int hours = 170;
        double baseRate = 15;
        int longevity = 3;
        int salesQuantity = 8;
        double salesVolume = 12000;

        int hoursWithoutOverTime = hours > 160 ? 160 : hours;

        double totalSalary = getOvertimeBonus(hours, baseRate) + ratio(longevity) * hoursWithoutOverTime * baseRate + salesVolumeAmount(salesVolume) +
                salesAmountBonus(salesQuantity);

        System.out.println("Total salary " + totalSalary);
    }


    public static double getOvertimeBonus(int hours, double baseRate) {
        if (hours > 160) {
            return (hours - 160) * baseRate * 1.5;
        }
        return 0;
    }

    /*
    Второй метод - получает коэффициент на базовые часы (которые до 160) в
зависимости от стажа работы (параметры у метода - стаж работы int, возвращаемое
значение double коэффициент) до 2 лет 1 от 2 до 4 - 1.2 от 4 до 6 - 1.3 от 6 лет - 1.4
     */
    public static double ratio(int longevity) {
        if (longevity < 2) {
            return 1;
        } else if (longevity < 4) {
            return 1.2;
        } else if (longevity < 6) {
            return 1.3;
        } else {
            return 1.4;
        }

    }

    /*
     В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
штраф 150 (параметры у метода - количество продаж int, возвращаемое значение
double бонус за количество продаж)
     */

    public static double salesAmountBonus(int salesQuantity) {
        if (salesQuantity > 20) {
            return 250;
        } else if (salesQuantity < 10) {
            return -150;
        } else return 0;

    }

    /*
четвертый в зависимости от суммы продаж больше 15000 $ - тоже
добавляется бонус (параметры у метода - сумма продаж double, возвращаемое
значение double бонус за сумму продаж)
     */
    public static double salesVolumeAmount(double salesVolume) {
        if (salesVolume > 15000) {
            return 500;
        } else {
            return 0;
        }

    }
}
