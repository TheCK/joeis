package irvine.oeis.a324;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1-exp(-x))/(1-x)^10
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A324359 Total number of occurrences of 9 in the (signed) displacement sets of all permutations of [n+9] divided by 9!.
 * @author Georg Fischer
 */
public class A324359 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A324359() {
    super(0, "[[0],[10,1],[98,19,1],[-42,-25,-2],[6,5,1]]", "[0,1,19,301,4659]", 3);
    setGfType(1);
  }
}
