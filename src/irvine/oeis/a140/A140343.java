package irvine.oeis.a140;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A140343 a(n)=4a(n-1)-7a(n-2)+6a(n-3)-3a(n-4), n&gt;4.
 * @author Georg Fischer
 */
public class A140343 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A140343() {
    super(0, new long[] {0, 0, 0, 0, 1},
      new long[] {1, -4, 7, -6, 3});
  }
}
