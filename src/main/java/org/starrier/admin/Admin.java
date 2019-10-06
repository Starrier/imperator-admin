package org.starrier.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Imperator
 * @date 2019-09-22
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class Admin {

    public static void main(String[] args) {
        SpringApplication.run(Admin.class, args);
    }

}
