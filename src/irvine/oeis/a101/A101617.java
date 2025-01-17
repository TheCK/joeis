package irvine.oeis.a101;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A101617 The trinomial transform (A027907) gives powers of 3, while the trinomial transform of this sequence shift one place left gives powers of 5.
 * radtorec((-6*x^3-2*x^2+3*x+1)/(8*x^4-6*x^3-5*x^2+2*x+1))
 * @author Georg Fischer
 */
public class A101617 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A101617() {
    super(0, "[[0],[-288, 48],[152,-20],[276,-66],[-68, 12],[-82, 31],[4, 1],[6,-5],[0,-1]]", "[1, 1, 1, 3,-3, 19,-43, 139,-355, 995]", 0);
  }
}
