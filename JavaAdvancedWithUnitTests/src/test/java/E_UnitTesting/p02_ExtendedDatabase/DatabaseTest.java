package E_UnitTesting.p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import javax.xml.crypto.Data;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    private Database database;
    private static final Person[] PEOPLE = new Person[] {new Person(1, "Tom"),
                                            new Person(2, "Ana"),
                                            new Person(3, "Jack")};;
    private static final int INITIAL_SIZE = PEOPLE.length;

    @Before
    public void setUp() throws OperationNotSupportedException {
        database = new Database(PEOPLE);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testCreateDatabase_Throws_IfPeopleAre_LessThan_1() throws OperationNotSupportedException {
        Database emptyDatabase = new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testCreateDatabase_Throws_IfPeopleAre_MoreThan_16() throws OperationNotSupportedException {
        Database emptyDatabase = new Database(new Person[17]);
    }

    @Test
    public void testAddPerson() throws OperationNotSupportedException {
        Person newPerson = new Person(4, "Molly");
        database.add(newPerson);

        Person[] peopleAfterAdd = database.getElements();
        int actualSize = peopleAfterAdd.length;
        int actualId = peopleAfterAdd[actualSize - 1].getId();
        String actualName = peopleAfterAdd[actualSize - 1].getUsername();

        assertEquals(INITIAL_SIZE + 1, actualSize);
        assertEquals(newPerson.getId(), actualId);
        assertEquals(newPerson.getUsername(), actualName);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddPerson_Throws_IfPersonIsNull() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testRemovePerson() throws OperationNotSupportedException {
        int expectedSize = INITIAL_SIZE - 1;
        int expectedIdLast = PEOPLE[INITIAL_SIZE - 2].getId();
        String expectedNameLast = PEOPLE[INITIAL_SIZE - 2].getUsername();

        database.remove();
        int actualSize = database.getElements().length;
        int actualIdLast = PEOPLE[actualSize - 1].getId();
        String actualNameLast = PEOPLE[actualSize - 1].getUsername();

        assertEquals(expectedSize, actualSize);
        assertEquals(expectedIdLast, actualIdLast);
        assertEquals(expectedNameLast, actualNameLast);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemovePerson_Throws_IfDatabaseIsEmpty() throws OperationNotSupportedException {
        for (int i = 0; i <= INITIAL_SIZE; i++) {
            database.remove();
        }
    }

    @Test
    public void testGetElements() {
        assertArrayEquals(PEOPLE, database.getElements());
    }


    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsername_Throws_IfUsernameIsNull() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsername_Throws_IfNoSuchUsername() throws OperationNotSupportedException {
        database.findByUsername("Tommy");
    }

    @Test
    public void testFindByUsername() throws OperationNotSupportedException {
        String expectedName = "Tom";
        int expectedId = 1;

        Person actualPerson = database.findByUsername(expectedName);
        assertEquals(expectedName, actualPerson.getUsername());
        assertEquals(expectedId, actualPerson.getId());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindById_Throws_IfNoSuchId() throws OperationNotSupportedException {
        database.findById(100);
    }

    @Test
    public void testFindById() throws OperationNotSupportedException {
        String expectedName = "Ana";
        int expectedId = 2;

        Person actualPerson = database.findById(expectedId);
        assertEquals(expectedName, actualPerson.getUsername());
        assertEquals(expectedId, actualPerson.getId());
    }


}