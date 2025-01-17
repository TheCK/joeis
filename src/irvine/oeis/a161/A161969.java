package irvine.oeis.a161;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A161969 Expansion of f(q)^8 in powers of q where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A161969 extends EulerTransform {

  /** Construct the sequence. */
  public A161969() {
    super(new PeriodicSequence(8, -16, 8, -8), 1);
  }
}
