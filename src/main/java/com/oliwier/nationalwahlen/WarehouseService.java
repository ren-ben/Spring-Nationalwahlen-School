package com.oliwier.nationalwahlen;

import org.springframework.stereotype.Service;
import com.oliwier.nationalwahlen.model.WarehouseData;

@Service
public class WarehouseService {

    public WarehouseData getWarehouseData( String inID ) {
        WarehouseSimulation simulation = new WarehouseSimulation();
        return simulation.getData(inID);
    }

}