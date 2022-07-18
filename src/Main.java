import javax.management.ObjectName;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner myInput = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String userName = myInput.nextLine();
            listA.add(userName);
        }
        System.out.println(listA);

        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String userName = myInput.nextLine();
            listB.add(userName);

        }
        System.out.println(listB);
        ArrayList<String> listС = new ArrayList<>();
        listС.addAll(0, Collections.singleton(listA.get(0)));
        listС.addAll(1, Collections.singleton(listB.get(4)));
        listС.addAll(2, Collections.singleton(listA.get(1)));
        listС.addAll(3, Collections.singleton(listB.get(3)));
        listС.addAll(4, Collections.singleton(listA.get(2)));
        listС.addAll(5, Collections.singleton(listB.get(2)));
        listС.addAll(6, Collections.singleton(listA.get(3)));
        listС.addAll(7, Collections.singleton(listB.get(1)));
        listС.addAll(8, Collections.singleton(listA.get(4)));
        listС.addAll(9, Collections.singleton(listB.get(0)));
        System.out.println(listС);
        Comparator<String> stringLengthComparator = new StringLengthSort();
        listС.sort(stringLengthComparator);
        for(String str : listС){
            System.out.println(str);
        }
    }

    }















