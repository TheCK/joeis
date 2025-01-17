package irvine.oeis.a088;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: sinh(x/(1-x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A088313 Number of "sets of lists" (cf. A000262) with an odd number of lists.
 * @author Georg Fischer
 */
public class A088313 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A088313() {
    super(0, "[[0],[0,1,1],[-6,-10,-4],[23,24,6],[-30,-22,-4],[12,7,1]]", "[0,1,2,7,36,241]", 4);
    setGfType(1);
  }
}
