package com.lauro.shopapi.application.transfer.out;

import com.lauro.shopapi.domain.transfer.Transfer;

public interface TransferRepositoryPort {

    void doTransfer(Transfer transfer);
}
