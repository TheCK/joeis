package irvine.oeis.a168;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A168225 a(n) = n^4*(n^7 + 1)/2.
 * @author Georg Fischer
 */
public class A168225 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A168225() {
    super(0, new long[] {0, 1, 1020, 76296, 1101804, 4868994, 7862124, 4869120, 1101684, 76341, 
      1016},
      new long[] {1, -12, 66, -220, 495, -792, 924, -792, 495, -220, 66, -12, 1});
  }
}
