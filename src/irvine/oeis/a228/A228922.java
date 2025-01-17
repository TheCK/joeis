package irvine.oeis.a228;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A228922 Numbers n such that (19^n + 2^n)/21 is prime.
 * @author Georg Fischer
 */
public class A228922 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(21);
  
  /** Construct the sequence. */
  public A228922() {
    super("[[0],[-38],[21],[-1]]", "[2, 21]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
