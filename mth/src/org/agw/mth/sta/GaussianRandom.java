/**
 * Mathematics
 */
package org.agw.mth.sta;

// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/random/package-summary.html
// https://www.baeldung.com/java-17-random-number-generators

// <todo: comment out import statement that are not used. keep them after commenting out for research. consider moving some of this to a wiki page or readme.md page. >

// suitable for simple applications but not secure, Random, 
import java.util.Random;

// for parallel streams, fork/join types of coding, SplittableRandom
import java.util.SplittableRandom;

// Math.random() uses util.Raondom under the hood?
import java.lang.Math;

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
	private double gaussianRandomSimple() {
		
		double gr = 0;
		int i;
		
		for (i = 0; i < GAUSSIAN_RANDOM_NUMBERS_TO_SUM; i++ ) {
			
		}
		
	}
	
	/**
	 * return a random number
	 * <todo: consider passing in nextInt value as int parameter, could generics be used to return a number var type, based on parameter passed in for return type? >
	 */
	private int javaUtilRandom() {
		
		Random random = new Random();
		int randomNumber = 0; // <todo: instatiate int here or use other value nullable, >
		int min = 1; // consider passing in min max values as parameters
		int max = 10;
		
		
		// <todo: conditional statement to select approach1 or approach2>
		// approach 1
		randomNumber = random.nextInt(max);
		assertThat(randomNumber).isPositive.isLessThan(max); // comment out assert ?
		
		// approach 2
		randomNumber = random.nextInt(max - min + 1) + min; // find rational for this include in method comments.
 		
		System.out.println("Gaussian Random.javaUtilRandom random number is " + randomNumber );
		return randomNumber;
	}
	
	/**
	 * return a gaussian random number
	 * 
	 */
	private double javaUtilRandomGaussian() {
		
		// <todo: fill out rest of body of method >
		// <todo: consider, mean, stdev and method parameters to pass in >
		mean = foo;
		stdev = bha;
		randomNumber = Random.nextGaussian(mean, stdev); // since Java 17
		
		System.out.println("Gaussian Random.javaUtilRandomGaussian random number is " + randomNumber );
		
	}
	
	/**
	 * return a secure random number, cryptosecure
	 */
	 private int javaSecurityRandom() {
		 
	 }

	/**
	 * return a thread safe random number, 
	 */
	 private int javaUtilConcurrentThreadLocalRandom() {
		 
		 int randomNumber = 0; // 
		 int min = 1;
		 int max = 10;
		 
		 System.out.println("Gaussian Random.javaUtilConcurrentThreadLocalRandom random number is " + randomNumber );
		 
	 }
	
	/**
	 * output the available Random Generator factories and thier resepective properties
	 * utility helper method
	 */
	private static void printRandomGeneratorFactoriesAndProperties() {
		
		
		
	}
}