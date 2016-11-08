package com.example.alex.main.test;

import com.example.alex.main.testapi.MainActivity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityTest {
    @Test(expected = IllegalArgumentException.class)
    public void testYminValue() {
        MainActivity main = new MainActivity();
        main.getSum(99);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testYmaxValue() {
        MainActivity main = new MainActivity();
        main.getSum(1000);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRootNeg(){
        MainActivity main = new MainActivity();
        main.getRoot(-1);
    }
    @Test
    public void testSum(){
        MainActivity main = new MainActivity();
        int x = main.getSum(555);
        assertEquals(15, x);
    }
}