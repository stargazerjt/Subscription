package com.stargate.subscript;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.stargate.subscript.api.SubscriptionApi;

@Component
@ApplicationPath("/api")
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
    	register(SubscriptionApi.class);
    }
}
