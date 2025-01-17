package irvine.oeis.a088;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1-exp(-x^2))/(2*(1-x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A088506 Number of permutations in the symmetric group S_n that have odd number of transpositions in their cycle decomposition.
 * @author Georg Fischer
 */
public class A088506 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A088506() {
    super(0, "[[0],[2],[-2],[3,1],[-3,-1]]", "[0,0,1,3,6]", 3);
    setGfType(1);
  }
}
