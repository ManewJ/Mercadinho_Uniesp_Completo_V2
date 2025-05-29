package com.mercadinho.mercadinho_uniesp.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor; // Adicione esta linha
import com.fasterxml.jackson.annotation.JsonManagedReference; // Se você estiver usando

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor // Mantenha esta
@AllArgsConstructor // Adicione esta anotação
@Table(name = "tb_venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime data;
    private BigDecimal valorTotal;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
    @JsonManagedReference // Mantenha isso se você adicionou antes
    private List<ItemVenda> itens;
}