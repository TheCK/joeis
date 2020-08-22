package irvine.oeis.a138;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A138559 Expansion of phi(x) * chi(-x) in powers of x where phi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A138559 extends EulerTransform {

  /** Construct the sequence. */
  public A138559() {
    super(new PeriodicSequence(1, -3, 1, -1), 1);
  }
}
