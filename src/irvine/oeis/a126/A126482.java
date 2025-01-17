package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-10-05 14:59

import irvine.oeis.HolonomicRecurrence;
/**
 * A126482 Number of base 14 n-digit numbers with adjacent digits differing by three or less.
 * x^14-14*x^13+55*x^12-299*x^10+154*x^9+551*x^8-276*x^7-429*x^6+162*x^5+148*x^4-32*x^3-21*x^2+2*x+1
 * @author Georg Fischer
 */
public class A126482 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126482() {
    super(0, "[[0],[1],[2],[-21],[-32],[148],[162],[-429],[-276],[551],[154],[-299],[0],[55],[-14],[1]]", "[1, 14, 86, 546, 3502, 22582, 146000, 945166, 6122674, 39674426, 257126690, 1666543060, 10801947152, 70015705526, 453829551820]", 0);
  }
}
