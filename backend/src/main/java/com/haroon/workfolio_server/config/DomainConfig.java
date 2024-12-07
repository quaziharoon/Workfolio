package com.haroon.workfolio_server.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("com.haroon.workfolio_server.entity")
@EnableJpaRepositories("com.haroon.workfolio_server.repos")
@EnableTransactionManagement
public class DomainConfig {
}
