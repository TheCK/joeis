package irvine.oeis.a158;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x-9*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A158968 Numerator of Hermite(n, 1/6).
 * @author Georg Fischer
 */
public class A158968 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A158968() {
    super(0, "[[0],[18],[-1],[2,1]]", "[1,1,-17,-53]", 2);
    setGfType(1);
  }
}
