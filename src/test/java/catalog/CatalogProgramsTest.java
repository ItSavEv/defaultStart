package catalog;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CatalogProgramsTest {

    @Test (groups = "Unit")
    public void Sample() {
        System.out.println("Hi guys");
        Assert.assertEquals("1","2");
    }

    @Test (groups = "Web")
    public void Samle1() {
        System.out.println("My");
    }

    @Test (groups ="Test")
    public void Sample2() {
        System.out.println("name");
    }

    @Test (groups = "Unit")
    public void Sample3() {
        System.out.println("Test");
    }
}
