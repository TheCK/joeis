package irvine.oeis.a286;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A286952 Expansion of Product_{j&gt;=1} (1 - x^j)/(1 - x^(3*j))^3.
 * @author Georg Fischer
 */
public class A286952 extends EulerTransform {

  /** Construct the sequence. */
  public A286952() {
    super(new PaddingSequence(new long[] {  }, new long[] {-1, -1, 2}), 1);
  }
}
