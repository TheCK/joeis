package irvine.oeis.a173;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (sqrt((1-2*x)*(1-2*x-4*x^2+4*x^3))-2*x^2+4*x-1)/(2*x*(1-4*x+3*x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A173993 Sequence whose Hankel transform is the Somos (4) sequence.
 * @author Georg Fischer
 */
public class A173993 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A173993() {
    super(0, "[[0],[480,720,240],[-6280,-5460,-1160],[24240,14880,2280],[-41828,-19518,-2284],[33388,12030,1082],[-3668,-258,56],[-16218,-5109,-399],[14908,3894,254],[-6212,-1428,-82],[1300,270,14],[-110,-21,-1]]", "[1,2,6,17,50,146,430,1267,3746,11091,32900,97716]", 10);
  }
}
