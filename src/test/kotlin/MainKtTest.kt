import org.junit.Assert.*
import org.junit.Test

class MainKtTest {
    @Test
    fun calculateCommission_shouldBeZero() {
        // Arrange
        val cardType: String = "Vk Pay"
        val summ: Int = 1000_00
        val currentMonthSumm: Int = 100000_00

        // Act
        val result =  calculateCommission(
            cardType,
            summ,
            currentMonthSumm
        )

        // Assert
        assertEquals(0, result);
    }

    @Test
    fun calculateCommission_shouldBeZeroMaestro() {
        // Arrange
        val cardType: String = "Maestro"
        val summ: Int = 1000_00
        val currentMonthSumm: Int = 10000_00

        // Act
        val result =  calculateCommission(
            cardType,
            summ,
            currentMonthSumm
        )

        // Assert
        assertEquals(0, result);
    }

    @Test
    fun calculateCommission_shouldBe2120() {
        // Arrange
        val cardType: String = "Maestro"
        val summ: Int = 200_00
        val currentMonthSumm: Int = 200000_00

        // Act
        val result =  calculateCommission(
            cardType,
            summ,
            currentMonthSumm
        )

        // Assert
        assertEquals(2120, result);
    }

    @Test
    fun calculateCommission_shouldBe6000() {
        // Arrange
        val cardType: String = "Visa"
        val summ: Int = 8000_00
        val currentMonthSumm: Int = 100000_00

        // Act
        val result =  calculateCommission(
            cardType,
            summ,
            currentMonthSumm
        )

        // Assert
        assertEquals(6000, result);
    }

    @Test
    fun calculateCommission_shouldBe3500Minimum() {
        // Arrange
        val cardType: String = "Visa"
        val summ: Int = 500_00
        val currentMonthSumm: Int = 100000_00

        // Act
        val result =  calculateCommission(
            cardType,
            summ,
            currentMonthSumm
        )

        // Assert
        assertEquals(3500, result);
    }

    @Test
    fun calculateCommission_shouldBe2600() {
        // Arrange
        val cardType: String = "Mastercard"
        val summ: Int = 1000_00
        val currentMonthSumm: Int = 100000_00

        // Act
        val result =  calculateCommission(
            cardType,
            summ,
            currentMonthSumm
        )

        // Assert
        assertEquals(2600, result);
    }

    @Test
    fun calculateCommission_shouldBeUnknown() {
        // Arrange
        val cardType: String = "Unknown"
        val summ: Int = 1000_00
        val currentMonthSumm: Int = 100000_00

        // Act
        val result =  calculateCommission(
            cardType,
            summ,
            currentMonthSumm
        )

        // Assert
        assertEquals(0, result);
    }
}
