package seminar.my;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
    Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла
и сохраняет в двумерный массив (либо HashMap, если
студенты с ним знакомы). В отдельном методе нужно
будет пройти по структуре данных, если сохранено значение ?,
заменить его на соответствующее число.Если на каком-то месте
встречается символ, отличный от числа или ?, бросить подходящее
исключение.Записать в тот же файл данные с замененными символами ?.
     */

// реализация без перезаписи файла. Для теста - вывод на печать

public class task3 {
    public static void main(String[] args) {
        readFile("seminar\\my\\test.txt");
    }

    public static void readFile(String fileName) {
        Map<String, Integer> map = new HashMap<>();
        // Map<String, String> map = new HashMap<>();
        BufferedReader txt = null;
        try {
            txt = new BufferedReader(new FileReader(fileName));
            String line;
            String[] param;
            while ((line = txt.readLine()) != null) {
                param = line.split("=");
                
                Integer lenName = null;
                try {
                    lenName = Integer.parseInt(param[1]);
                } catch (NumberFormatException e) {
                    lenName = param[0].length();
                }
                
                map.put(param[0], lenName);
            }
            // txt.close();

        } catch (IOException e) {
            System.out.println("Файл не найден");
        } 
        finally{
            try {
                txt.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }

        System.out.println(map);
    }
}
