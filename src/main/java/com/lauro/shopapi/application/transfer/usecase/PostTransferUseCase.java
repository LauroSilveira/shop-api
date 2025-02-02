package com.lauro.shopapi.application.transfer.usecase;

import com.lauro.shopapi.application.transfer.in.TransferService;
import com.lauro.shopapi.application.transfer.out.TransferRepositoryPort;
import com.lauro.shopapi.domain.transfer.Transfer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostTransferUseCase implements TransferService {

    private final TransferRepositoryPort transferRepositoryPort;

    @Override
    public void doTransfer(final Transfer transfer) {
        log.info("Transfer received from user: {}", transfer.getUsername());
        transferRepositoryPort.doTransfer(transfer);
    }
}
