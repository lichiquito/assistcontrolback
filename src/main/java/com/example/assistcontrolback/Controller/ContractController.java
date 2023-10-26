package com.example.assistcontrolback.Controller;

import com.example.assistcontrolback.Model.Contract;
import com.example.assistcontrolback.Model.User;
import com.example.assistcontrolback.Service.ContractService;
import com.example.assistcontrolback.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipocontrato")
public class ContractController {
    @Autowired
    private ContractService contractService;

    // Create a new contract
    @PostMapping
    public Contract createContract(@RequestBody Contract contract) {
        return contractService.createContract(contract);
    }

    // Get all contract
    @GetMapping
    public List<Contract> getAllContracts() {
        return contractService.getAllContract();
    }

    // Get contract by ID
    @GetMapping("/{tipocontratoid}")
    public Optional<Contract> getContractById(@PathVariable Long id) {
        return contractService.getContractById(id);
    }

    // Update contract by ID
    @PutMapping("/{tipocontratoid}")
    public Contract updateContract(@PathVariable Long id, @RequestBody Contract contractDetails) {
        return contractService.updateContract(id, contractDetails);
    }

    // Delete all contract
    @DeleteMapping
    public String deleteAllContract() {
        contractService.deleteAllContracts();
        return "All users have been deleted successfully.";
    }

    // Delete contract by ID
    @DeleteMapping("/{tipocontratoid}")
    public void deleteContract(@PathVariable Long id) {
        contractService.deleteContract(id);
    }
}

