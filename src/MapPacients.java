/**
 * Этот класс отвечает за создание Map пациентов
 *
 * @version 18.03.2020
 * @author Pukin Alexey
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPacients {
    public Map pacientMap = new LinkedHashMap<Integer, Pacient>();
    private int startID = 1000;
    public void createMap(){



        pacientMap.put(1, new Pacient("Ivanov Ivan Ivanovich", "Мужской", 25, startID++));
        pacientMap.put(2, new Pacient("Pukin Alexey Andreevich", "Мужской", 18, startID++));
        pacientMap.put(3, new Pacient("Ivanova Julia Anreevna", "Женский", 40, startID++));
        pacientMap.put(4, new Pacient("Novikov Anton Vladimirovich", "Мужской", 70, startID++));
        pacientMap.put(5, new Pacient("Bolotov Anton Tomofeevich", "Мужской", 85, startID++));
        pacientMap.put(6, new Pacient("Львова Татьяна Львовна", "Женский", 80, startID++));
        pacientMap.put(7, new Pacient("Акимов Николай Николаевич", "Мужской", 90, startID++));
        pacientMap.put(8, new Pacient("Ленин Владимир Ильич", "Мужской", 40, startID++));
        pacientMap.put(9, new Pacient("Троцкий Лев Давидович", "Мужской", 60, startID++));
        pacientMap.put(10, new Pacient("Терешкова Юлия Юрьевна", "Женский", 30, startID++));


    }



}
