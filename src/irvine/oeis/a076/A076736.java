package irvine.oeis.a076;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A076736 Let u(1)=u(2)=u(3)=2, u(n)=(1+u(n-1)u(n-2))/u(n-3) then a(n) is the denominator of u(n).
 * @author Georg Fischer
 */
public class A076736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076736() {
    super(new long[] {2L, 0L}, new long[] {2L, 1L}, 1L, 1L, 1L);
  } // constructor()
} // A076736
