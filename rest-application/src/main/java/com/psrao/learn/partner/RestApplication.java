package com.psrao.learn.partner;

import com.psrao.learn.partner.contract.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = "com.psrao.learn.partner")
@ComponentScan(basePackages = {"com.psrao.learn.partner"})
@EntityScan({"com.psrao.learn.partner"})
@RestController
public class RestApplication {

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private PartnerService partnerService;

    @GetMapping("/")
    public String home() {
        return "Hello Universe!!";
    }

    @GetMapping("/partner-name")
    public String partnerName() {
        return partnerService.getPartnerName();
    }

    @GetMapping("/beans")
    public String[] listBeans() {
        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        return beans;
    }

//    @Bean
//    public PartnerService getPartnerService() {
//        return new Partner1Impl();
//    }

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}
