class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ss="";
        int max=1,st=0;
        boolean t[][]=new boolean[n][n];
        for(int i=0;i<n;i++){
            t[i][i]=true;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                t[i][i+1]=true;
                st=i;
                max=2;
            }
        }

        for(int k=3;k<=n;k++){
            for(int i=0;i<n-k+1;i++){
                int j=i+k-1;
                if(t[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    t[i][j]=true;
                    if(k>max){
                        max=k;
                        st=i;
                    }
                }
            }
        }
        for(int i=st;i<st+max;i++){
            ss+=s.charAt(i);
        }
        return ss;
    }
}