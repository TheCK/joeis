package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(26*x-729*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160140 Numerator of Hermite(n, 13/27).
 * @author Georg Fischer
 */
public class A160140 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160140() {
    super(0, "[[0],[1458],[-26],[2,1]]", "[1,26,-782,-96148]", 2);
    setGfType(1);
  }
}
