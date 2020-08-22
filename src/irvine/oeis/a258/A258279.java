package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258279 Expansion of psi(q)^2 * chi(-q^3)^2 in powers of q where psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A258279 extends EulerTransform {

  /** Construct the sequence. */
  public A258279() {
    super(new PeriodicSequence(2, -2, 0, -2, 2, -2), 1);
  }
}
