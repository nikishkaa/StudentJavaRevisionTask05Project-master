package by.itstep.javatraining.revision.task;

/*	Task 02. The same Numbers [совпадающие числа]
 *
 *	Даны четыре целых числа. Определите, сколько из них совпадающих.
 *	Если числа не совпадают, то необходимо возвратить ноль.
 *
 *	Формат входных данных [input]
 *	На вход метод получает четыре целых числа типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить количество совпадающих чисел
 *  или ноль, если таких чисел нет.
 *
 *	[ input 1]: 7 7 7 7
 *	[output 1]: 4
 *
 *	[ input 2]: 7 7 7 8
 *	[output 2]: 3
 *
 *	[ input 3]: 7 7 8 9
 *	[output 3]: 2
 *
 *	[ input 4]: 6 7 8 9
 *	[output 4]: 0
 */

public class Task02 {
    public static int start(int a, int b, int c, int d) {
        int count = 0;

        count += (a == b) ? 1 : 0;
        count += (a == c) ? 1 : 0;
        count += (a == d) ? 1 : 0;
        count += (b == c) ? 1 : 0;
        count += (b == d) ? 1 : 0;
        count += (c == d) ? 1 : 0;


        count = count == 1 ? 2 : count;
        count = count == 6 ? 4 : count;


        return count;
    }
}
