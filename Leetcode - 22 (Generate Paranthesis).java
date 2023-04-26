class Solution {
    static List<String> al=new ArrayList<>();
    static void genp(int n,int op,int cl,String s) {
		if(cl==n) {	
			al.add(s);
			return;
        }
		if((op)==n) {
			genp(n,op,cl+1,s.concat(")"));
			return;
		}
		if(op>=cl) {
			genp(n,op+1,cl,s.concat("("));
			if(op>cl) genp(n,op,cl+1,s.concat(")"));
		}
	}
    public List<String> generateParenthesis(int n) {
       String s="";
       al.clear();
       int op=0,cl=0;
		genp(n,op,cl,s);
        return al;
    }
}