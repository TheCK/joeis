package irvine.oeis.a347;
// Generated by gen_seq4.pl deris at 2021-10-28 23:42

import irvine.oeis.transform.BinomialTransformSequence;
import irvine.oeis.a008.A008548;

/**
 * A347013 E.g.f.: exp(x) / (1 - 5 * x)^(1/5).
 *
 * @author Georg Fischer
 */
public class A347013 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A347013() {
    super(new A008548(), 0);
  }
}
