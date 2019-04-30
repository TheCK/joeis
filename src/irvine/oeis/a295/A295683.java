package irvine.oeis.a295;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295683 <code>a(n) = a(n-1) + a(n-3) + a(n-4)</code>, where <code>a(0) = 2, a(1) = 1, a(2) = 0, a(3) = 1</code>.
 * @author Georg Fischer
 */
public class A295683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295683() {
    super(new long[] {1, 1, 0, 1}, new long[] {2, 1, 0, 1});
  }
}
