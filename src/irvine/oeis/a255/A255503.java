package irvine.oeis.a255;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;


/**
 * A255503 a(1) = 3; a(n) = read the next a(n-1) base-4 digits of Pi.
 *
 * @author Georg Fischer
 */
public class A255503 extends BriefSequence {

  /** Construct the sequence. */
  public A255503() {
    super(Z.THREE, Z.NINE, new Z("16234"));
  }
}
