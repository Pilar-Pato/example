package org.factoriaf5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void testSumar(){

     //Given
    Example example = new Example();
    int num1 = 35;
    int num2 = 79;

    //When 
    int result = example.sumar(num1, num2);


    //Then
    assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
}
    @Test
    public void testCheckNegative() {

    Example example = new Example();
    int num = -99;
    boolean negativo;

        try {
            negativo = Example.checkPositivo(num);
        } catch (IllegalArgumentException e) {
            negativo = false;
        }
        assertFalse(negativo);
    }

    @Test
    public void testCheckPositive() {
        int num = 99;

        boolean resultado = Example.checkPositivo(num);

        assertTrue(resultado);
    }

    @Test
    public void testContarLetrasA(){

        Example example = new Example();
        int resultado = example.contarLetrasA("lana");
        assertEquals(2, resultado);

        resultado = example.contarLetrasA("verde");
        assertEquals(0, resultado);
    }
    @Test
    public void testContieneElemento(){

        Example example = new Example();
        List<String> lista = List.of("dalmata", "caniche", "chihuahua");
        boolean resultado = example.contieneElemento(lista, "dalmata");
        assertTrue(resultado);
    }
    @Test
    public void testNocontieneElemento() {
        Example example = new Example();
        List<String> lista = List.of("pez", "gato", "perro");
        boolean resultado = example.contieneElemento(lista, "cuadro");
        assertFalse(resultado);

    }
    @Test
    public void testRevertirCadena(){
        Example example = new Example();
        String cadena = "ines";
        String reverseCadena = "seni";
        String resultado = example.revertirCadena(cadena);

        assertTrue(resultado.equals(reverseCadena));
    }
    @Test
    public void testFactorial(){
        Example example = new Example();
        int numero = 5;
        long resultadoFactorial = 120;
        long resultado = example.factorial(numero);

        assertTrue(resultado == resultadoFactorial);
    }
    @Test
    public void testFactorialException() {
        Example example = new Example();
        assertThrows(IllegalArgumentException.class, () -> example.factorial(-1));
    }
    @Test
    public void testEsPrimo(){
        Example example = new Example();
        int numero = 2;
        boolean resultado = example.esPrimo(numero);

        assertTrue(resultado);
    }
    @Test
    public void testEsPrimoNoLoes(){
        Example example = new Example();
        int numero = 0;
        boolean resultado = example.esPrimo(numero);

        assertFalse(resultado);
    }
    @Test
    public void testNoEsPrimo(){
        Example example = new Example();
        int numero = 12;
        boolean resultado = example.esPrimo(numero);

        assertFalse(resultado);
    }
    @Test
    public void testEsPrimoNegativo() {
        Example example = new Example();
        int numero = -1;
        boolean resultado = example.esPrimo(numero);
    
        assertFalse(resultado);
    }
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        Example example = new Example();
        String resultado = example.mensajeConRetraso();

        assertEquals("Listo después de retraso", resultado);
    }
    @Test
    public void testConvertirAString() {
        Example example = new Example();
        List<Integer> lista = Arrays.asList(1, 2, 3);
        List<String> expectedResult = Arrays.asList("1", "2", "3");

        List<String> actualResult = example.convertirAString(lista);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCalcularMedia(){
        Example example = new Example();
        List<Integer> lista = Arrays.asList(10, 50, 30);
        double media = example.calcularMedia(lista);
        assertEquals(30.0, media);
    }

    @Test
    public void testCalcularMediaEmpty() {
        Example example = new Example();
        List<Integer> lista = List.of();
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(lista));
    }

    @Test
    public void testCalcularMediaNull() {
        Example example = new Example();
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(null));
    }
    @Test
    public void testConvertirListaAString(){
        Example example = new Example();
        List<String> lista = Arrays.asList("Hello", null, "world");
        String resultado = example.convertirListaAString(lista);

        assertEquals("HELLO,NULL,WORLD", resultado);
    }

    @Test
    public void testConvertirListaEmpty() {
        Example example = new Example();
        List<String> lista = List.of();
        String resultado = example.convertirListaAString(lista);

        assertEquals("", resultado);
    }

    @Test
    public void testConvertirListaNulls() {
        Example example = new Example();
        List<String> lista = Arrays.asList(null, null, null);
        String resultado = example.convertirListaAString(lista);

        assertEquals("NULL,NULL,NULL", resultado);
    }
}

    
  

