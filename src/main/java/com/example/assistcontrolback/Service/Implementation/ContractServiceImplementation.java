package com.example.assistcontrolback.Service.Implementation;

import com.example.assistcontrolback.Model.Contract;
import com.example.assistcontrolback.Model.User;
import com.example.assistcontrolback.Repository.ContractRepository;
import com.example.assistcontrolback.Repository.UserRepository;
import com.example.assistcontrolback.Service.ContractService;
import com.example.assistcontrolback.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractServiceImplementation implements ContractService {
    @Autowired
    private ContractRepository contractRepository;

    // Create a new contract
    public Contract createContract(Contract contract) {
        return contractRepository.save(contract);
    }

    // Get all contracts
    public List<Contract> getAllContract() {
        return contractRepository.findAll();
    }

    // Get contract by ID
    public Optional<Contract> getContractById(Long id) {
        return contractRepository.findById(id);
    }

    // Update contract
    public Contract updateContract(Long id, Contract contractDetails) {
        Optional<Contract> contract = contractRepository.findById(id);
        if (contract.isPresent()) {
            Contract existingContract = contract.get();
            existingContract.setNameContract(contractDetails.getNameContract());
            return contractRepository.save(existingContract);
        }
        return null;
    }

    // Delete all contracts
    public void deleteAllContracts() {
        contractRepository.deleteAll();
    }

    // Delete contract
    public void deleteContract(Long id) {
        contractRepository.deleteById(id);
    }
}