package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128640 Expansion of (1/3) * (c(q^2)^2 / c(q)) / (b(q^2)^2 / b(q)) in powers of q where b(), c() are cubic AGM theta functions.
 * @author Georg Fischer
 */
public class A128640 extends EulerTransform {

  /** Construct the sequence. */
  public A128640() {
    super(new PeriodicSequence(-4, 4, 0, 4, -4, 0), 1);
  }
}
