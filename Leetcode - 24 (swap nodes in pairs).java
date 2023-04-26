class Solution {
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> ar=new ArrayList<>();
        ListNode t=head;
        while(t!=null){
            ar.add(t.val);
            t=t.next;
        }
        ListNode res=new ListNode(0);
        ListNode temp=res;
        int n=ar.size();
        for(int i=0;i<ar.size()-1;i++){
            ListNode t1=new ListNode(ar.get(i+1));
            temp.next=t1;
            temp=temp.next;
            ListNode t2=new ListNode(ar.get(i));
            temp.next=t2;
            temp=temp.next;
            i++;
        }
        if(n%2!=0){
            ListNode t2=new ListNode(ar.get(n-1));
            temp.next=t2;
        }
        return res.next;
    }
}