package irvine.oeis.a123;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A123655 Expansion of q * psi(q^8) / phi(-q) in powers of q where psi(), phi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A123655 extends EulerTransform {

  /** Construct the sequence. */
  public A123655() {
    super(new PeriodicSequence(2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 0), 1);
  }
}
