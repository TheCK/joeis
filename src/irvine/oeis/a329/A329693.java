package irvine.oeis.a329;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A329693 Number of excursions of length n with Motzkin-steps avoiding the consecutive steps UH, HH, HD and DU.
 * radtorec(1/2*(1+x)*(1+x-x^2-x^4-(1+x)*(x^6-2*x^5+x^4-2*x^3-2*x^2+1)^(1/2))/x^3)
 * @author Georg Fischer
 */
public class A329693 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329693() {
    super(0, "[[0],[-448, 60,-2],[448,-60, 2],[0],[-292, 87,-5],[1700,-303, 13],[1416,-324, 18],[1352,-315, 19],[2372,-687, 49],[1368,-549, 51],[162,-129, 21],[-2,-24, 14],[-4,-3, 13],[2, 24,-2],[20, 0,-8],[0,-9,-3]]", "1, 1, 1, 2, 2, 3, 4, 6, 9, 13, 21, 31, 50, 78, 123, 200, 315, 517, 831, 1355", 0);
  }
}
