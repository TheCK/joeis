package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128145 Expansion of psi(q^3)* phi(-q^3)* chi^2(-q^3)/( psi(-q)* phi(-q^18)) in powers of q where phi(), psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A128145 extends EulerTransform {

  /** Construct the sequence. */
  public A128145() {
    super(new PeriodicSequence(1, 0, -2, 1, 1, -2, 1, 1, -2, 0, 1, -1, 1, 0, -2, 1, 1, 0, 1, 1, -2, 0, 1, -1, 1, 0, -2, 1, 1, -2, 1, 1, -2, 0, 1, 0), 1);
  }
}
