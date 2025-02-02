package com.lauro.shopapi.infrastructure.out;

import com.lauro.shopapi.application.transfer.out.TransferRepositoryPort;
import com.lauro.shopapi.domain.transfer.Transfer;
import com.lauro.shopapi.infrastructure.repository.TransferRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class TransferRepositoryAdapter implements TransferRepositoryPort {

    private final TransferRepository repository;

    @Transactional
    @Override
    public void doTransfer(final Transfer transfer) {
        log.info("Saving transfer of user: {}", transfer.getUsername());
        try {
            repository.save(transfer);
        } catch (Exception e) {
            log.error("Error saving transfer of user: {}", transfer.getUsername(), e);
        }
    }
}
