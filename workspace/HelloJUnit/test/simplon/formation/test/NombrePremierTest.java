package simplon.formation.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import simplon.formation.parametre.NombrePremier;

@RunWith(Parameterized.class)
public class NombrePremierTest {
	private int inputNumber;
	private Boolean expectedResult;
	private NombrePremier nombrePremier;
	
	@Before
	public void initialize(){
		nombrePremier = new NombrePremier();
	}

	public NombrePremierTest(int inputNumber, Boolean expectedResult) {
		super();
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection nombrePremiers(){
		return Arrays.asList(new Object [][]{
			{2, true},
			{6, false},
			{19, true},
			{22, false},
			{23, true}
		});
	}
	
	@Test
	public void testNombrePremier() {
		System.out.println("Nombre paramétré est: " + inputNumber);
		assertEquals(expectedResult,
				nombrePremier.validate(inputNumber));
	}

}
