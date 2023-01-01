package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;
class GeoServiceImplTest {
    @Test
    void byIp() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location expected = new Location(("New York"), Country.USA, null, 0);
        Location actual = geoService.byIp("96. ");
        assertEquals(expected.getCity(), actual.getCity());
        assertEquals(expected.getCountry(), actual.getCountry());
    }

    @Test
    void test_Location_byCoordinates() {

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
            GeoServiceImpl exception = new GeoServiceImpl();
            exception.byCoordinates(1, 1);
        });

        Assertions.assertEquals("Not implemented", thrown.getMessage());
    }

}