package com.novikoviam.tests;

import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class ExampleJunitTest {

    @BeforeAll
    static void configure() {

    System.out.println("    This is @BeforeAll");

    }

    @BeforeEach
    void beforeTest() {

        System.out.println("    This is @BeforeEach");

    }

    @AfterAll
    static void tearDown() {

        System.out.println("    This is @AfterAll");

    }

    @AfterEach
    void afterTest() {

        System.out.println("    This is @AfterEach");

    }


    @Test
     void firstTest0(){

        System.out.println("        This is @Test0");

        }

    @Test
    void firstTest1() {

        System.out.println("        This is @Test1");
    }

    }
