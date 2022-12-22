// Напишите метод, который заполнит массив из 1000 элементов 
// случайными цифрами от 0 до 24.
// Создайте метод, в который передайте заполненный выше массив 
// и с помощью Set вычислите процент уникальных значений 
// в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = кол-во уникальных чисел * 100 / общее кол-во чисел в массиве.

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.lang.Math;

public class Main
    {
    public static void main(String[] args) 
    {
        int [] array = initArr(1000);
        System.out.println("Длина массива: " + array.length);
        System.out.println("Сгенерированный массив: " );
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " " );
        }
        System.out.println("");
        System.out.println("Процент уникальных чисел = " + getPercentUniqueValues(array));  
    }
           
    // Метод генерации случайных чисел
    public static int[] initArr(int length)
    {  
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) 
        {
            array[i] = ((int) (Math.random() * 25));
        }
        return array;
    }  
          
    // Метод расчета процента уникальных значений
    public static double getPercentUniqueValues(int[] RandomArr) 
    {
        // Инициализация нового массива
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        // Заполнение массива MyHashSet
        for (int i : RandomArr) 
        {
            myHashSet.add(i);
        }
        // Определение уникальных чисел
        SortedSet<Integer> numberSet = new TreeSet<>();
        for (int i : myHashSet) 
        {
            numberSet.add(i);
        }
        System.out.println("Уникальные числа: " + numberSet);
        System.out.println("Количество уникальных чисел = " + numberSet.size());
     
        // Расчет процента уникальных чисел
        double percent;
        percent = myHashSet.size() * 100 / RandomArr.length;
     
        return percent;
    }
}        
    