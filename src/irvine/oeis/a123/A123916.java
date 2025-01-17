package irvine.oeis.a123;
// Generated by gen_seq4.pl eulerxm/eulerx at 2022-04-17 21:58

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000048;
import irvine.oeis.transform.EulerTransform;

/**
 * A123916 Number of binary words whose (unique) decreasing Lyndon decomposition is into Lyndon words each with an odd number of 1's; EULER transform of A000048.
 * @author Georg Fischer
 */
public class A123916 extends EulerTransform {

  /** Construct the sequence. */
  public A123916() {
    super(new SkipSequence(new A000048(), 1), 1);
  }
}
