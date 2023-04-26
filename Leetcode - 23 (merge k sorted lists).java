
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ar=new ArrayList<>();
        ListNode res=new ListNode(0);
        
        for(ListNode i:lists){
                ListNode t=i;
                while(i!=null){
                    ar.add(i.val);
                    i=i.next;
                }
        }
        ListNode t=res;
        Collections.sort(ar);
        for(int i=0;i<ar.size();i++){
            t.next=new ListNode(ar.get(i));
            t=t.next;
        }
        // System.out.println(ar);
        return res.next;
        
        
    }
}