package ua.ithillel.homework.hw17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilTest {

    @Test
    void shouldReturnArrayAfterLastFour() {
        int[] array = {1,4,8,4,0,3,4,7,6};
        int[] expected = {7,6};
        Assertions.assertArrayEquals(expected, MathUtils.arrayFormatting(array));
    }

    @Test
    void shouldThrowRuntimeException_whenDoesNotGivenFourInArray() {
        int[] array = {1,5,6};
        Assertions.assertThrowsExactly(RuntimeException.class, () -> MathUtils.arrayFormatting(array));
    }

    @Test
    void shouldContainOneOrFour_whenGivenArrayWithDifferentDigits() {
        int[] array = {1, 3, 4};
        Assertions.assertFalse(MathUtils.filterFourAndOne(array));
    }

    @Test
    void shouldContainOneOrFour_whenGivenArrayWithAllOneDigits() {
        int[] array = {1, 1, 1};
        Assertions.assertFalse(MathUtils.filterFourAndOne(array));
    }

    @Test
    void shouldContainOneOrFour_whenGivenArrayWithAllFourDigits() {
        int[] array = {4, 4, 4};
        Assertions.assertFalse(MathUtils.filterFourAndOne(array));
    }

    @Test
    void shouldContainOneOrFour_whenGivenArrayWithOneAndFour() {
        int[] array = {1, 4, 1};
        Assertions.assertTrue(MathUtils.filterFourAndOne(array));
    }
}
