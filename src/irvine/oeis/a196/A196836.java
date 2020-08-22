package irvine.oeis.a196;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1-exp(4*x))/(2*(exp(-x)-1))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A196836 (1^n + 2^n +3^n + 4^n)/2.
 * @author Georg Fischer
 */
public class A196836 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A196836() {
    super(0, "[[0],[24],[-50,-50],[70,105,35],[-60,-110,-60,-10],[24,50,35,10,1]]", "[2,5,15,50,177,650]", 4);
    setGfType(1);
  }
}
