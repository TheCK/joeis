package irvine.oeis.a306;
// Generated by gen_seq4.pl holos [[0],[1],[1],[-4],[-4],[1]] [4,24,109,524,2504] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A306610 a(n) = (2*cos(Pi/15))^(-n) + (2*cos(7*Pi/15))^(-n) + (2*cos(11*Pi/15))^(-n) + (2*cos(13*Pi/15))^(-n), for n &gt;= 1.
 * @author Georg Fischer
 */
public class A306610 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A306610() {
    super(1, "[[0],[1],[1],[-4],[-4],[1]]", "[4,24,109,524,2504]", 0);
  }
}
