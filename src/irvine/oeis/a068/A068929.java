package irvine.oeis.a068;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(1-x^18+x^17+x^16+x^15+x^13-x^12-2*x^11-2*x^8-4*x^7-3*x^6-x^5-x^4+2*x^2+3*x)/((x^5+x^3-1)*(x^10+x^6-1))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A068929 Number of incongruent ways to tile a 4 X n room with 1x2 Tatami mats. At most 3 Tatami mats may meet at a point.
 * @author Georg Fischer
 */
public class A068929 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A068929() {
    super(1, "[0,1,3,2,0,-1,-1,-3,-4,-2,0,0,-2,-1,1,0,1,1,1,-1]", "[1,0,0,-1,0,-1,-1,0,0,1,-1,1,0,1,0,1]");
  }
}
