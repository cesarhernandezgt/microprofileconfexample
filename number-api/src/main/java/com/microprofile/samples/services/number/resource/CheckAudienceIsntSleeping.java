package com.microprofile.samples.services.number.resource;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

@Health
@ApplicationScoped
public class CheckAudienceIsntSleeping implements HealthCheck {

    private Random random = new Random(System.nanoTime());

    public HealthCheckResponse call() {
        return HealthCheckResponse.named("Audience").state(random.nextBoolean()).build();
    }
}
