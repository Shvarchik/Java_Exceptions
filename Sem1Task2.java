// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
// Необходимо посчитать и вернуть сумму элементов этого массива. 
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
// (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. 
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

public class Sem1Task2 {

    public static int squareArray(int [][] arr){
        if(arr == null) throw new RuntimeException("array is null");
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr.length != arr[i].length ) throw new RuntimeException("array is not square");
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0 || arr[i][j] == 1){
                    sum += arr[i][j];
                }
                else throw new RuntimeException("array has elements not 0 or 1");
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] array = {{1,0},{1,3}};
        int a = squareArray(array);
        System.out.println(a);
    }
}
