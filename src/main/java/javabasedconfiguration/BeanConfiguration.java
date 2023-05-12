package javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import pojobean.AccountRepository;
import pojobean.AccountService;

public class BeanConfiguration {
    @Bean
    public AccountService accountService(){
        AccountServiceImpl3 bean = new AccountServiceImpl3();
        bean.setAccountRepository(accountDao());
        return bean;
    }

    @Bean
    public AccountRepository accountDao() {
        AccountRepositoryImpl3 bean = new AccountRepositoryImpl3();
        return bean;
    }
}
