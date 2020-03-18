/**
 * Это класс пациента
 *
 * @version 18.03.2020
 * @author Pukin Alexey
 */

public class Pacient {
    public String fio; // ФИО
    public String gender; // Пол
    public int age; // Возраст
    public boolean pensioner = false; // Показатель того, пенсионер ли пациент
    public int id; // id Пациента


    Pacient(String f, String g, int a, int ID) {
        if (g == "Мужской" && a > 65){
            pensioner = true;
        }
        if (g == "Женский" && a > 60){
            pensioner = true;
        }
        fio = f;
        gender = g;
        age = a;
        id = ID;
    }

    // метод для показа информации о пациенте
    public String info(){
        return ("ID пациента: " + id + ", Пациент: " + fio + ", пол: " +  gender +  ", возраст: " + age);
    }
}
