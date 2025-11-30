package utilMath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UtilMathsTest {

	@ParameterizedTest
	@CsvSource({"1, 0" , "1, 1", "120, 5"})
	void factTestSucess(int res, int nb) {
		assertEquals(res , UtilMaths.fact(nb));
	}
	
	@Test
	void factExceptionTest() {
		assertThrows (IllegalArgumentException.class, () -> {UtilMaths.fact(-1); });
	}
	
	@ParameterizedTest
	@CsvSource({"10, 5, 2" , "20, 6, 3", "1, 10, 0"})
	void combTestSucess(int res, int n, int p) {
		assertEquals(res, UtilMaths.comb(n, p));
	}
	
	@Test
	void combExceptionTest()  {
		assertThrows (IllegalArgumentException.class, () -> {UtilMaths.comb(2, 5); });
	}
}
