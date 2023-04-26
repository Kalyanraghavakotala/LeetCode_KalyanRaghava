class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> ar1=new ArrayList<>();
        ListNode t=head;
        while(t!=null){
            ar.add(t.val);
            if(ar.size()==k){
                Collections.reverse(ar);
                for(int i=0;i<ar.size();i++){
                    ar1.add(ar.get(i));
                }
                ar.clear();
            }
            t=t.next;
        }
        for(int i=0;i<ar.size();i++){
                    ar1.add(ar.get(i));
                }

        System.out.println(ar1);
        ListNode res=new ListNode(0);
        t=res;
        for(int i=0;i<ar1.size();i++){
            t.next=new ListNode(ar1.get(i));
            t=t.next;
        }
        return res.next;
    }
}