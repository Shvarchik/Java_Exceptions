// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
// если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки.
// если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// если вместо массива пришел null, метод вернет -3
// придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем. 
// То есть, этот метод запросит искомое число у пользователя, вызовет первый, 
// обработает возвращенное значение и покажет читаемый результат пользователю.
// Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sem1Task1 {

    public static int min_length = 3;
    
    public static int checkExistingValue(int value, Integer [] arr){
        if(arr == null){
            return -3;
            }
        else if (arr.length < min_length) {
            return -1;
            }
        List <Integer> list = new ArrayList<>(Arrays.asList(arr));
        if (list.contains(value)) return list.indexOf(value);
            else return -2;
          
    }
    public static void main(String[] args) {
        Integer[] array = {0,1,3,5,-7};
        System.out.println(checkExistingValue(0,array));
        
    }
}



    
