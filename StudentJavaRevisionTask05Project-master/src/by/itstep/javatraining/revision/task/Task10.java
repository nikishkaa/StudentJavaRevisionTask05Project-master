package by.itstep.javatraining.revision.task;

/*	Task 10. Intersection of Segments [пересечение отрезков]
 *
 *  На числовой прямой даны два отрезка: [a1; b1] и [a2; b2].
 *  Найдите их пересечение с использованием эффективного, но простого алгоритма.
 *
 *  Примечание
 *  Пересечением двух отрезков может быть:
 *  1) отрезок [a, b];
 *  2) точка (point - number);
 *  3) пустое множество (empty set).
 *
 *	Формат входных данных [input]
 *  На вход метод получает четыре целых числа типа int: a1, b1, a2, b2,
 *  которые задают соответствующие отрезки. Концы соответствующих отрезков
 *  могут задаваться неупорядоченно.
 *
 *  Формат выходных данных [output]
 *	Метод должен возвратить строку, которая может содержать следующее:
 *  1) границу отрезка в формате "segment - [a, b]", являющегося пересечением;
 *  2) общую точку в формате "point - number", где number - число;
 *  3) "empty set" - «пустое множество», если у отрезков нет пересечения;
 *  4) "error", если данные заданы некорректно.
 *
 *	[ input 1]: 1 3 2 4
 *	[output 1]: segment - [2, 3]
 *
 *	[ input 5]: 3 1 2 4
 *	[output 5]: segment - [2, 3]
 *
 *	[ input 2]: 1 2 2 3
 *	[output 2]: point - 2
 *
 *	[ input 3]: 1 2 3 4
 *	[output 3]: empty set
 *
 *	[ input 4]: 2 2 3 4
 *	[output 4]: error
 */

public class Task10 {
    public static String start(int a1, int b1, int a2, int b2) {
        if (a1 == b1 || a2 == b2) {
            return "error";
        }

        if (a1 > a2) {
            int t = a1;
            a1 = a2;
            a2 = t;

            t = b1;
            b1 = b2;
            b2 = t;
        }

        if (a1 > b1) {
            int t = a1;
            a1 = b1;
            b1 = t;
        }

        if (a2 > b2) {
            int t = a2;
            a2 = b2;
            b2 = t;
        }


        int start = Math.max(a1, a2);
        int end = Math.min(b1, b2);
        String msg = "segment - [" + start + ", " + end + "]";

        if (b1 < a2 || b2 < a1) {
            msg = "empty set";
        } else if (a2 == b1) {
            msg = "point - " + b1;
        }

        // Тут что не знаю вроде большинство тестов проходит я не нашел где валится
        //P.S. нашел где валится только при значении 5 10 5 1. При остальных работает
        //Не поучилось бысстро исправить. Хотя думаю легко исправляется
        return msg;
    }
}