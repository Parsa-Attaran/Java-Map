import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyMapTest {
     static MyMap<Integer,String> myMap;
    @BeforeEach
    public void initalize(){
        myMap = new MyMap<>();
    }
    @Test
    public void TestSize() {
        assertTrue(myMap.size() == 0);
        myMap.put(1,"a");
        myMap.put(2,"b");
        myMap.put(3,"c");
        assertTrue(myMap.size() == 3);
        myMap.put(3,"d");
        assertTrue(myMap.size() == 3);
    }
    @Test public void TestPutAndGet() {
        myMap.put(1,"a");
        myMap.put(2,"b");
        myMap.put(3,"c");
        assertEquals("a", myMap.get(1));
        assertEquals("b", myMap.get(2));
        assertEquals("c", myMap.get(3));

    }
    @Test
    void testGetMissingKey() {
        MyMap<String, String> map = new MyMap<>();
        assertNull(map.get("unknown"));
    }
}
