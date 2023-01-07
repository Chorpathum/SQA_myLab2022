package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.EnumSet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import main.GradeEnum;
import main.GradeEnum.GradeType;



class NormalBoundaryValueTest {
	
	GradeEnum gradeEnum;
	
	@DisplayName("TS1 : TC01-05 , score_sectionA = 15 , score_sectionB = 15 , score_final = {0,1,20,39,40}")
	@ParameterizedTest
	@ValueSource(strings = {"15,15,0,Fail", "15,15,1,Fail", "15,15,20,Pass", "15,15,39,Good", "15,15,40,Excellent"})
	//@EnumSource(value = GradeType.class , names = {"Fail", "Fail", "Pass", "Good", "Excellent"})
	void test_GraderTest1(String GradeTypes) {
		String [] split = GradeTypes.split(",");
		String GradeType = split[3];
		int SecA = Integer.parseInt(split[0]) , SecB = Integer.parseInt(split[1]) , Sfinal = Integer.parseInt(split[2]);
		gradeEnum = new GradeEnum(SecA,SecB,Sfinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(GradeType,result);
	}
	
	@DisplayName("TS2 : TC06-09 , score_sectionA = {0,1,15,29,30} , score_sectionB = 15 , score_final = 20")
	@ParameterizedTest
	@ValueSource(strings = {"0,15,20,Fail", "1,15,20,Fail", "29,15,20,Good", "30,15,20,Good"})
	void test_GraderTest2(String GradeTypes) {
		String [] split = GradeTypes.split(",");
		String GradeType = split[3];
		int SecA = Integer.parseInt(split[0]) , SecB = Integer.parseInt(split[1]) , Sfinal = Integer.parseInt(split[2]);
		gradeEnum = new GradeEnum(SecA,SecB,Sfinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(GradeType,result);
	}
	
	@DisplayName("TS3 : TC10-13 , score_sectionA = 15 , score_sectionB = {0,1,15,29,30} , score_final = 20")
	@ParameterizedTest
	@ValueSource(strings = {"15,0,20,Fail", "15,1,20,Fail", "15,29,20,Good", "15,30,20,Good"})
	void test_GraderTest3(String GradeTypes) {
		String [] split = GradeTypes.split(",");
		String GradeType = split[3];
		int SecA = Integer.parseInt(split[0]) , SecB = Integer.parseInt(split[1]) , Sfinal = Integer.parseInt(split[2]);
		gradeEnum = new GradeEnum(SecA,SecB,Sfinal);
		String result = gradeEnum.showResult(gradeEnum.classify());
		assertEquals(GradeType,result);
	
	}

}
	
