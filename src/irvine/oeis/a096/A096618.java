package irvine.oeis.a096;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;


/**
 * A096618 Least k such that H(k) &gt;= 10^n, where H(k) is the harmonic number Sum_{i=0..k} 1/i.
 *
 * @author Georg Fischer
 */
public class A096618 extends BriefSequence {

  /** Construct the sequence. */
  public A096618() {
    super(Z.ONE, new Z("12367"), new Z("15092688622113788323693563264538101449859497"));
  }
}
