import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = null;
        Integer expectedAge = 0;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

           Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetHairColor(){
        //given
        Person person = new Person();
        String expected = "Black";
        //when
        person.setHairColor("Black");
        String actual = person.getHairColor();
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSetHasKids(){
        //given
        Person person = new Person();
        //when
        person.setHasKids(true);
        boolean actual = person.isHasKids();
        //then
        Assertions.assertTrue(actual);
    }
    @Test
    public void testSetHeight(){
        //given
        Person person = new Person();
        double heightExpected = 5.0;
        //then
        person.setHeight(5.0);
        double actual = person.getHeight();

        //when
        Assertions.assertEquals(heightExpected,actual, .1);
    }
    @Test
    public void testSetSex(){
        //given
        Person person = new Person();
        char expected = 'M';
        //when
        person.setSex('M');
        char actual = person.getSex();
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSetHomeState(){
        //given
        Person person = new Person();
        String expected = "Delaware";
        // when
        person.setHomeState("Delaware");
        String actual = person.getHomeState();
        //then
        Assertions.assertEquals(expected,actual);
    }
}
