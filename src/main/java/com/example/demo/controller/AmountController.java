package com.example.demo.controller;

import com.example.demo.calculate.CalculateAmount;
import com.example.demo.result.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
public class AmountController {

    private final CalculateAmount calculateAmount;

    @Autowired
    public AmountController(CalculateAmount calculateAmount) {
        this.calculateAmount = calculateAmount;
    }

    @PostMapping("/receiptResponse") // Use PostMapping for HTTP POST requests
    public Invoice receiptResponse(@RequestBody RequestBodyClass requestBody) {
        double gallonCapacity = requestBody.getGallonCapacity();
        double noOfGallonsInVehicle = requestBody.getNoOfGallonsInVehicle();

        // Assuming you have a method to generate and return an invoice
        return calculateAmount.getInvoice(gallonCapacity, noOfGallonsInVehicle);
    }
}
