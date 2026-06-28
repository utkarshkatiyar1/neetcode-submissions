class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> a = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
        List <Integer> b = new ArrayList<>();
        for(int j=1; j<=i; j++){
            if(j==1 || j==i) b.add(1);
            else{
                b.add(a.get(i-2).get(j-1)+a.get(i-2).get(j-2));
            }
        }
        a.add(b);
        }
        return a;
    }
}