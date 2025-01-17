package irvine.oeis.a093;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A093709 Characteristic function of squares or twice squares.
 * @author Georg Fischer
 */
public class A093709 extends EulerTransform {

  /** Construct the sequence. */
  public A093709() {
    super(new PeriodicSequence(1, 0, -1, 1, -1, 0, 1, -1), 1);
  }
}
