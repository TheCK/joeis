package irvine.oeis.a099;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;


/**
 * A099105 If n = Product p_i^r_i let Uphi(n) = Product(p_i^r_i - 1). Call (x,y) a square unitary phi amicable pair if Uphi(x)^2 = Uphi(y)^2 = x^2-y^2. Sequence gives x values for square unitary phi amicable pairs.
 *
 * @author Georg Fischer
 */
public class A099105 extends BriefSequence {

  /** Construct the sequence. */
  public A099105() {
    super(new Z("204"), new Z("2856"), new Z("16536"));
  }
}
