package irvine.oeis.a202;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 1/2+1/(2*(1-x)^2)+x+log(1-x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A202365 G.f.: Sum_{n&gt;=0} (n-x)^n * x^n / (1 + n*x - x^2)^n.
 * @author Georg Fischer
 */
public class A202365 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A202365() {
    super(0, "[[0],[0,-1,1],[1,-2,-3],[2,7,3],[-18,-12,-2],[12,7,1]]", "[1,1,2,10,54,336]", 4);
    setGfType(1);
  }
}
