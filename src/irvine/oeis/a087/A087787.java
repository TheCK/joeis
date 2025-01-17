package irvine.oeis.a087;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A087787 a(n) = Sum_{k=0..n} (-1)^(n-k)*A000041(k).
 * @author Georg Fischer
 */
public class A087787 extends EulerTransform {

  /** Construct the sequence. */
  public A087787() {
    super(new PaddingSequence(new long[] {0, 2}, new long[] {1}), 1);
  }
}
