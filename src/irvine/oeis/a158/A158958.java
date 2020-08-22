package irvine.oeis.a158;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(3*x-4*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A158958 Numerator of Hermite(n, 3/4).
 * @author Georg Fischer
 */
public class A158958 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A158958() {
    super(0, "[[0],[8],[-3],[2,1]]", "[1,3,1,-45]", 2);
    setGfType(1);
  }
}
