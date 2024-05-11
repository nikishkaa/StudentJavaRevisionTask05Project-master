package by.itstep.javatraining.revision.task;

/*	Task 05. Amount of days [количество дней]
 *
 *  Даны порядковый номер месяца и номер года.
 *  Определите количество дней в заданном месяце соответствующего года.
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": если номер месяца некорректен,
 *  то нужно возвратить 0.
 *  2) Постарайтесь реализовать основной алгоритм так, чтобы в нём было
 *  не более двух условных конструкций.
 *
 *  Формат входных данных [input]
 *  На вход метод получает два целых числа типа int.
 *
 *  Формат выходных данных [output]
 *  Метод должно возвратить количество дней в заданном месяце
 *  или ноль (при неверных данных месяца).
 *
 *	[ input 1]: 4 2023
 *	[output 1]: 30
 *
 *	[ input 2]: 5 2023
 *	[output 2]: 31
 *
 *	[ input 3]: 2 1900
 *	[output 3]: 28
 *
 *	[ input 4]: 2 2000
 *	[output 4]: 29
 *
 *	[ input 5]: -7 2023
 *	[output 5]: 0
 *
 *	[ input 6]: 0 2023
 *	[output 6]: 0
 *
 *	[ input 7]: 13 2023
 *	[output 7]: 0
 */

public class Task05 {
    public static final int DAY_IN_BIG_MONTH = 31;
    public static final int DAY_IN_SMALL_MONTH = 30;
    public static final int LEAP_YEAR_FEB_DAY = 29;
    public static final int N_LEAP_YEAR_FEB_DAY = 28;

    public static int start(int month, int year) {
        if (month < 1 || month > 12) {
            return 0;
        }

        int days = (month % 2 != 0 && month < 8)
                || (month >= 8 && month % 2 == 0)
                ? DAY_IN_BIG_MONTH : DAY_IN_SMALL_MONTH;

        if (month == 2) {
            days = (year % 4 == 0 && year % 10 != 0) || (year % 400 == 0)
                    ? LEAP_YEAR_FEB_DAY : N_LEAP_YEAR_FEB_DAY;
        }

        /*
        -Не совсем получается избавиться от конструкции if т.к. тогда
        перезаписывается правильное значение если месяц не равен 2

        -Наверно можно добавить еще константы но их тогда будет много
        и используются они по 1 разу (например в проверке на дурака
        или в определении високосный год или нет)
        */

        return days;
    }
}