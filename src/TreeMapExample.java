import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeSet set = new TreeSet() ;
		set.add("sandeep");
		set.add("muneer");
		set.add("rupesh");
		System.out.println(set);
	
	}
}

/*class myComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		if(o2 instanceof Integer) {
			Integer i1 = (Integer)o2;
		} else {
			String s2 = (String)o2;
		}
		return s1.compareTo(s2);
	}
}*/


class PriorityQueueExample{
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>((o1, o2)-> o2.toString().compareTo(o1.toString()));
		pq.offer("b");
		pq.offer("c");
		pq.offer("a");
		pq.offer("z");
		pq.offer("s");
		pq.offer("u");
		pq.offer("v");			
		pq.offer("w");							//Internal data structure for queue is heap.
		System.out.println(pq);					//we cannot guaranty the sorted order here but the first element will be in required order. So once this is proceessed, then next element is kept in sorted order and then it is processed.
		
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		
		for(int i=0; i<=7; i++) {
			System.out.println("while poll:"+ pq.poll());
		}
	}
}


class PriorityQueueExample2{
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>((o1, o2)-> o2.toString().compareTo(o1.toString()));
		pq.offer("b");
		pq.offer("c");
		pq.offer("a");
		pq.offer("z");
		pq.offer("s");
		pq.offer("u");
		pq.offer("v");			
		pq.offer("w");							//Internal data structure for queue is heap.
		System.out.println(pq);					//we cannot guaranty the sorted order here but the first element will be in required order. So once this is proceessed, then next element is kept in sorted order and then it is processed.
	
		Iterator<String> itr = pq.iterator();
		while(itr.hasNext()) {
			String next = itr.next();
			if(next.equals("w")) {
				pq.offer("m");
			}
		}
		
		System.out.println(pq);
	}
}

class PriorityQueueExample3{
	public static void main(String[] args) {
		PriorityBlockingQueue<String> pq = new PriorityBlockingQueue<>();
		pq.offer("b");
		pq.offer("c");
		pq.offer("a");
		pq.offer("z");
		pq.offer("s");
		pq.offer("u");
		pq.offer("v");			
		pq.offer("w");	
		pq.offer("ss");
		pq.offer("cd");
		pq.offer("ad");
		pq.offer("ze");
		pq.offer("sd");
		pq.offer("ud");
		pq.offer("vd");			
		pq.offer("wd");//Internal data structure for queue is heap.
		System.out.println(pq);					//we cannot guaranty the sorted order here but the first element will be in required order. So once this is proceessed, then next element is kept in sorted order and then it is processed.
	
		Iterator<String> itr = pq.iterator();
		while(itr.hasNext()) {
			String next = itr.next();
			if(next.equals("w")) {
				pq.offer("m");
			}
		}
		
		System.out.println(pq);
	}
}