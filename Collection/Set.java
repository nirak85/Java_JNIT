import java.util.TreeSet;
import java.util.*;
class Set{
public static void main(String args[]){
HashSet<String> hs=new HashSet<String>();
hs.add("Q");
hs.add("U");
hs.add("E");
hs.add("E");
hs.add("N");
hs.add("");
 
System.out.println(hs);
System.out.println(hs.isEmpty());
System.out.println(hs.size());
System.out.println(hs.contains("S"));
System.out.println(hs.contains("Q"));
System.out.println(hs.remove("N"));
System.out.println(hs);
hs.clear();
System.out.println(hs);

LinkedHashSet<String> lhs=new LinkedHashSet<String>();
lhs.add("Q");
lhs.add("U");
lhs.add("E");
lhs.add("E");
lhs.add("N");
lhs.add("");

System.out.println(lhs);

//class casting
// clone returns object 
Object o=lhs.clone();
System.out.println(o);


TreeSet<String> ts=new TreeSet<String>();
ts.add("Q");
ts.add("U");
ts.add("E");
ts.add("E");
ts.add("N");
ts.add("");
ts.add("K");
ts.add("I");
ts.add("N");
ts.add("G");



System.out.println(ts);

//headSet, tailSet, subSet
System.out.println(ts.headSet("I"));
System.out.println(ts.headSet("I",true));
System.out.println(ts.tailSet("K"));
System.out.println(ts.tailSet("K",false));
System.out.println(ts.subSet("E","Q"));
System.out.println(ts.subSet("E",false,"Q",true));

//first, last, lower, floor, ceiling, higher, pollFirst
System.out.println(ts);
System.out.println(ts.first());
System.out.println(ts.last());
System.out.println(ts.lower("K"));
System.out.println(ts.floor("K"));
System.out.println(ts.ceiling("K"));
System.out.println(ts.higher("K"));
System.out.println(ts.pollFirst());

TreeSet<Integer> tree =new TreeSet<Integer>();
tree.add(10);
tree.add(11);
tree.add(12);
tree.add(13);
tree.add(14);
tree.add(15);
tree.add(16);
tree.add(17);


System.out.println(tree);
System.out.println(tree.ceiling(15));


}
}