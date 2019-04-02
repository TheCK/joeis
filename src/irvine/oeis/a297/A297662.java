package irvine.oeis.a297;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A297662 Number of chordless cycles in the complete tripartite graph K_n,n,n. 
 * @author Georg Fischer
 */
public class A297662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A297662() {
    super(new long[] {1L, -5L, 10L, -10L, 5L}, new long[] {0L, 3L, 27L, 108L, 300L});
  } // constructor()
} // A297662
