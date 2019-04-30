package irvine.oeis.a068;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A068377 Engel expansion of <code>sinh(1)</code>.
 * @author Georg Fischer
 */
public class A068377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068377() {
    super(new long[] {1, -3, 3}, new long[] {6, 20, 42}, new long[] {1});
  }
}
