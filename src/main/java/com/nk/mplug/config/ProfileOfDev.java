package com.nk.mplug.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Func : 按环境加载
 *
 * @author: leeton on 2019/6/25.
 */
@Component
public class ProfileOfDev implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        List<String> profiles= Arrays.asList(environment.getActiveProfiles());
        return profiles.contains("dev");
    }
}
