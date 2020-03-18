/**
 * Этот класс отвечает за Comparator. Он соритрует очередь
 *
 * @versin 18.03.2020
 * @author Pukin Alexey
 */

import java.util.Comparator;

public class ComparePacients<T> implements Comparator <Pacient>{

    @Override
    public int compare(Pacient o1, Pacient o2) {
        if (o1.pensioner && !o2.pensioner) // первый пенсонер, второй не пенсионер
        return -1;
        if (!o1.pensioner && o2.pensioner ) // первый не пенсионер, второй пенсионер
            return 1;
        return (o1.id - o2.id); // оба не пенсионеры. Очередь по входу
    }
}
