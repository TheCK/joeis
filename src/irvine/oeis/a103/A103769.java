package irvine.oeis.a103;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: ((3*x+1-(21*x^2-10*x+1)^(1/2))/(2*x*(3*x-4)*(7*x-1)))^(1/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A103769 Trinomial transform of central binomial coefficients A001405.
 * @author Georg Fischer
 */
public class A103769 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A103769() {
    super(0, "[[0],[1134,1701,567],[-4464,-4536,-1152],[4602,3351,615],[-1536,-862,-122],[144,68,8]]", "[1,4,21,123,757,4788]", 4);
  }
}
