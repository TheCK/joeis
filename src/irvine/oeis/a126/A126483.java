package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-10-05 14:59

import irvine.oeis.HolonomicRecurrence;
/**
 * A126483 Number of base 15 n-digit numbers with adjacent digits differing by three or less.
 * x^15-15*x^14+66*x^13-22*x^12-379*x^11+331*x^10+792*x^9-648*x^8-732*x^7+482*x^6+309*x^5-153*x^4-53*x^3+21*x^2+3*x-1
 * @author Georg Fischer
 */
public class A126483 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126483() {
    super(0, "[[0],[-1],[3],[21],[-53],[-153],[309],[482],[-732],[-648],[792],[331],[-379],[-22],[66],[-15],[1]]", "[1, 15, 93, 595, 3845, 24983, 162805, 1062635, 6941843, 45369865, 296598577, 1939229883, 12680054343, 82914396455, 542185539797, 3545445779213]", 0);
  }
}
