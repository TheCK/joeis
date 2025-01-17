package irvine.oeis.a134;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A134415 Expansion of phi(x) / f(-x)^6 in powers of x where phi(), f() are Ramanujan theta functions..
 * @author Georg Fischer
 */
public class A134415 extends EulerTransform {

  /** Construct the sequence. */
  public A134415() {
    super(new PeriodicSequence(8, 3, 8, 5), 1);
  }
}
