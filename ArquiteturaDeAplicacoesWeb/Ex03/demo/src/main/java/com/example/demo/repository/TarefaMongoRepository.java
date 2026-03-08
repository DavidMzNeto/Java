package com.exemplo.demo.repository;

import com.exemplo.tarefas.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaMongoRepository extends MongoRepository<Tarefa, String> {}

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}
