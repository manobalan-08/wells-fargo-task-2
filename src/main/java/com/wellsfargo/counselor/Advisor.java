// File: Advisor.java
package com.wellsfargo.counselor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Advisor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false)
  private String advisorName;

  private int portfolios;
  private int updatePortfolio;

  public Advisor() {}

  public Advisor(String advisorName, int portfolios, int updatePortfolio) {
    this.advisorName = advisorName;
    this.portfolios = portfolios;
    this.updatePortfolio = updatePortfolio;
  }

  public long getId() {
    return id;
  }

  public String getAdvisorName() {
    return advisorName;
  }

  public void setAdvisorName(String advisorName) {
    this.advisorName = advisorName;
  }

  public int getPortfolios() {
    return portfolios;
  }

  public void setPortfolios(int portfolios) {
    this.portfolios = portfolios;
  }

  public int getUpdatePortfolio() {
    return updatePortfolio;
  }

  public void setUpdatePortfolio(int updatePortfolio) {
    this.updatePortfolio = updatePortfolio;
  }

  public int incrementPortfolioCount() {
    return ++portfolios;
  }

  public int decrementPortfolioCount() {
    return --portfolios;
  }

  @Override
  public String toString() {
    return "Advisor{id=" + id + ", advisorName='" + advisorName + "', portfolios=" + portfolios + ", updatePortfolio=" + updatePortfolio + "}";
  }
}
