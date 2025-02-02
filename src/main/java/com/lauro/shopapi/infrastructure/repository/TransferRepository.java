package com.lauro.shopapi.infrastructure.repository;

import com.lauro.shopapi.domain.transfer.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
