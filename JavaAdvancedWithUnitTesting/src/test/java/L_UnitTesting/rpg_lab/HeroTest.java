package L_UnitTesting.rpg_lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class HeroTest {

    private static final String NAME = "CoolHero";
    private static final int EXPERIENCE = 10;
    private Target target;
    private Hero hero;

    @Before
    public void setUp() {
        target = mock(Target.class);
        hero = new Hero(NAME);
    }

    @Test
    public void testAttack_GivesExperience_IfDummy_IsDead() {
        when(target.isDead()).thenReturn(true);
        when(target.giveExperience()).thenReturn(EXPERIENCE);

        hero.attack(target);
        assertEquals(EXPERIENCE, hero.getExperience());
    }

    @Test
    public void testGetWeapon_ReturnsLoot_WhenKillingATarget() {

    }
}
