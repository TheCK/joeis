package irvine.oeis.a156;
// Generated by gen_seq4.pl holos [[0],[1],[0],[0],[0],[0],[0],[1]] [7,5,-1,1,-5,-7,-7] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=-a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A156536 Period length 12: repeat 7,5,-1,1,-5,-7,-7,-5,1,-1,5,7.
 * @author Georg Fischer
 */
public class A156536 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156536() {
    super(0, "[[0],[1],[0],[0],[0],[0],[0],[1]]", "[7,5,-1,1,-5,-7,-7]", 0);
  }
}
