package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(36*x-361*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159656 Numerator of Hermite(n, 18/19).
 * @author Georg Fischer
 */
public class A159656 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159656() {
    super(0, "[[0],[722],[-36],[2,1]]", "[1,36,574,-31320]", 2);
    setGfType(1);
  }
}
