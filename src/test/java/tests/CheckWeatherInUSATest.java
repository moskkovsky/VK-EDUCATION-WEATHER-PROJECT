package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static constants.Values.*;
import static org.junit.jupiter.api.Assertions.*;

public class CheckWeatherInUSATest {

    @Test
    @DisplayName("Погода в Сан-Франциско должна быть 12 градусов")
    public void testWeatherInSanFrantz() {
        assertEquals(EXPECTED_WEATHER_IN_SAN_FRANTZ, WEATHER_IN_SAN_FRANTZ, "Ожидается, что погода в Сан-Франциско будет " + EXPECTED_WEATHER_IN_SAN_FRANTZ + " градусов");
    }

    @Test
    @DisplayName("Погода в Сан-Франциско должна быть 18 градусов")
    public void testWeatherInDallas() {
        assertEquals(EXPECTED_WEATHER_IN_DALLAS, WEATHER_IN_DALLAS, "Ожидается, что погода в Далласе будет " + EXPECTED_WEATHER_IN_DALLAS + " градусов");
    }

    @Test
    @DisplayName("Сравнение погоды в Сан-Франциско и Далласе")
    public void testWeatherInSanFrantzLessDallas() {
        assertTrue(WEATHER_IN_SAN_FRANTZ < WEATHER_IN_DALLAS, "Ожидается, что погода в Сан-Франциско (" + WEATHER_IN_SAN_FRANTZ +
                ") будет меньше, чем в Далласе (" + WEATHER_IN_DALLAS + ")");
    }
}
