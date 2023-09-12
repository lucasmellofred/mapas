/**
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class MapaTest {
    private Mapa<String, Integer> mapa;

    @Before
    public void setUp() {
        mapa = new Mapa<>();
    }

    @Test
    public void testPutAndGet() {
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("tres", 3);

        assertEquals(Integer.valueOf(1), mapa.get("um"));
        assertEquals(Integer.valueOf(2), mapa.get("dois"));
        assertEquals(Integer.valueOf(3), mapa.get("tres"));
    }

    @Test
    public void testSizeAndIsEmpty() {
        assertEquals(0, mapa.size());
        assertEquals(true, mapa.isEmpty());

        mapa.put("chave", 42);

        assertEquals(1, mapa.size());
        assertEquals(false, mapa.isEmpty());
    }

    @Test
    public void testGetNonExistentKey() {
        assertNull(mapa.get("inexistente"));
    }
}
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class MapaTest {
    private Mapa<String, Integer> mapa;

    @Before
    public void setUp() {
        mapa = new Mapa<>();
    }

    @Test
    public void testPutAndGet() {
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("tres", 3);

        assertEquals(Integer.valueOf(1), mapa.get("um"));
        assertEquals(Integer.valueOf(2), mapa.get("dois"));
        assertEquals(Integer.valueOf(3), mapa.get("tres"));
    }

    @Test
    public void testSizeAndIsEmpty() {
        assertEquals(0, mapa.size());
        assertEquals(true, mapa.isEmpty());

        mapa.put("chave", 42);

        assertEquals(1, mapa.size());
        assertEquals(false, mapa.isEmpty());
    }

    @Test
    public void testGetNonExistentKey() {
        assertNull(mapa.get("inexistente"));
    }
}
