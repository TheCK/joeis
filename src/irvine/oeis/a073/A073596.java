package irvine.oeis.a073;
// Generated by gen_seq4.pl binomx at 2020-09-22 19:46
// DO NOT EDIT here!

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a000.A000254;

/**
 * A073596 Expansion of exp(x)*log(1-x)/(x-1).
 * @author Georg Fischer
 */
public class A073596 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A073596() {
    super(new A000254(), 0);
  }
}
