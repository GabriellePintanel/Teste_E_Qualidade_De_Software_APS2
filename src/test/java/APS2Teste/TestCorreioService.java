/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package APS2Teste;

import APS2.CorreioService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author fatec.senai
 */
public class TestCorreioService {
    
    public TestCorreioService() {
    }
    
    @Test
        public void testBuscaEnderecoPOA(){
        CorreioService cep = Mockito.mock(CorreioService.class);
        when(cep.BuscaEndereco(String.valueOf(9000000))).thenReturn(String.valueOf("Porto Alegre"));
        assertEquals("Porto Alegre", cep.BuscaEndereco(String.valueOf(9000000)));
        }
        @Test
        public void testBuscaEnderecoAssisBrasil(){
        CorreioService cep = Mockito.mock(CorreioService.class);
        when(cep.BuscaEndereco(String.valueOf(8000000))).thenReturn(String.valueOf("Av. Assis Brasi"));
        assertEquals("Av. Assis Brasi", cep.BuscaEndereco(String.valueOf(8000000)));
        }
}
