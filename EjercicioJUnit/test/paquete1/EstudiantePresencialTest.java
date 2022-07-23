/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALA I
 */
public class EstudiantePresencialTest {

    private EstudiantePresencial instance;

    public EstudiantePresencialTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new EstudiantePresencial();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerNumeroCreditos() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {

        System.out.println("establecerNumeroCreditos");
        int numero = 15;
        instance.establecerNumeroCreditos(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 15);

    }

    @Test
    public void testEstablecerCostoCredito() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("establecerCostoCredito");
        double valor = 45.63;
        instance.establecerCostoCredito(valor);
        Field field = instance.getClass().getDeclaredField("costoCredito");
        field.setAccessible(true);
        assertEquals(field.get(instance), 45.63);
    }

    @Test
    public void testCalcularMatriculaPresencial() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("calcularMatriculaPresencial");
        instance.establecerCostoCredito(45.63);
        instance.establecerNumeroCreditos(15);
        instance.calcularMatriculaPresencial();
        Field field = instance.getClass().getDeclaredField("matriculaPresencial");
        field.setAccessible(true);
        assertEquals(field.get(instance), 684.45);

    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        int expResult = 15;
        instance.establecerNumeroCreditos(15);
        int result = instance.obtenerNumeroCreditos();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        double expResult = 46.64;
        instance.establecerCostoCredito(46.64);
        double result = instance.obtenerCostoCredito();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");
        instance.establecerCostoCredito(45.63);
        instance.establecerNumeroCreditos(15);
        instance.calcularMatriculaPresencial();       
        double expResult = 684.45;
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 0.0);
        
    }

}
