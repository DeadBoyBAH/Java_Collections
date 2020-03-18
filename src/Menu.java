/**
 * Этот класс выводит меню в консоль и отвечает за её функционал
 *
 * @version 18.03.2020
 * @author Pukin Alexey
 */

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    int num;
    ComparePacients<Pacient> comparator = new ComparePacients<>();
    MapPacients mapPacients = new MapPacients();

    public void showMenu() {
        // Запуск меню
        do {
            System.out.print("Меню\n" +
                    "1 - регистрация\n" +
                    "2 - запись на приём и формирование очереди\n" +
                    "3 - выход из программы\n\n" +
                    "Ваш ввод: ");
            num = in.nextInt();
            switch (num) {
                case 1:
                    mapPacients = new MapPacients();
                    mapPacients.createMap();
                    // Вывод пациентов
                    for (int i = 1; i <= 10; i++) {
                        Pacient pac1 = (Pacient) mapPacients.pacientMap.get(i);
                        System.out.println(pac1.info());
                    }
                    break;

                case 2:
                    // создание очереди с сортировкой
                    Queue<Pacient> queuePacients = new PriorityQueue<>(10, comparator);
                    for (int i = 1; i <= 10; i++) {
                        Pacient pac1 = (Pacient) mapPacients.pacientMap.get(i);
                        queuePacients.offer(pac1);
                    }
                    // вывод очереди пациентов
                    while (!queuePacients.isEmpty()) {
                        System.out.println(queuePacients.remove().info());
                    }
                    break;
            }
        } while (num != 3);
    }
}
