class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i:nums1){
            ar.add(i);
        }
        for(int i:nums2){
            ar.add(i);
        }
        
        Collections.sort(ar);
        // System.out.println(ar);
        int n=ar.size();
        int i=n/2;
        // System.out.println(i);
        if(n%2!=0){
            
            return ar.get(i);
        }
        int res1=ar.get(i-1);
        int res2=ar.get(i);
        // System.out.println(res1+" "+res2);
        return (double)(res1+res2)/2;
    }
}