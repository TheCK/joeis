package irvine.oeis.a082;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-4*x-sqrt(16*x^2-12*x+1))/(2*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A082301 G.f.: (1 - 4*x - sqrt(16*x^2 - 12*x + 1))/(2*x).
 * @author Georg Fischer
 */
public class A082301 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082301() {
    super(0, "[[0],[0,64,64],[-24,-56,-32],[-78,-50,-8],[12,7,1]]", "[1,5,30,205,1530]", 3);
  }
}
