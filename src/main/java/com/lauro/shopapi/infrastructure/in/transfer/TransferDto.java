package com.lauro.shopapi.infrastructure.in.transfer;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TransferDto {
    private String username;
    private String dni;
    private BigDecimal amount;
    private String addressee;
    private LocalDateTime modifiedAt;
}
