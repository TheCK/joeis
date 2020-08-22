package irvine.oeis.a254;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 1/(1-12*x)^(3/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A254381 a(n) = 3^n*(2*n + 1)!/n!.
 * @author Georg Fischer
 */
public class A254381 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A254381() {
    super(0, "[[0],[18,12],[-1,-1]]", "[1,18,540]", 1);
    setGfType(1);
  }
}
