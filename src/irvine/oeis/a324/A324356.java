package irvine.oeis.a324;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1-exp(-x))/(1-x)^7
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A324356 Total number of occurrences of 6 in the (signed) displacement sets of all permutations of [n+6] divided by 6!.
 * @author Georg Fischer
 */
public class A324356 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A324356() {
    super(0, "[[0],[7,1],[47,13,1],[-30,-19,-2],[6,5,1]]", "[0,1,13,148,1707]", 3);
    setGfType(1);
  }
}
