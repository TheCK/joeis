package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-10-05 14:59

import irvine.oeis.HolonomicRecurrence;
/**
 * A126508 Number of base 13 n-digit numbers with adjacent digits differing by four or less.
 * x^13-13*x^12+36*x^11+60*x^10-190*x^9-108*x^8+292*x^7+72*x^6-168*x^5-16*x^4+32*x^3
 * @author Georg Fischer
 */
public class A126508 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126508() {
    super(0, "[[0],[0],[0],[0],[32],[-16],[-168],[72],[292],[-108],[-190],[60],[36],[-13],[1]]", "[1, 13, 97, 753, 5897, 46287, 363509, 2855151, 22426249, 176152007, 1383628073, 10868042671, 85365689641, 670525630751]", 0);
  }
}
