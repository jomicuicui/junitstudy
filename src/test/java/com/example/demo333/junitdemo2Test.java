package com.example.demo333;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class junitdemo2Test{

    @Test
    public void multiplication() {
        junitdemo2 junitdemo2 = new junitdemo2();
        int t = junitdemo2.multiplication(3,4);
        assertEquals(t,12);
    }
}