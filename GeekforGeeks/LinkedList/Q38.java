public class Q38 {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
      int count =0;
      HashSet<Integer>hs=new HashSet<Integer>();
      for(int i=0;i<head1.size();i++)
          hs.add(head1.get(i));
          
      for(int i=0;i<head2.size();i++){
          if(hs.contains(x-head2.get(i)))
          count++;
      }
        
        return count;
        // add your code here
    }
    
}
