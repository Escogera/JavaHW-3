// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.*;

public class hw3 {
    public static void main(String[] args) {        
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(7);
            list.add(8);
            list.add(10);
    
            System.out.println(list);
    
            float maxNum = list.get(0);
    
            for (int j : list) {
                if (j > maxNum)
                    maxNum = j;
            }
    
            System.out.println("Max number = " + maxNum);
    
            float minNum = list.get(0);
    
            for (int j : list) {
                if (j < minNum)
                    minNum = j;
            }
    
            System.out.println("Min number = " + minNum);
    
            float sum = 0;
    
            for (int j : list) {
                sum += j;
            }
    
            float average = sum / list.size();
            System.out.println("Average = " + average);
    }

}
