package irvine.oeis.a322;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A322598 a(n) is the number of unlabeled rank-3 graded lattices with 3 coatoms and n atoms. 
 * @author Georg Fischer
 */
public class A322598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A322598() {
    super(new long[] {1L, -1L, -1L, 0L, 1L, 1L}, new long[] {1L, 3L, 8L, 13L, 20L, 29L});
  } // constructor()
} // A322598
