
import java.awt.*;
import java.util.*;
import java.util.List;

public class lamdas {
    public double calcular(){
        operations opr=(double t1,double t2)->(t1+t2)/2;
        return opr.prom(3, 36) ;
    }

    public void ordenar(){
        List<String> list =new ArrayList<String> ();
        list.add("minty");
        list.add("no W");
        list.add("TRY and TRY");
//        Collections.sort(list, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        Collections.sort(list,(String p1, String p2)-> p1.compareTo(p2) );

        for(String elem: list )
        {
            System.out.println(elem);
        }

    }
    public static void  main (String[] args){
        lamdas lamdas = new lamdas();
        lamdas.ordenar();
        System.out.println(lamdas.calcular());

    }
}
