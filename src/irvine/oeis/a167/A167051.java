package irvine.oeis.a167;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A167051 Start at 1, then add the first term (which is one here) plus 1 for the second term; then add the second term plus 2 for the third term; then add the third term to the sum of the first and second term; this gives the fourth term. Restart the sequence by adding 1 to the fourth term, etc. (From a sixth grade math extra credit assignment).
 * radtorec(x*(-6*x^5+3*x^3+4*x^2+2*x+1)/(1-x)/(x^2+x+1)/(-3*x^3+1))
 * @author Georg Fischer
 */
public class A167051 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A167051() {
    super(1, "[[0],[-198, 18],[0],[63,-9],[324,-36],[18,-6],[-81, 9],[-146, 22],[-24, 8],[17, 1],[20,-4],[6,-2],[1,-1]]", "[1, 2, 4, 7, 8, 10, 25, 26, 28, 79, 80, 82, 241]", 0);
  }
}
