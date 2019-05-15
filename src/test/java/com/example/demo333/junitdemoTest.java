package com.example.demo333;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class junitdemoTest{


    @Before
    public void before(){
        junitdemo junitdemo = new junitdemo();       //因以下每个方法都涉及到实例化，所以这里直接写在before里

    }

    @Test
    public void testadd2() {
//        junitdemo junitdemo = new junitdemo();
        int o = junitdemo.add2(2,3);
        assertEquals(5,o);
    }

    @Test
    public void testreduce() {
//        junitdemo junitdemo = new junitdemo();
        int p = junitdemo.reduce(3,1);
        assertEquals(2,p);
    }
}