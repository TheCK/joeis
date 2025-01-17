package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128639 Expansion of (1/3) * (c(q)^2 / c(q^2)) / (b(q)^2 / b(q^2)) in powers of q where b(), c() are cubic AGM theta functions.
 * @author Georg Fischer
 */
public class A128639 extends EulerTransform {

  /** Construct the sequence. */
  public A128639() {
    super(new PeriodicSequence(8, 4, 0, 4, 8, 0), 1);
  }
}
