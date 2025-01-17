package irvine.oeis.a331;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A331323 a(n) = [x^n] (1 - 2*x)/(1 - 8*x + 4*x^2)^(3/2).
 * Recurrence: a(n)=(10*n*a(n-1)+20*(1-n)*a(n-2)+8*(n-1)*a(n-3))/n
 * @author Georg Fischer
 */
public class A331323 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331323() {
    super(0, "[[0],[-8, 8],[20,-20],[0, 10],[0,-1]]", "1, 10, 90, 772, 6430, 52524, 423220, 3375880, 26720118", 0);
  }
}
