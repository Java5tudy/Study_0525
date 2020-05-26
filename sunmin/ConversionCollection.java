package CollectionFrameWork;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;

public class ConversionCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		//ArrayList<E> �ν��Ͻ��� ��ȯ?
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		//ArrayList<E> �ν��Ͻ��� ������� LinkedList�ν��Ͻ� ����
		list = new LinkedList<>(list);
		
		//LinkedList<E> �ν��Ͻ��� ��ȯ 
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();

	}

}