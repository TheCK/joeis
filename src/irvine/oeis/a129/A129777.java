package irvine.oeis.a129;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A129777 Number of freely-braided hexagon-avoiding permutations in S_n; the freely-braided hexagon-avoiding permutations are those that avoid 3421, 4231, 4312, 4321, 46718235, 46781235, 56718234 and 56781234. 
 * @author Georg Fischer
 */
public class A129777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129777() {
    super(new long[] {1L, -1L, -8L, 1L, 3L, -9L, 6L}, new long[] {1L, 2L, 6L, 20L, 71L, 260L, 971L});
  } // constructor()
} // A129777
