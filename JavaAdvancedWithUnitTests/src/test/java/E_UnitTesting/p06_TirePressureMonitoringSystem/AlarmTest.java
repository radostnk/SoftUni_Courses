package E_UnitTesting.p06_TirePressureMonitoringSystem;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AlarmTest {

    private Alarm alarm;
    private Sensor sensor;

    @Before
    public void setUp() {
        sensor = mock(Sensor.class);
        alarm = new Alarm(sensor);
    }

    @Test
    public void testCheck_TurnsAlarmOn_IfPressureIsLessThan_17() {
        when(sensor.popNextPressurePsiValue()).thenReturn(16.0);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testCheck_TurnsAlarmOn_IfPressureIsMoreThan_21() {
        when(sensor.popNextPressurePsiValue()).thenReturn(22.0);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testCheck_DoesNotTurnAlarmOn_IfPressureIsInRange() {
        when(sensor.popNextPressurePsiValue()).thenReturn(19.0);
        alarm.check();
        assertFalse(alarm.getAlarmOn());
    }

}