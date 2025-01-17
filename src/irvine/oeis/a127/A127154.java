package irvine.oeis.a127;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2*(1+x))/(1+x+2*x^2+(1+x)*sqrt(1-4*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A127154 Number of Dyck paths of semilength n and having no UDUD's starting at level 0; here U=(1,1), D=(1,-1).
 * @author Georg Fischer
 */
public class A127154 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A127154() {
    super(0, "[[0],[12,20,8],[234,208,46],[768,544,100],[510,530,104],[-1404,-251,7],[-3960,-1262,-98],[-3636,-1068,-78],[-642,-167,-11],[342,83,5],[90,19,1]]", "[1,1,1,4,11,33,105,343,1148,3916,13563]", 9);
  }
}
