import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CalculadoraTest {

    @Test
    fun solicitarNum() {
            // Arrange
            val input = "5"
            System.setIn(input.byteInputStream())

            // Act
            val result = solicitarNum()

            // Assert
            assertEquals(5.0,result,0.0)
    }
}