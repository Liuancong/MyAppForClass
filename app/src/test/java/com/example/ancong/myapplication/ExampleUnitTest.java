package com.example.ancong.myapplication;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("a", "aili");
        Collections.addAll(list, 1, 2, 3, 4, 5);
        MatcherAssert.assertThat(map, hasEntry("a", "aili"));
        MatcherAssert.assertThat(list, CoreMatchers.hasItems(1, 2));
        MatcherAssert.assertThat("123", CoreMatchers.containsString("1"));
        MatcherAssert.assertThat("huwenxiaoqiang is handsome", allOf(CoreMatchers.endsWith("handsome"), CoreMatchers.startsWith("huwenqiang")));
    }
}