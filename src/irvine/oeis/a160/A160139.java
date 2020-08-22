package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(22*x-729*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160139 Numerator of Hermite(n, 11/27).
 * @author Georg Fischer
 */
public class A160139 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160139() {
    super(0, "[[0],[1458],[-22],[2,1]]", "[1,22,-974,-85580]", 2);
    setGfType(1);
  }
}
