package naufalazizi.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    @Test
    public void test() {
        var database = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database,database2);
    }
}
