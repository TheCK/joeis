package irvine.oeis.a109;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2*(1-x)^2)/(1+sqrt(1-8*x+16*x^2-8*x^3))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A109034 First differences of A109033.
 * @author Georg Fischer
 */
public class A109034 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A109034() {
    super(0, "[[0],[-12,12,24],[-96,-208,-80],[504,456,96],[-588,-351,-51],[240,108,12],[-30,-11,-1]]", "[1,0,1,4,16,66,280]", 5);
  }
}
