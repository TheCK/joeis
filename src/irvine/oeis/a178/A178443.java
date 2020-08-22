package irvine.oeis.a178;
// Generated by gen_seq4.pl finifull at 2020-01-25 12:34
// DO NOT EDIT here!

import irvine.oeis.FiniteSequence;
import irvine.math.z.Z;

/**
 * A178443 Two numbers k and l we call equivalent if they have the same vector of exponents with positive components in prime power factorization. Let a(1)=1, a(2)=3. If n&gt;=3 is prime, then a(n) is the smallest prime greater than a(n-1); otherwise, a(n)&gt;a(n-1) is the smallest number equivalent to n such that prime power factorization of a(n) contains only primes which already appeared in the sequence.
 * @author Georg Fischer
 */
public class A178443 extends FiniteSequence {

  /** Construct the sequence. */
  public A178443() {
    super(Z.ONE, new Z("3"), new Z("5"), new Z("9"), new Z("11"), new Z("15"), new Z("17"), new Z("27"), new Z("121"), new Z("187"), new Z("191"), new Z("275"), new Z("277"), new Z("573"), new Z("831"), new Z("14641"), new Z("14653"), new Z("109443"), new Z("109451"), new Z("131877"), new Z("161183"), new Z("249101"), new Z("249103"), new Z("254221"), new Z("214710409"), new Z("1603785503"), new Z("3146151623077"), new Z("23500268975459"), new Z("23500268975497"), new Z("352504034632455"), new Z("352504034632459"), new Z("675511501766876508493"), new Z("8283939628810696270871857123"));
  }
}
