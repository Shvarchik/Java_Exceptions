public class Sem2Task1 {
    public static void main(String[] args) {
        String [][] array = {{"6","jkh","4","9"},{"fjl","2","3","4","5"}};
        System.out.println("sum = " +sum2d(array));
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j ++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sum2d(String [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j ++){
                try {
                sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    arr[i][j] = "0"; 
                    System.out.println(String.format("нечисловое значение элемента [%d][%d] заменено на 0", i,j));
                }
            }
        }
        return sum;
    }
}
