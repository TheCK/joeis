package irvine.oeis.a188;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x^2-sqrt(1-4*x-6*x^2+x^4))/(2*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A188314 Expansion of (1/(1-x))*c(x/((1-x)*(1-x^2))) where c(x) is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A188314 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A188314() {
    super(0, "[[0],[-2,0,2],[0,9,3],[-14,-24,-10],[-176,-135,-25],[-392,-186,-22],[-376,-129,-11],[-112,-30,-2],[56,15,1]]", "[1,2,5,16,57,219,883,3687,15803]", 7);
  }
}
