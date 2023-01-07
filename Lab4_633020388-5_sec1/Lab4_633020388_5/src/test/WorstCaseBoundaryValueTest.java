package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WorstCaseBoundaryValueTest {
	
	GradeEnumEdit gradeEnum;

	@DisplayName("TS001")
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/TS001.csv", numLinesToSkip = 1)
	void TS001(int sectionA, int sectionB, int scoreFinal, String expect) {
		gradeEnum = new GradeEnumEdit(sectionA,sectionB,scoreFinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(expect, result);
	}

	@DisplayName("TS002")
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/TS002.csv", numLinesToSkip = 1)
	void TS002(int sectionA, int sectionB, int scoreFinal, String expect) {
		gradeEnum = new GradeEnumEdit(sectionA,sectionB,scoreFinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(expect, result);
	}

	@DisplayName("TS003")
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/TS003.csv", numLinesToSkip = 1)
	void TS003(int sectionA, int sectionB, int scoreFinal, String expect) {
		gradeEnum = new GradeEnumEdit(sectionA,sectionB,scoreFinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(expect, result);
	}

	@DisplayName("TS004")
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/TS004.csv", numLinesToSkip = 1)
	void TS004(int sectionA, int sectionB, int scoreFinal, String expect) {
		gradeEnum = new GradeEnumEdit(sectionA,sectionB,scoreFinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(expect, result);
	}

	@DisplayName("TS005")
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/TS005.csv", numLinesToSkip = 1)
	void TS005(int sectionA, int sectionB, int scoreFinal, String expect) {
		gradeEnum = new GradeEnumEdit(sectionA,sectionB,scoreFinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(expect, result);
	}

}
