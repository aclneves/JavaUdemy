package collections;

import java.util.HashSet;
import java.util.Set;

public class SetHeterogeneo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        conjunto.add("teste");

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.contains(1));

        Set nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        conjunto.addAll(nums);
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
