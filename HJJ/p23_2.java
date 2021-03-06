import java.util.TreeSet;
import java.util.Comparator;

class IntegerComparator implements Comparator<Integer> {
    public int compare(Integer n1, Integer n2) {
        return n2.intValue() - n1.intValue(); //내림차순으로
    }
}
public class p23_2 {

	public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
		tr.add(30);
		tr.add(10);
		tr.add(20);
		System.out.println(tr);
	}

}
