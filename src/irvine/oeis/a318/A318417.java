package irvine.oeis.a318;
// Generated by gen_seq4.pl holos [[0],[384,-1024,512],[-12,48,-48],[0,0,1]] [1,12] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A318417 Scaled g.f. T(u) = Sum_{n&gt;=0} a(n)*(3*u/48)^n satisfies 3*(2*u-1)*T + d/du(4*u*(2*u-1)*(u-1)*T') = 0, and a(0)=1; sequence gives a(n).
 * @author Georg Fischer
 */
public class A318417 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A318417() {
    super(0, "[[0],[384,-1024,512],[-12,48,-48],[0,0,1]]", "[1,12]", 0);
  }
}
