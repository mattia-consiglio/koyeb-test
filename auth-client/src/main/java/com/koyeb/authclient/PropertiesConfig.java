package com.koyeb.authclient;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "file:./auth-client/env.properties", ignoreResourceNotFound = true)
public class PropertiesConfig {
    // La classe può rimanere vuota. Serve solo per definire l'annotazione @PropertySource
}
