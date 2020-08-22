package irvine.oeis.a308;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A308400 Expansion of 1 / Sum_{k=-oo..oo} (-x)^(k*(6*k + 1)).
 * @author Georg Fischer
 */
public class A308400 extends EulerTransform {

  /** Construct the sequence. */
  public A308400() {
    super(new PeriodicSequence(0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1), 1);
  }
}
