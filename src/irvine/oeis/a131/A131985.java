package irvine.oeis.a131;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A131985 Expansion of (eta(q^3)^2 / (eta(q) * eta(q^9)))^6 in powers of q.
 * Somos formula: <code>e9A=ecalc([3, 2;1,-1;9,-1}],[1, 6]);</code>
 * @author Georg Fischer
 */
public class A131985 extends EulerTransform {

  /** Construct the sequence. */
  public A131985() {
    super(new PeriodicSequence(6, 6, -6, 6, 6, -6, 6, 6, 0), 1);
  }
}
