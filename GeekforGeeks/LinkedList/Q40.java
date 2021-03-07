public class Q40 {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
      int count = 0 ;
      for (Integer i: head1) {
          if (i >= x) 
          continue;
          else {
              for (Integer j : head2){
                  if (j >= x) 
                  continue;
                  else if (i + j== x) 
                  count ++;
              }
          }
      }
        return count;
}
