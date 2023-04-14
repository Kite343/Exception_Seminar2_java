package seminar.my;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("укажите индекс элемента массива, в который хотите записать значение 1");
        // int index = sc.nextInt();
        int index = -1;
        if(sc.hasNextInt()){
            index = sc.nextInt();
        }
        else{
            System.out.println("Введено не целое число");
        }

        // try {
        //     arr[index] = 1;
        // } catch (Exception e) {
        //     System.out.println("указан индекс за пределами массива");
        // }
        if(index < 0 || index >= 10){
            System.out.println("указан индекс за пределами массива");
        }
        else{
            arr[index] = 1;
        }
    }
}
