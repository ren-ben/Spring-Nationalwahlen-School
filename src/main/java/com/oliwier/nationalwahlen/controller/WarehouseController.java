package com.oliwier.nationalwahlen.controller;

import com.oliwier.nationalwahlen.WarehouseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import com.oliwier.nationalwahlen.model.WarehouseData;

@RestController
@AllArgsConstructor
public class WarehouseController {

    private WarehouseService service;

    @GetMapping("/")
    @Tag(name = "Landing Page")
    public String warehouseMain() {
        return "This is the warehouse application! (DEZSYS_WAREHOUSE_REST) <br/><br/>" +
                "<a href='http://localhost:4200/warehouse/001/data?format=json'>Link to warehouse/001/data (JSON)</a><br/>" +
                "<a href='http://localhost:4200/warehouse/001/data?format=xml'>Link to warehouse/001/data (XML)</a><br/>" +
                "<a href='http://localhost:4200/gridTable.html'>Link to Table View</a><br/>" +
                "<a href='http://localhost:4200/swagger-ui/index.html#/'>Link to SwaggerUI</a><br/>";
    }

    @GetMapping(value = "/warehouse/{inID}/data", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @Tag(name = "Raw Data")
    public ResponseEntity<WarehouseData> warehouseData(@PathVariable String inID,
                                                       @RequestParam(value = "format", required = false, defaultValue = "json") String format) {
        WarehouseData data = service.getWarehouseData(inID);

        HttpHeaders headers = new HttpHeaders();
        if ("xml".equalsIgnoreCase(format)) {
            headers.setContentType(MediaType.APPLICATION_XML);
        } else {
            headers.setContentType(MediaType.APPLICATION_JSON);
        }

        return new ResponseEntity<>(data, headers, HttpStatus.OK);
    }

}