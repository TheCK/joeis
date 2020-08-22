package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132212 Expansion of f(-x, -x^7) / f(-x, -x) in powers of q where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A132212 extends EulerTransform {

  /** Construct the sequence. */
  public A132212() {
    super(new PeriodicSequence(1, 1, 2, 1, 2, 1, 1, 0), 1);
  }
}
