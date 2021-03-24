package com.psrao.learn.partner;

import com.psrao.learn.partner.contract.PartnerService;
import com.psrao.learn.partner.annotation.Partner1;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(prefix = "partner", name = "name", havingValue = "Partner1")
@Partner1
public class Partner1Impl implements PartnerService {
    @Override
    public String getPartnerName() {
        return "Partner1";
    }

//    @Bean
//    public PartnerService getPartnerService() {
//        return new Partner1Impl();
//    }
}
