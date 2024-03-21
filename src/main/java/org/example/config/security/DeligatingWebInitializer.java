package org.example.config.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class DeligatingWebInitializer  extends AbstractSecurityWebApplicationInitializer {
    @Override
    protected boolean enableHttpSessionEventPublisher() {
        return true;
    }
}
