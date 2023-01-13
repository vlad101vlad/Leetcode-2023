package p242_ValidAnagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    private String s;
    private String t;

    private boolean expected;

    @Test
    void example1()
    {
      s = "anagram";
      t = "nagaram";

      expected = true;
      Assertions.assertTrue(expected == Anagram.isAnagram(s, t));
    }

    @Test
    void example2()
    {
        s = "rat";
        t = "car";

        expected = false;
        Assertions.assertTrue(expected == Anagram.isAnagram(s, t));
    }
}
