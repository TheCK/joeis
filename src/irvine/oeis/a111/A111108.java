package irvine.oeis.a111;
// Generated by gen_seq4.pl holos [[0],[-2],[-5],[0],[1]] [0,5,3,25] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A111108 a(n) = A001333(n) - (-2)^(n-1), n &gt; 0.
 * @author Georg Fischer
 */
public class A111108 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111108() {
    super(1, "[[0],[-2],[-5],[0],[1]]", "[0,5,3,25]", 0);
  }
}
