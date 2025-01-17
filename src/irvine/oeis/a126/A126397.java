package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-10-05 14:59

import irvine.oeis.HolonomicRecurrence;
/**
 * A126397 Number of base 10 n-digit numbers with adjacent digits differing by two or less.
 * x^10-10*x^9+28*x^8-76*x^6+28*x^5+61*x^4-20*x^3-15*x^2+2*x+1
 * @author Georg Fischer
 */
public class A126397 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126397() {
    super(0, "[[0],[1],[2],[-15],[-20],[61],[28],[-76],[0],[28],[-10],[1]]", "[1, 10, 44, 200, 918, 4236, 19598, 90790, 420870, 1951636, 9051480]", 0);
  }
}
