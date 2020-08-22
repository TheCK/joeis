package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258040 Expansion of f(x) / f(-x) in powers of x where f() is the g.f. for A007325.
 * @author Georg Fischer
 */
public class A258040 extends EulerTransform {

  /** Construct the sequence. */
  public A258040() {
    super(new PeriodicSequence(-2, 1, 2, 0, 0, -1, 2, 0, -2, 0, -2, 0, 2, -1, 0, 0, 2, 1, -2, 0), 1);
  }
}
