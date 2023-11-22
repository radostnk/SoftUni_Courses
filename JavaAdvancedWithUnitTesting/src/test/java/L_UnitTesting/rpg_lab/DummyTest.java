package L_UnitTesting.rpg_lab;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class DummyTest {

    private static final int ATTACK_POINTS = 10;
    private static final int HEALTH = 50;
    private static final int EXPERIENCE = 20;
    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
        this.deadDummy = new Dummy(0, EXPERIENCE);
    }

    @Test
    public void testTakeAttack_ReducesHealth_ByAttackPoints() {

        dummy.takeAttack(ATTACK_POINTS);
        assertEquals(HEALTH - ATTACK_POINTS, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testTakeAttack_Throws_IfHealth_IsEqualToOr_LessThanZero() {
        deadDummy.takeAttack(ATTACK_POINTS);
    }

    @Test(expected = IllegalStateException.class)
    public void testGiveExperience_Throws_IfHealth_IsMoreThanZero() {
        dummy.giveExperience();
    }

    @Test
    public void testGiveExperience_ReturnsExperience_IfHealth_IsLessThan_OrEqualToZero() {

        int experienceGiven = deadDummy.giveExperience();
        assertEquals(EXPERIENCE, experienceGiven);
    }

    @Test
    public void testIsDead_ReturnsTrue_IfHealth_IsLessThan_OrEqualToZero() {
        assertTrue(deadDummy.isDead());
    }
}