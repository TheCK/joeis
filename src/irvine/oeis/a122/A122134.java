package irvine.oeis.a122;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A122134 Expansion of Sum_{k&gt;=0} x^(k^2+k)/((1-x)(1-x^2)...(1-x^(2k))).
 * @author Georg Fischer
 */
public class A122134 extends EulerTransform {

  /** Construct the sequence. */
  public A122134() {
    super(new PeriodicSequence(0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0), 1);
  }
}
