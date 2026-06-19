class Solution {
    public int climbStairs(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        System.out.println(map);
        return recursion(n, map);
    }

    int recursion(int p, Map <Integer, Integer> map) {
        if(map.containsKey(p)) return map.get(p);
        else if(p<3) {
            map.put(p,p); 
            return p;
        }
        else {
            int sol=recursion(p-1, map) + recursion(p-2, map);
            map.put(p, sol);
            return sol;
        }
    }
}
