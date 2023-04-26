class Solution {
    public int removeElement(int[] l, int v) {
        int c = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == v) {
                c++;
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l.length; j++) {
                if (l[j] == v) {
                    for (int k = j + 1; k < l.length; k++) {
                        l[k - 1] = l[k];
                    }
                    l[l.length - 1] = 0;
                    break;
                }
            }
        }
        return l.length - c;
    }
}
