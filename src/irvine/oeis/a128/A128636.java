package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128636 Expansion of 3 * (b(q^2)^2 / b(q)) / (c(q)^2 / c(q^2)) in powers of q where b(), c() are cubic AGM theta functions.
 * @author Georg Fischer
 */
public class A128636 extends EulerTransform {

  /** Construct the sequence. */
  public A128636() {
    super(new PeriodicSequence(1, -4, 6, -4, 1, 0), 1);
  }
}
