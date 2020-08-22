package irvine.oeis.a318;
// Generated by gen_seq4.pl holos [[0],[11340,-23328,11664],[-300,999,-999],[0,0,10]] [1,30] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A318496 Scaled g.f. T(v) = Sum_{n&gt;=0} a(n)*(v/16)^n satisfies 15*(189*v-80)*T + d/dv(4*v*(27*v-5)*(27*v-32)*T') = 0, and a(0)=1; sequence gives a(n).
 * @author Georg Fischer
 */
public class A318496 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A318496() {
    super(0, "[[0],[11340,-23328,11664],[-300,999,-999],[0,0,10]]", "[1,30]", 0);
  }
}
