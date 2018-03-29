package com.example.ancong.myapplication;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void before() {
        System.out.println("start");
    }

    @AfterClass
    public static void after() {
        System.out.println("end");
    }

    @Before
    public void setUp() throws Exception {
        calculator = mock(Calculator.class);
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void add() throws Exception {
        //when(calculator.add(3,5)).thenReturn(8);
        calculator.add(3, 4);
        calculator.add(6, 5);

        verify(calculator, times(1)).add(3, 4);
    }

    @Test
    public void getMsg() {
        String msg = calculator.getMsg();
        System.out.println(msg);
        MatcherAssert.assertThat(msg, CoreMatchers.startsWith("this"));

    }

}