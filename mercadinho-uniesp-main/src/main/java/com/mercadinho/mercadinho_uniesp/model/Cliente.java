package com.mercadinho.mercadinho_uniesp.model;

import com.mercadinho.mercadinho_uniesp.validator.TelefoneBR;
import com.mercadinho.mercadinho_uniesp.validator.ValidCPF;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @TelefoneBR
    private String telefone;
    private String email;
    @ValidCPF
    private String cpf;
}