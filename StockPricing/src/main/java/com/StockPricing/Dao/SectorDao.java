package com.StockPricing.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.StockPricing.model.Sector;

public interface SectorDao extends JpaRepository<Sector, Integer> {

}
