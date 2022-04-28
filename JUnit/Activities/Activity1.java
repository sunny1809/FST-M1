package activities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Activity1 {
   
    static ArrayList<String> l;

    
    @BeforeAll
    static void setUp() throws Exception {
        l = new ArrayList<String>();
        l.add("Dipa"); 
        l.add("Asna"); 
    }

   
    @Test
    @Order(1)
    public void insertTest() {
        
        assertEquals(2, l.size(), "Wrong size");
       
        l.add(2, "Dipu");
        
        assertEquals(3, l.size(), "Wrong size");

       
        assertEquals("Dipa", l.get(0), "Wrong name");
        assertEquals("Asna", l.get(1), "Wrong name");
        assertEquals("Dipu", l.get(2), "Wrong name");
    }

   
    @Test
    @Order(2)
   
    public void replaceTest() {
      
        l.set(1, "Dipu");

     
        assertEquals(2, l.size(), "Wrong size");
       
        assertEquals("Dipa", l.get(0), "Wrong name");
        assertEquals("Dipu", l.get(1), "Wrong name");
    }
}