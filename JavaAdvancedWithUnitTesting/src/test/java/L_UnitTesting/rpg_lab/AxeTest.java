package L_UnitTesting.rpg_lab;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AxeTest {

    private static final int ATTACK = 10;
    private static final int DURABILITY = 15;
    private static final int HEALTH = 50;
    private static final int EXPERIENCE = 20;

    private Axe axe;
    private Axe brokenAxe;
    private Dummy dummy;

    @Before
    public void setUp() {
        this.axe = new Axe(ATTACK, DURABILITY);
        this.brokenAxe = new Axe(ATTACK,0);
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
    }

    @Test
    public void test_CreateAxe_ShouldSet_CorrectValues_ForAttackAndDurability() {

        assertEquals(ATTACK, axe.getAttackPoints());
        assertEquals(DURABILITY, axe.getDurabilityPoints());
    }

    @Test
    public void testAttack_Reduces_DurabilityPoints_ByOne() {

        axe.attack(dummy);
        int afterAttackDurability = axe.getDurabilityPoints();

        assertEquals(DURABILITY - 1, afterAttackDurability);
    }

    @Test(expected = IllegalStateException.class)
    public void testAttack_Throws_IfAxeDurability_IsLessThan_OrEqualToZero() {

        brokenAxe.attack(dummy);
    }

}
