package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-10-05 14:59

import irvine.oeis.HolonomicRecurrence;
/**
 * A126370 Number of base 16 n-digit numbers with adjacent digits differing by one or less.
 * x^16-16*x^15+105*x^14-350*x^13+546*x^12-1287*x^10+1430*x^9+495*x^8-1672*x^7+385*x^6+714*x^5-280*x^4-120*x^3+45*x^2+6*x-1
 * @author Georg Fischer
 */
public class A126370 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126370() {
    super(0, "[[0],[-1],[6],[45],[-120],[-280],[714],[385],[-1672],[495],[1430],[-1287],[0],[546],[-350],[105],[-16],[1]]", "[1, 16, 46, 134, 392, 1150, 3380, 9948, 29310, 86430, 255044, 753040, 2224514, 6574100, 19435570, 57477542, 170028792]", 0);
  }
}
