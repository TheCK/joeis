package irvine.oeis.a328;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A328660 Numbers k such that (10^k + 7^k)/17 is prime.
 * @author Georg Fischer
 */
public class A328660 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(17);
  
  /** Construct the sequence. */
  public A328660() {
    super("[[0],[-70],[17],[-1]]", "[2, 17]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
