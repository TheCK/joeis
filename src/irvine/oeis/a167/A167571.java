package irvine.oeis.a167;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 1/(4*sqrt(x))*log((1-3*x+2*x^(3/2))/(1-3*x-2*x^(3/2)))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A167571 The row sums of triangle A167569.
 * @author Georg Fischer
 */
public class A167571 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A167571() {
    super(1, "[[0],[4,8],[-15,-10],[5,2]]", "[1,6,54,680]", 2);
    setGfType(1);
  }
}
