package pack;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //1 Задание
        String[]arr = {"Один", "Два", "Один", "Два", "Два", "Два", "Три", "Три", "Три", "Чепыре",};

        for (int c = 0; c < arr.length; c++) {
            boolean neww = true;
            int a = 0;
            for (int j = 0; j < c; j++)
                if(arr[c].equals(arr[j]))
                    neww = false;
            if(neww){
                for (int j = c; j < arr.length; j++) {
                    if (arr[c].equals(arr[j])) a++;
                }if (a >= 1){
                    System.out.println(arr[c]);
                }
            }
        }
        for (int c = 0; c < arr.length; c++) {
            boolean neww = true;
            int a = 0;
            for (int j = 0; j < c; j++)
                if(arr[c].equals(arr[j]))
                    neww = false;
                if(neww){
                for (int j = c; j < arr.length; j++) {
                    if (arr[c].equals(arr[j])) a++;
                }if (a > 1){
                    System.out.println(arr[c] + a);
                }
            }
        }
        //2 Задание
        Map<String, String> map = new LinkedHashMap<>();

        add("Иванов", "+79787188809", map);
        get("Иванов", map);
    }

    private static void get(String name, Map<String, String> map) {
        map.get(name);
        System.out.println(map.values());

    }

    private static void add(String name, String phone, Map<String, String> map) {
        map.put(name, phone);
        System.out.println(map);
    }
}
