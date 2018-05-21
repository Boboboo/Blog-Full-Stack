package com.bobo.blog.web;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


//@RunWith(SpringJUnit4ClassRunner.class)
//
//@SpringBootApplication((classes = MockServletContext.class))
//
//@WebAppConfiguration
//public class indexControllerTests {
//
//    private MockMvc mvc;
//
//    @Before
//    public void setUp() throws Exception {
//
//        mvc = MockMvcBuilders.standaloneSetup(new indexController()).build();
//    }
//
//
//}
