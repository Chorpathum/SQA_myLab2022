package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import test.GradeEnumEdit;

class RobustnessTest {

	GradeEnumEdit gradeEnum;
	
	@DisplayName("TS1 : TC01-07 , score_sectionA = 15 , score_sectionB = 15 , score_final = {-1,0,1,20,39,40,41}")
	@ParameterizedTest
	@CsvSource({
	    "15,15,-1,Invalid",
	    "15,15,0,Fail",
	    "15,15,1,Fail",
	    "15,15,20,Pass",
	    "15,15,39,Good",
	    "15,15,40,Excellent",
	    "15,15,41,Invalid"
	})
	void test_GraderTest1(int SecA, int SecB, int Sfinal,String GradeTypes) {
		gradeEnum = new GradeEnumEdit(SecA,SecB,Sfinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(GradeTypes,result);
	}
	@DisplayName("TS2 : TC08-013 , score_sectionA = {-1,0,1,15,29,30,31} , score_sectionB = 15 , score_final = 20")
	@ParameterizedTest
	@CsvSource({
	    "-1,15,20,Invalid",
	    "0,15,20,Fail",
	    "1,15,20,Fail",
	    "29,15,20,Good",
	    "30,15,20,Good",
	    "31,15,20,Invalid"
	})
	void test_GraderTest2(int SecA, int SecB, int Sfinal,String GradeTypes) {
		gradeEnum = new GradeEnumEdit(SecA,SecB,Sfinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(GradeTypes,result);
	}
	@DisplayName("TS3 : TC14-19 , score_sectionA = 15 , score_sectionB = {-1,0,1,15,29,30,31} , score_final = 20")
	@ParameterizedTest
	@CsvSource({
	    "15,15,-1,Invalid",
	    "15,15,0,Fail",
	    "15,15,1,Fail",
	    "15,15,20,Pass",
	    "15,15,39,Good",
	    "15,15,40,Excellent",
	    "15,15,41,Invalid"
	})
	void test_GraderTest3(int SecA, int SecB, int Sfinal,String GradeTypes) {
		gradeEnum = new GradeEnumEdit(SecA,SecB,Sfinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(GradeTypes,result);
	}
}
