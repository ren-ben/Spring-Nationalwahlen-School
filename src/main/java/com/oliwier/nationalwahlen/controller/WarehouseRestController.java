package com.oliwier.nationalwahlen.controller;

import com.oliwier.nationalwahlen.model.PartyData;
import com.oliwier.nationalwahlen.model.WarehouseData;
import com.oliwier.nationalwahlen.WarehouseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class WarehouseRestController {

    private final WarehouseService service;

    @GetMapping("/parties")
    @Tag(name = "API")
    public List<PartyData> getParties() {
        WarehouseData data = service.getWarehouseData("001");
        return data.getParties();
    }
}