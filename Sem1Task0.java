// Реализуйте метод, принимающий в качестве аргумента целочисленный массив. 
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива.

public class Sem1Task0 {

    public static final int MIN_LENGTH = 3;
    public static void main(String[] args) {
        int [] array = {1,2};
        System.out.println(CheckArrayLength(array));

    }
    public static int CheckArrayLength (int[] array){

        if (array != null) 
            if (array.length < MIN_LENGTH) return -1;
            else return array.length;
        else return -2;
    }
}
