package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-10-05 14:59

import irvine.oeis.HolonomicRecurrence;
/**
 * A126402 Number of base 15 n-digit numbers with adjacent digits differing by two or less.
 * x^15-15*x^14+78*x^13-130*x^12-176*x^11+682*x^10-44*x^9-1128*x^8+330*x^7+818*x^6-249*x^5-261*x^4+62*x^3+30*x^2-3*x-1
 * @author Georg Fischer
 */
public class A126402 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126402() {
    super(0, "[[0],[-1],[-3],[30],[62],[-261],[-249],[818],[330],[-1128],[-44],[682],[-176],[-130],[78],[-15],[1]]", "[1, 15, 69, 325, 1543, 7361, 35223, 168899, 811105, 3899407, 18761375, 90319881, 434998065, 2095690739, 10098729091, 48672013183]", 0);
  }
}
