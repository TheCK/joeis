package irvine.oeis.a345;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A345448 Number of tilings of a 2 X n rectangle with dominos and long L-shaped 4-minos.
 * radtorec(1/(-2*x^4-4*x^3-x^2-x+1))
 * @author Georg Fischer
 */
public class A345448 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A345448() {
    super(0, "[[0],[2],[4],[1],[1],[-1]]", "[1, 1, 2, 7, 15, 32, 79]", 0);
  }
}
