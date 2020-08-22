package irvine.oeis.a087;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {-2L, 1L, 2L} new long[] {5L, 9L, 20L} new long[] {1L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A087940 a(n)=sum(k=0,n,binomial(n+(-1)^k,k)).
 * @author Georg Fischer
 */
public class A087940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087940() {
    super(new long[] {-2L, 1L, 2L}, new long[] {5L, 9L, 20L}, 1L);
  }
}
