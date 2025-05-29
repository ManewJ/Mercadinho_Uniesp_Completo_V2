package com.mercadinho.mercadinho_uniesp.repository;

import com.mercadinho.mercadinho_uniesp.model.Categoria; //importa a classe categoria
import org.springframework.data.jpa.repository.JpaRepository; //importa a interface JpaRepository
import org.springframework.stereotype.Repository; //importa a anotacao repository

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    boolean existsByNome(String nome); //consulta personalizada pra ver se existe uma categoria com o nome fornecido

}
