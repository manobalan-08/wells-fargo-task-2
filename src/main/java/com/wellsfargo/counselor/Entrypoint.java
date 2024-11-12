
package com.wellsfargo.counselor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Entrypoint {

  public static void main(String[] args) {
    SpringApplication.run(Entrypoint.class, args);

    Advisor advisor = new Advisor();
    advisor.setAdvisorName("Manobalan M");
    advisor.setPortfolios(50);
    advisor.setUpdatePortfolio(10);

    System.out.println("Hello! I am your financial advisor Mr.: " + advisor.getAdvisorName());
    System.out.println("I have to create portfolios for my customers and I am glad in doing so: " + advisor.getPortfolios());
    System.out.println("I have to update the portfolios: " + advisor.getUpdatePortfolio());
    System.out.println("Removed the Portfolios of Ex-customers: " + advisor.decrementPortfolioCount());
  }
}
