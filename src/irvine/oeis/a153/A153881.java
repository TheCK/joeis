package irvine.oeis.a153;
// manually

import irvine.oeis.PaddingSequence;

/**
 * A153881 1 followed by -1, -1, -1, ... .
 * @author Georg Fischer
 */
public class A153881 extends PaddingSequence {

  /**
   * Construct the sequence
   */
  public A153881() {
    super(new long[] {1}, new long[] {-1});
  }
}
