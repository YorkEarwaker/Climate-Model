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

// Math.random() uses util.Raondom under the hood? sqrt()
import java.lang.Math;

// threading ThreadLocalRandom, 
import java.util.concurrent.ThreadLocalRandom;

// crytographically strong number generator, complies with FIPS 140-2 standard
import java.security.SecureRandom;

// RandomGenerator and related interfaces, RandomGenerator, StreamableGenerator, JumpableGenerator, LeapableGenerator, ArbitrarilyJumpableGenerator, SplitableGenerator
import java.util.random.*;

/* 
 * java api implementations, random number generators
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
 * Stub
 * <todo: consider different gaussian solutions, >
 * sources
 * https://c-faq.com/lib/gaussian.html
 * https://www.baeldung.com/java-17-random-number-generators
 * others to list
 */
public class GaussianRandom implements Gaussian {
	
	//<todo: consider variable types, should these even be here, in an abstract class perhpas? >
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Gaussian Random"); // debug
	}
	
	/**
	* default-constructor
	*/ 
	public void gaussianRandom() {
		//super();
		System.out.println("Gaussian Random.constructor"); // debug
	}

	/**
	 * @param args
	 * Central Limit Theorem, law of large numbers
	 * mean 0 stddev 1, default, for value other than mean 0 and stddev 1 see todo
	 * <todo: add mean and stdev stadard deviation as parameters, multiply by stddev and add mean, >
	 * <todo: consider add singed bit value constant as parameter, 15 bit, 31 bit, 63 bit, >
	 * <todo: unit test, write JUnit test, >
	 */
	private double gaussianRandomCLT() {
		
		double gaussianRandom = 0;
		int i;
		
		int RAND_MAX = SIGNED_THIRTY_ONE_BIT; // should this be class level?
		Random random = new Random();  // should this be class level?
		
		for (i = 0; i < GAUSSIAN_RANDOM_NUMBERS_TO_SUM; i++ ) {
			// is nextInt correct? should probably be distributed int
			gaussianRandom += (double)random.nextInt(RAND_MAX) / RAND_MAX;
		}
		
		gaussianRandom -= GAUSSIAN_RANDOM_NUMBERS_TO_SUM / 2.0;
		gaussianRandom /= Math.sqrt(GAUSSIAN_RANDOM_NUMBERS_TO_SUM / 12.0 );
		
		System.out.println("Gaussian Random.gaussianRandomCLT gaussian random number is " + gaussianRandom); // debug
		return gaussianRandom;
		
	}
	
	/**
	 * @param args
	 * Abramowitz and Stegun
	 * mean 0 stddev 1, default, for value other than mean 0 and stddev 1 see todo
	 * <todo: add mean and stdev stadard deviation as parameters, multiply by stddev and add mean, >
	 * <todo: consider add singed bit value constant as parameter, 15 bit, 31 bit, 63 bit, >
	 * <todo: unit test, write JUnit test, >
	 */
	private double gaussianRandomAnS() {
		
		//static in original C++ code; U, V, phase
		double U, V;
		int phase = 0;
		double gaussianRandom = 0;
		
		int RAND_MAX = SIGNED_THIRTY_ONE_BIT; // should this be class level?
		Random random = new Random(); // should this be class level?
		
		if(phase == 0) {
			
			U = (random.nextInt() + 1) / (RAND_MAX + 2.);
			V = random.nextInt() / (RAND_MAX + 1.);
			gaussianRandom = Math.sqrt(-2 * Math.log(U)) * Math.sin(2 * PI * V);
			
		} else {
			// <todo: debug this from example, why does the Cpp example work? issue with phase likely!>
			//gaussianRandom = Math.sqrt(-2 * Math.log(U)) * Math.cos(2 * PI * V);
		}
		
		phase = 1 - phase;
		
		System.out.println("Gaussian Random.gaussianRandomAnS gaussian random number is " + gaussianRandom); // debug
		return gaussianRandom;
	}
	
	/**
	 * @param args
	 * Knuth originally Marasaglia
	 * mean 0 stddev 1, default, for value other than mean 0 and stddev 1 see todo
	 * <todo: add mean and stdev stadard deviation as parameters, multiply by stddev and add mean, >
	 * <todo: consider add singed bit value constant as parameter, 15 bit, 31 bit, 63 bit, >
	 * <todo: unit test, write JUnit test, >
	 */
	private double gaussianRandomKnM() {
		
		//static in original C++ code; U, V, phase
		double V1, V2, S;
		int phase = 0;
		double gaussianRandom = 0; // should this be initialized?
		
		int RAND_MAX = SIGNED_THIRTY_ONE_BIT; // should this be class level?
		Random random = new Random(); // should this be class level?
		
		if (phase == 0) {
			
			do {
				
				double U1 = (double)random.nextInt() / RAND_MAX;
				double U2 = (double)random.nextInt() / RAND_MAX;
				
				V1 = 2 * U1 - 1;
				V2 = 2 * U2 - 1;
				S = V1 * V2 + V2 * V2;
				
			} while (S >= 1 || S == 0);
			
			gaussianRandom = V1 * Math.sqrt(-2 * Math.log(S) / S);
			
		} else {
			// <todo: debug this from example, why does the Cpp example work? issue with phase likely!>
			// gaussianRandom = V2 * Math.sqrt(-2 * Math.log(S) / S);
		}
		
		phase = 1 - phase;
		
		System.out.println("Gaussian Random.gaussianRandomKnM gaussian random number is " + gaussianRandom); // debug
		return gaussianRandom;
	}
	
	/**
	 * return a random number
	 * wip
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
		//assertThat(randomNumber).isPositive.isLessThan(max); // comment out assert ?
		
		// approach 2
		randomNumber = random.nextInt(max - min + 1) + min; // find rational for this include in method comments.
 		
		System.out.println("Gaussian Random.javaUtilRandom random number is " + randomNumber ); // debug
		return randomNumber;
	}
	
	/**
	 * return a gaussian random number
	 * wip
	 */
	private double javaUtilRandomGaussian() {
		
		// <todo: fill out rest of body of method >
		// <todo: consider, mean, stdev and method parameters to pass in >
		Random random = new Random();
		double randomGaussian;
		int mean = 0;
		int stdev = 1;
		randomGaussian = random.nextGaussian(mean, stdev); // since Java 17
		
		System.out.println("Gaussian Random.javaUtilRandomGaussian gaussian random number is " + randomGaussian );
		return randomGaussian;
	}
	
	/**
	 * return a secure random number, cryptosecure
	 * wip
	 */
	 private int javaSecurityRandom() {
		 int randomSecure;
		 randomSecure = 0;
		 return randomSecure;
	 }

	/**
	 * return a thread safe random number, 
	 * wip
	 */
	 private int javaUtilConcurrentThreadLocalRandom() {
		 
		 int randomNumber = 0; // 
		 int min = 1;
		 int max = 10;
		 
		 System.out.println("Gaussian Random.javaUtilConcurrentThreadLocalRandom random number is " + randomNumber );
		 return randomNumber;
	 }
	
	/**
	 * output the available Random Generator factories and thier resepective properties
	 * utility helper method
	 * wip
	 */
	private static void printRandomGeneratorFactoriesAndProperties() {
		
		
		
	}
}