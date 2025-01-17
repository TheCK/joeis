package irvine.oeis.a095;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A095813 Expansion of q * chi(-q) / chi(-q^5)^5 in powers of q where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A095813 extends EulerTransform {

  /** Construct the sequence. */
  public A095813() {
    super(new PeriodicSequence(-1, 0, -1, 0, 4, 0, -1, 0, -1, 0), 1);
  }
}
