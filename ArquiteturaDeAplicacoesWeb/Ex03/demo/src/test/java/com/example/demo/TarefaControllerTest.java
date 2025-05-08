package com.exemplo.tarefas.controller;

import com.exemplo.tarefas.model.Tarefa;
import com.exemplo.tarefas.service.TarefaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TarefaControllerTest {

    @InjectMocks
    private TarefaController tarefaController;

    @Mock
    private TarefaService tarefaService;

    private Tarefa tarefa;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        tarefa = new Tarefa();
        tarefa.setId(1L);
        tarefa.setTitulo("Estudar Spring");
        tarefa.setDescricao("Fazer curso de Spring Boot");
        tarefa.setStatus("Em andamento");
        tarefa.setDataCriacao(LocalDateTime.now());
    }

    @Test
    void testListarTarefas() {
        when(tarefaService.listar()).thenReturn(List.of(tarefa));

        List<Tarefa> resultado = tarefaController.listar();

        assertEquals(1, resultado.size());
        assertEquals("Estudar Spring", resultado.get(0).getTitulo());
    }

    @Test
    void testCriarTarefa() {
        when(tarefaService.criar(any(Tarefa.class))).thenReturn(tarefa);

        Tarefa resultado = tarefaController.criar(tarefa);

        assertEquals("Estudar Spring", resultado.getTitulo());
        verify(tarefaService, times(1)).criar(tarefa);
    }

    @Test
    void testAtualizarTarefa() {
        when(tarefaService.atualizar(eq(1L), any(Tarefa.class))).thenReturn(tarefa);

        Tarefa resultado = tarefaController.atualizar(1L, tarefa);

        assertEquals(1L, resultado.getId());
        verify(tarefaService).atualizar(1L, tarefa);
    }

    @Test
    void testExcluirTarefa() {
        doNothing().when(tarefaService).excluir(1L);

        assertDoesNotThrow(() -> tarefaController.excluir(1L));

        verify(tarefaService, times(1)).excluir(1L);
    }
}
