package com.github.madz0.contexttest.components;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${prop.test}")
public class ConditionalComponentImpl implements ConditionalComponent {
    @Override
    public void component() {

    }
}
