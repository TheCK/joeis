package irvine.oeis.a171;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A171445 Sequence whose G.f is given by f(z)=(1+z)^(24)/(1-z).
 * @author Georg Fischer
 */
public class A171445 extends EulerTransform {

  /** Construct the sequence. */
  public A171445() {
    super(new PaddingSequence(new long[] {25, -24}, new long[] {0}), 1);
  }
}
