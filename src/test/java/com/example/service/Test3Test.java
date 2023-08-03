package com.example.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.Whitebox;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class Test3Test {

    @Test
    void test1(){
        Test3 t = new Test3();
        Whitebox.setInternalState(t,"param","generic");
        assertThat(t.method(),is("generic"));
    }

}