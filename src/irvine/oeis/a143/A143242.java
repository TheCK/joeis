package irvine.oeis.a143;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A143242 Expansion of Product_{k&gt;0} (1 - x^(9*k)) * (1-x^(9*k-2)) * (1-x^(9*k-7)) / ((1-x^(9*k-1)) * (1-x^(9*k-6)) * (1-x^(9*k-8))).
 * @author Georg Fischer
 */
public class A143242 extends EulerTransform {

  /** Construct the sequence. */
  public A143242() {
    super(new PeriodicSequence(1, -1, 1, 0, 0, 0, -1, 1, -1), 1);
  }
}
