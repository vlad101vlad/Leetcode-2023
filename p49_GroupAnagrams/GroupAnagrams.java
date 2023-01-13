package p49_GroupAnagrams;

import java.util.*;

public class GroupAnagrams {
    protected static class Pair
    {
        private String key;
        private String value;

        protected Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>(new ArrayList<>());

        var result = new ArrayList<>(Arrays.stream(strs).map(String::toCharArray)
                .map(stringAsCharArray -> {
                    String currentString = String.valueOf(stringAsCharArray);
                    Arrays.sort(stringAsCharArray);
                    String sortedString = Arrays.toString(stringAsCharArray);
                    return new Pair(sortedString, currentString);
                }).toList());

        result.sort(Comparator.comparing(pair -> pair.key));

        List<List<String>> solution = new ArrayList<>();
        String pivot = null;
        List<String> pivotGroup = null;

        for(var entry: result){
            if(pivot == null) {
                pivot = entry.getKey();
                pivotGroup = new ArrayList<>();
            }

            if(!Objects.equals(entry.getKey(), pivot)){
                pivot = entry.getKey();
                solution.add(pivotGroup);
                pivotGroup = new ArrayList<>();
                pivotGroup.add(entry.getValue());
            }else{
                pivotGroup.add(entry.getValue());
            }
        }
        if(!pivotGroup.isEmpty())
            solution.add(pivotGroup);
        return solution;
    }
}
