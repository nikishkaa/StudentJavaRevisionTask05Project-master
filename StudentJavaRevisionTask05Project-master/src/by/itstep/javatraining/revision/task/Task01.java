package by.itstep.javatraining.revision.task;

/*  Task 01. Next Multiple Number [следующее кратное число]
 *
 *  Даны натуральные числа N и K.
 *  Найдите такое наименьшее число X, что X > N и X делится на K без остатка,
 *  т.е. найдите следующее кратное число.
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": если данные некорректны,
 *  то нужно возвратить 0.
 *  2) Данную задачу можно решить, используя только встроенные операции
 *  языка и условную операцию, а сам алгоритм реализовать в одну строчку.
 *
 *  Формат входных данных [input]
 *  На вход метод получает два целых числа типа int.
 *
 *  Формат выходных данных [output]
 *  Метод должен возвратить ответ на задачу.
 *
 *	[ input 1]: 12 3
 *	[output 1]: 15
 *
 *	[ input 2]: 14 3
 *	[output 2]: 15
 *
 *	[ input 3]: 1 1
 *	[output 3]: 2
 *
 *	[ input 4]: 0 1
 *	[output 4]: 0
 *
 *	[ input 5]: -1 1
 *	[output 5]: 0
 */

public class Task01 {
    public static int start(int n, int k) {
        if (n <= 0 || k <= 0) {
            return 0;
        }

        int x = n + 1;
        while (x % k != 0) {
            x++;
        }

        //Наверно можно решить проще
        return x;
    }
}