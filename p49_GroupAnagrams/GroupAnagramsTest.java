package p49_GroupAnagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagramsTest {
    private String[] strs;
    private List<List<String>> expected;
    private List<List<String>> actual;

    @Test
    void example1()
    {
        strs = new String[]{"eat","tea","tan","ate","nat","bat"};

        expected = new ArrayList<>(List.of(new ArrayList<>(List.of("bat")), new ArrayList<>(List.of("nat", "tan"))
                , new ArrayList<>(List.of("ate", "eat", "tea"))));
        actual = GroupAnagrams.groupAnagrams(strs);
    }

}
