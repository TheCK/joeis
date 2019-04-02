package irvine.oeis.a075;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A075115 Binomial transform of A073145: a(n)=Sum(binomial(n,k)*A073145(k),(k=0,..,n)). 
 * @author Georg Fischer
 */
public class A075115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075115() {
    super(new long[] {2L, -2L, 2L}, new long[] {3L, 2L, 0L});
  } // constructor()
} // A075115
