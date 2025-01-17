package irvine.oeis.a123;
// Generated by gen_seq4.pl holos [[0],[9,57,136,152,80,16],[-45,-78,-44,-8],[2,1]] [1,3,63,3225] 2 at 2020-03-14 22:45
// Recurrence: (n+1)*(2*n+3)^2*(2*n+1)^2*a[n+0]-(2*n+5)*(2*n+3)^2*a[n+1]+(n+2)*a[n+2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A123687 E.g.f.: (1-x^2)^(-1/2)*exp(x^2/(1-x^2))*BesselI(0,x^2/(x^2-1)) (since this is an even function, we do not give the intercalating 0's).
 * @author Georg Fischer
 */
public class A123687 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123687() {
    super(0, "[[0],[9,57,136,152,80,16],[-45,-78,-44,-8],[2,1]]", "[1,3,63,3225]", 2);
  }
}
