package irvine.oeis.a062;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A062882 a(n) = (1 - 2*cos(Pi/9))^n + (1 + 2*cos(Pi*2/9))^n + (1 + 2*cos(Pi*4/9))^n. 
 * @author Georg Fischer
 */
public class A062882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062882() {
    super(new long[] {-3L, 0L, 3L}, new long[] {3L, 9L, 18L});
  } // constructor()
} // A062882
