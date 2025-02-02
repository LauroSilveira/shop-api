package com.lauro.shopapi.infrastructure.in.kafka;

import com.lauro.shopapi.application.transfer.usecase.PostTransferUseCase;
import com.lauro.shopapi.domain.transfer.Transfer;
import com.lauro.shopapi.infrastructure.in.transfer.TransferDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class TransferTopicLister {

    private final PostTransferUseCase postTransferUseCase;

    @KafkaListener(topics = "transfer-topic", groupId = "transfer-group")
    public void process(final TransferDto dto, final Acknowledgment acknowledgment) {
        log.info("Processing transfer from user: {}", dto.getUsername());
        postTransferUseCase.doTransfer(Transfer.toEntity(dto));
        // Mark the message  as read
        acknowledgment.acknowledge();
    }
}
