package com.lauro.shopapi.domain.transfer;

import com.lauro.shopapi.infrastructure.in.transfer.TransferDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String dni;
    private BigDecimal amount;
    private String description;
    private Status status;
    private String addressee;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public static Transfer toEntity(final TransferDto dto) {
        return new Transfer(null, dto.getUsername(), dto.getDni(), dto.getAmount(), dto.getDni(), Status.WAITING,
                dto.getAddressee(), LocalDateTime.now(), null);
    }

}
