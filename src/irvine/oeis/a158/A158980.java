package irvine.oeis.a158;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(2*x-49*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A158980 Numerator of Hermite(n, 1/7).
 * @author Georg Fischer
 */
public class A158980 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A158980() {
    super(0, "[[0],[98],[-2],[2,1]]", "[1,2,-94,-580]", 2);
    setGfType(1);
  }
}
