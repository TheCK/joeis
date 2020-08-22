package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(40*x-529*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159946 Numerator of Hermite(n, 20/23).
 * @author Georg Fischer
 */
public class A159946 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159946() {
    super(0, "[[0],[1058],[-40],[2,1]]", "[1,40,542,-62960]", 2);
    setGfType(1);
  }
}
