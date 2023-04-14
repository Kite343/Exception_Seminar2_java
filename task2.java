package seminar.my;

public class task2 {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}};
        // String[][] arr = {{"1", "2", "3", "4", "5"}, {}, {"1", "2", "3", "4", "5"}};
        // String[][] arr = {{"a", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}};
        // String[][] arr = {{"1", "2", null, "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}};
        // String[][] arr = {{"1", "2", "3", "4", "5"}, {"1", "2", "3"}, {"1", "2", "3", "4", "5"}};
        // String[][] arr = {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5", "6"}, {"1", "2", "3", "4", "5"}};
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) { 
        int sum = 0;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < 5; j++){
        //         try {
        //             int val = Integer.parseInt(arr[i][j]);
        //             sum += val;
        //         } catch (NumberFormatException e) {
        //             System.out.println("На позиции " + i + "_" + j + " встретилось не числовое значение");
        //             sum += 0;
        //         }
                
        //     }
        // }
        
        for(int i = 0; i < arr.length; i++){
            int k = 5;
            if(arr[i].length < 5){
                System.out.println("Длина подмассива " + i + " меньше 5, недотсающие элементы приняты равными 0");
                k = arr[i].length;
            }
            if(arr[i].length > 5){
                System.out.println("Длина подмассива " + i + " больше 5, все последующие элементы в расчет не приняты");
            }
            for(int j = 0; j < k; j++){
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) {
                    System.out.println("На позиции " + i + "_" + j + " встретилось не числовое значение");
                    sum += 0;
                }
                
            }
        }
        return sum;     
    }
}
