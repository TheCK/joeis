package irvine.oeis.a292;
// Generated by gen_seq4.pl wraptr2 at 2021-10-17 19:42

import irvine.oeis.a002.A002865;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A292508 Number A(n,k) of partitions of n with k kinds of 1; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A292508 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A292508() {
    super("1", new A002865());
  }
}
