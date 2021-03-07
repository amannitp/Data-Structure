public class Q39 {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
      int count =0;
       HashSet<Integer> hs=new HashSet<Integer>();
        for(Integer i:head1)
        hs.add(i);
        Iterator itr2 = head2.iterator();
        while (itr2.hasNext()){
        if (hs.contains(x - (int)itr2.next()))
        count++;
        }
        return count;
    
}
