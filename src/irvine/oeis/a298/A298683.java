package irvine.oeis.a298;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A298683 Start with the square tile of the Shield tiling and recursively apply the substitution rule. a(n) is the number of squares after n iterations. 
 * @author Georg Fischer
 */
public class A298683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A298683() {
    super(new long[] {2L, -9L, 5L, 3L}, new long[] {1L, 1L, 1L, 13L});
  } // constructor()
} // A298683
