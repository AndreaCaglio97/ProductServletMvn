package it.intre.ProductServletMvn.test;

import org.junit.Test;

import static it.intre.ProductServletMvn.database.AttributeManager.checkIdProductString;
import static org.junit.Assert.assertEquals;

public class TestAttributeManager {
    @Test
    public void emptyIdProductReturnEmptyStringTest() {
        assertEquals("",checkIdProductString(""));
    }

    @Test
    public void notEmptyIdProductReturnStringForSelectTest() {
        assertEquals("id_product = 3 and\n",checkIdProductString("3"));
    }
}
