package irvine.oeis.a075;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A075156 Binomial transform of pentanacci numbers A074048: a(n) = Sum_{k=0..n} binomial(n,k)*A074048(k). 
 * @author Georg Fischer
 */
public class A075156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075156() {
    super(new long[] {2L, -7L, 14L, -13L, 6L}, new long[] {5L, 6L, 10L, 24L, 70L});
  } // constructor()
} // A075156
