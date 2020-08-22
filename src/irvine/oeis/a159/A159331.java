package irvine.oeis.a159;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {1L, -2L, 3L} new long[] {293L, 680L, 1581L} new long[] {2L, 4L, 9L, 23L, 55L, 126L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A159331 Transform of the finite sequence (1, 0, -1, 0, 1, 0, -1) by the T_{1,1} transform (see link).
 * @author Georg Fischer
 */
public class A159331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159331() {
    super(new long[] {1L, -2L, 3L}, new long[] {293L, 680L, 1581L}, 2L, 4L, 9L, 23L, 55L, 126L);
  }
}
