package irvine.oeis.a323;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A323830 a(0) = 1; thereafter a(n) is obtained by doubling a(n-1) and repeatedly deleting any string of identical digits.
 * @author Georg Fischer
 */
public class A323830 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A323830() {
    super(0, new long[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 
      16384, 32768, 636, 1272, 25, 50},
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, -1});
  }
}
