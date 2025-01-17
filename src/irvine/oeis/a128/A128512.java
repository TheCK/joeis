package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128512 Expansion of q^(-1) * (chi(-q) * chi(-q^9) / chi(-q^3)^2)^6 in powers of q where chi() is a Ramanujan theta function.
 * Somos formula: <code>e18z=ecalc([1, 1;6, 2;9, 1;2,-1;3,-2;18,-1}],[1, 6]);</code>
 * @author Georg Fischer
 */
public class A128512 extends EulerTransform {

  /** Construct the sequence. */
  public A128512() {
    super(new PeriodicSequence(-6, 0, 6, 0, -6, 0, -6, 0, 0, 0, -6, 0, -6, 0, 6, 0, -6, 0), 1);
  }
}
