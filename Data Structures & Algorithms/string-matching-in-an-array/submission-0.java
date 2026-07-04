class Solution {
    public List<String> stringMatching(String[] words) {
        List <String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i!=j) 
                {
                    if(words[i].contains(words[j]) && !list.contains(words[j]))  list.add(words[j]);
                    else if (words[j].contains(words[i]) && !list.contains(words[i])) list.add(words[i]);
                }
            }
            
        }
        return list;
        
    }
}