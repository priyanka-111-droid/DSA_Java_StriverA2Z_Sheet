
public class PairsWithGivenSum {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        HashSet<Integer> hs= new HashSet<>();

        Node temp=head;
        while(temp!=null){
            hs.add(temp.data);
            temp=temp.next;
        }

        while(head!=null){
            hs.remove(head.data);
            if(hs.contains(target-head.data)){
                ArrayList<Integer> l=new ArrayList<>();

                l.add(head.data);
                l.add(target-head.data);

                ans.add(l);
            }
            head=head.next;
        }
        return ans;
    }
}