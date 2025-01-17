package irvine.oeis.a129;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;


/**
 * A129924 Primes p such that p divides both A061354(p-3) and A061354(p-1).
 *
 * @author Georg Fischer
 */
public class A129924 extends BriefSequence {

  /** Construct the sequence. */
  public A129924() {
    super(Z.FIVE, new Z("13"), new Z("37"), new Z("463"));
  }
}
