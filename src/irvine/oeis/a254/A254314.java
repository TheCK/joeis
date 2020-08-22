package irvine.oeis.a254;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (3-6*x+x^2-sqrt((1-4*x+x^2)^2-4*x^3))/(2*(1-2*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A254314 Hankel transform of a(n) is A006720(n). Hankel transform of a(n+1) is A006720(n+2).
 * @author Georg Fischer
 */
public class A254314 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A254314() {
    super(0, "[[0],[-24,0,24],[-132,-558,-342],[3344,4011,1129],[-13396,-9840,-1772],[22380,11943,1581],[-18946,-8004,-842],[8512,2997,263],[-1918,-582,-44],[168,45,3]]", "[1,1,2,5,14,43,143,507,1887,7279]", 8);
  }
}
