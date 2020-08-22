package irvine.oeis.a324;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1-exp(-x))/(1-x)^8
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A324357 Total number of occurrences of 7 in the (signed) displacement sets of all permutations of [n+7] divided by 7!.
 * @author Georg Fischer
 */
public class A324357 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A324357() {
    super(0, "[[0],[8,1],[62,15,1],[-34,-21,-2],[6,5,1]]", "[0,1,15,193,2479]", 3);
    setGfType(1);
  }
}
