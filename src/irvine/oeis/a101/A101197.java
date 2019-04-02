package irvine.oeis.a101;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A101197 Lengths of successive words (starting with a) under the substitution: {a -&gt; aab, b -&gt; aac, c -&gt; b}. 
 * @author Georg Fischer
 */
public class A101197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101197() {
    super(new long[] {-2L, 3L, 2L}, new long[] {1L, 3L, 9L});
  } // constructor()
} // A101197
