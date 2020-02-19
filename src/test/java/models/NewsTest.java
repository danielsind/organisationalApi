package models;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    public News setupNews(){
        return new News("Ceo, Bob Collimore, dies");
    }

    @Test
    public void newsInstantiatesCorrectly_true() {
        News newNews = setupNews();
        assertEquals(true, newNews instanceof News);
    }
}
