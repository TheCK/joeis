package irvine.oeis.a134;
// Generated by gen_seq4.pl holos [[0],[12,-6],[-20,37],[-3,-12],[1,1]] [1,5,27,151] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A134425 Number of paths of length n in the first quadrant, starting at the origin and consisting of 2 kinds of upsteps U=(1,1) (U1 and U2), 3 kinds of flatsteps F=(1,0) (F1, F2 and F3) and 1 kind of downsteps D=(1,-1).
 * @author Georg Fischer
 */
public class A134425 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A134425() {
    super(0, "[[0],[12,-6],[-20,37],[-3,-12],[1,1]]", "[1,5,27,151]", 0);
  }
}
