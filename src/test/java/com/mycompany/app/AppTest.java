package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testFoundOne() {
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
      assertEquals(new App().searchBetween(array, 4, 4), 1);
    }

    public void testFoundMany() {
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
      assertEquals(new App().searchBetween(array, 4, 4), 1);
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
      assertEquals(new App().searchBetween(array, 1, 6), 6);
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<Integer>();
      assertEquals(new App().searchBetween(array, 1, 3), 0);
    }

    public void testNull() {
      assertEquals(new App().searchBetween(null, 1, 5), 0);
    }
}
