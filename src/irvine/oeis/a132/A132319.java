package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132319 Expansion of q^-1 * (chi(-q) * chi(-q^7))^3 in powers of q where chi() is a Ramanujan theta function.
 * Somos formula: <code>e14B=ecalc([1, 1;7, 1;2,-1;14,-1}],[1, 3]);</code>
 * @author Georg Fischer
 */
public class A132319 extends EulerTransform {

  /** Construct the sequence. */
  public A132319() {
    super(new PeriodicSequence(-3, 0, -3, 0, -3, 0, -6, 0, -3, 0, -3, 0, -3, 0), 1);
  }
}
