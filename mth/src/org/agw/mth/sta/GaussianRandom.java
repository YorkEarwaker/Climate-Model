/**
 * Mathematics
 */
package org.agw.mth.sta;

// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/random/package-summary.html
// https://www.baeldung.com/java-17-random-number-generators

// suitable for simple applications but not secure, Random, 
import java.util.Random;

// for parallel streams, fork/join types of coding, SplittableRandom
import java.util.SplittableRandom;

// threading ThreadLocalRandom, 
import java.util.concurrent.ThreadLocalRandom;

// crytographically strong number generator, complies with FIPS 140-2 standard
import java.security.SecureRandom;

// RandomGenerator and related interfaces, RandomGenerator, StreamableGenerator, JumpableGenerator, LeapableGenerator, ArbitrarilyJumpableGenerator, SplitableGenerator
import java.util.random.*;

/* 
 * java api implmentations, random number generators
 *
 * Xoroshiro group
 *  Xoroshiro128PlusPlus
 * Xoshiro group
 *  Xoshiro256PlusPlus
 * LXM group
 *  L128X1024MixRandom
 *  L128X128MixRandom
 *  L128X256MixRandom
 *  L32X64MixRandom
 *  L64X1024MixRandom
 *  L64X128MixRandom
 *  L64X128StarStarRandom
 *  L64X256MixRandom 
*/

/**
 * GaussianRandom
 * Stubb
 * <todo: consider different gaussian solutions, >
 */
public class GaussianRandom extends Gaussian {
	
	
	//<todo: consider variable types, should these even be here, in an abstract class perhpas? >
	//<todo: implement these https://c-faq.com/lib/gaussian.html >
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Gaussian Random"); // debug
	}
	
	/**
	* default-constructor
	*/ 
	public double gaussianRandom() {
		super();
		System.out.println("Gaussian Random.constructor"); // debug
	}

	/**
	 * @param args
	 * 
	 */
	private double gaussianRandSimple() {
		
		double gr = 0;
		int i;
		
		for (i = 0; i < GAUSSIAN_RANDOM_NUMBERS_TO_SUM; ) {
			
		}
		
	}
	
	/**
	 * return a random number
	 * <todo: consider passing in nextInt value as int parameter, could generics be used to return a number var type, based on parameter passed in for return type? >
	 */
	private int javaUtilRandom() {
		
		Random random = new Random();
		int number = random.nextInt(10);
		assertThat(number).isPositive.isLessThan(10);
		return int;
	}
	
	/**
	 * output the available Random Generator factories and thier resepective properties
	 */
	private static void printRandomGeneratorFactoriesAndProperties() {
		
		
		
	}
}