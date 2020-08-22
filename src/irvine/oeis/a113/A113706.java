package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113706 Expansion of Product_{k&gt;0} (1-x^(3k))/(1-x^(3k-2)).
 * @author Georg Fischer
 */
public class A113706 extends EulerTransform {

  /** Construct the sequence. */
  public A113706() {
    super(new PeriodicSequence(1, 0, -1), 1);
  }
}
