package com.example.assistcontrolback.Service;

import com.example.assistcontrolback.Model.Contract;

import java.util.List;
import java.util.Optional;

public interface ContractService {
    Contract createContract(Contract contract);

    List<Contract> getAllContract();

    Optional<Contract> getContractById(Long id);

    Contract updateContract(Long id, Contract contractDetails);

    void deleteAllContracts();

    void deleteContract(Long id);
}
