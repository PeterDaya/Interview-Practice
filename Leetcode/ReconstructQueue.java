class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) return b[0] - a[0];
                else return a[1] - b[1];
            }
        });
        
        ArrayList<int[]> mylist = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            mylist.add(people[i][1], people[i]);
        }
        
        int[][] ret = new int[people.length][2];
        for (int i = 0; i < mylist.size(); i++) {
            ret[i][0] = mylist.get(i)[0];
            ret[i][1] = mylist.get(i)[1];
        }
        
        return ret;
    }
}