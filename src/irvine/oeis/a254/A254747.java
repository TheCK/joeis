package irvine.oeis.a254;
// Generated by gen_seq4.pl holos [[0],[186,-155,31],[-330,359,-97],[162,-255,105],[-18,53,-43],[0,-2,4]] [1,2,8,47,312] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A254747 a(n) = (1 + Sum_{j=0..n} (C(n,j)*C(3*j-1,j))) / 2.
 * @author Georg Fischer
 */
public class A254747 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A254747() {
    super(0, "[[0],[186,-155,31],[-330,359,-97],[162,-255,105],[-18,53,-43],[0,-2,4]]", "[1,2,8,47,312]", 0);
  }
}
