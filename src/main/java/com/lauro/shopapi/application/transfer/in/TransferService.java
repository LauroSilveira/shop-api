package com.lauro.shopapi.application.transfer.in;

import com.lauro.shopapi.domain.transfer.Transfer;

public interface TransferService {

    void doTransfer(Transfer transfer);
}
