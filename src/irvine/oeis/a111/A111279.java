package irvine.oeis.a111;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (3-13*x+2*x^2+(5*x-1)*sqrt(1-4*x))/(2*(1-4*x-x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A111279 Number of permutations avoiding the patterns {3241,3421,4321}; number of weak sorting class based on 3241.
 * @author Georg Fischer
 */
public class A111279 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111279() {
    super(1, "[[0],[0,10,20],[330,408,183],[567,937,305],[-2937,-2272,-428],[2313,1287,177],[-645,-284,-31],[60,22,2]]", "[1,2,6,21,79,309,1237,5026]", 6);
  }
}
