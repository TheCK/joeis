package irvine.oeis.a084;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A084376 G.f.: (1+x)/Product_{m&gt;0} (1 - x^m).
 * @author Georg Fischer
 */
public class A084376 extends EulerTransform {

  /** Construct the sequence. */
  public A084376() {
    super(new PaddingSequence(new long[] {2, 0}, new long[] {1}), 1);
  }
}
