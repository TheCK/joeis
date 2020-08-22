package irvine.oeis.a115;
// Generated by gen_seq4.pl trigf 1, 1, 1, 0, 1, 0, 0, 0, 0, 0 1, -1, -1, 0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A115281 Correlation triangle for the sequence 2-0^n.
 * @author Georg Fischer
 */
public class A115281 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A115281() {
    super(0, new long[] {1, 1, 1, 0, 1, 0, 0, 0, 0, 0}, new long[] {1, -1, -1, 0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
