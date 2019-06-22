package com.github.madz0.contexttest;

import com.github.madz0.contexttest.components.SomeComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = App.class)
@TestPropertySource(locations = "classpath:application.properties")
public class AppTest {

    @Autowired
    SomeComponent someComponent;

    @Test
    public void test() {
        someComponent.useConditionalComponent();
    }
}
