// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух
// входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Sem1HT3 {
    public static int[] arrayDiff  (int[] arr1, int[] arr2) throws RuntimeException {
        if (arr1.length != arr2.length) throw new RuntimeException("array lengths are not equal");
        int[] resArr = new int [arr1.length];
        for (int i=0; i < resArr.length; i++){
            resArr[i] = arr1[i] - arr2[i];
        }
        return resArr;
    }
    public static void main(String[] args) {
        int [] array1 = {6,7,4,9};
        int [] array2 = {2,3,1,0,5};
        try {
            int [] resArray = arrayDiff (array1,array2);
            for (int i=0; i < resArray.length; i++){
                System.out.printf ("%d ", resArray[i]);
            }
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
