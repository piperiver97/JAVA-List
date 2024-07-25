package dev.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaListTest {
     private DiasDeLaSemana diasDeLaSemana;

    @BeforeEach
    public void setUp() {
        diasDeLaSemana = new DiasDeLaSemana();
    }

    @Test
    public void testObtenerDias() {
        List<String> dias = diasDeLaSemana.obtenerDias();
        assertEquals(7, dias.size());
        assertEquals("Lunes", dias.get(0));
        assertEquals("Domingo", dias.get(6));
    }

    @Test
    public void testObtenerLargo() {
        int largo = diasDeLaSemana.obtenerLargo();
        assertEquals(7, largo);
    }

    @Test
    public void testEliminarDia() {
        boolean eliminado = diasDeLaSemana.eliminarDia("Miércoles");
        assertTrue(eliminado);
        assertEquals(6, diasDeLaSemana.obtenerLargo());
        assertFalse(diasDeLaSemana.existeDia("Miércoles"));
    }

    @Test
    public void testObtenerDia() {
        String dia = diasDeLaSemana.obtenerDia(2);
        assertEquals("Miércoles", dia);
        dia = diasDeLaSemana.obtenerDia(10);
        assertNull(dia);
    }

    @Test
    public void testExisteDia() {
        assertTrue(diasDeLaSemana.existeDia("Viernes"));
        assertFalse(diasDeLaSemana.existeDia("Nochebuena"));
    }

    @Test
    public void testOrdenarDias() {
        diasDeLaSemana.ordenarDias();
        List<String> dias = diasDeLaSemana.obtenerDias();
        assertEquals("Domingo", dias.get(0));
        assertEquals("Viernes", dias.get(6));
    }

    @Test
    public void testVaciarLista() {
        diasDeLaSemana.vaciarLista();
        assertEquals(0, diasDeLaSemana.obtenerLargo());
    }
}