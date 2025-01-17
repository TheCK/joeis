package irvine.oeis.a252;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;


/**
 * A252802 Primes whose trajectory under the map x -&gt; A039951(x) enters the cycle {3, 11, 71}.
 *
 * @author Georg Fischer
 */
public class A252802 extends BriefSequence {

  /** Construct the sequence. */
  public A252802() {
    super(Z.THREE, new Z("11"), new Z("19"));
  }
}
