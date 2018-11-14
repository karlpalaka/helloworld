/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworlds;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author karpa
 */
public class HelloWorlds
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        List<String> ls = new ArrayList<String>();
        List<Integer> li = new ArrayList<Integer>();
        
        ls.add("cat");
        ls.add("dog");
        ls.add("bird");
        ls.add("chicken");
        
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        
        Predicate<String> animal = i -> (i.equals("bird"));
        Predicate<Integer> number = i -> (i == 4);
        System.out.println((linearSearch(ls, animal)));
        System.out.println((linearSearch(li, number)));
    }
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check)
    {
        for (T temp: list)
        {  
            if (check.test(temp))
            {
                return list.indexOf(temp);
            }
        }
        return -1;
    }
}
