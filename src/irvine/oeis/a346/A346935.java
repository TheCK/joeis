package irvine.oeis.a346;
// Generated by gen_seq4.pl deris 1 A002293 at 2021-10-28 23:42
// DO NOT EDIT here!

import irvine.oeis.transform.MobiusTransformSequence;
import irvine.oeis.a002.A002293;

/**
 * A346935 a(n) = Sum_{d|n} mu(n/d) * binomial(4*d,d) / (3*d+1).
 *
 * @author Georg Fischer
 */
public class A346935 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A346935() {
    super(new A002293(), 1);
    next();
  }
}
